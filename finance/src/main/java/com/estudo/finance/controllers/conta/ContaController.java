package com.estudo.finance.controllers.conta;

import com.estudo.finance.domain.conta.ContaEntity;
import com.estudo.finance.dtos.conta.ContaDTO;
import com.estudo.finance.services.conta.ContaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController(value = "/conta")
public class ContaController {

    private ContaService contaService;

    @PostMapping
    public ResponseEntity<?> createCount(@RequestBody ContaDTO dto) {
        ContaEntity conta = contaService.novaConta(dto);

        return ResponseEntity.ok(conta);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getCount(@PathVariable Long id) {
        ContaEntity conta = contaService.getConta(id);

        return ResponseEntity.ok(conta);
    }

    @GetMapping(path = "/usuario/{idUsuario}")
    public ResponseEntity<?> getCountByUser(@PathVariable Long idUsuario) {
        List<ContaEntity> contas = contaService.getContasByUsuario(idUsuario);

        return ResponseEntity.ok(contas);
    }
}
