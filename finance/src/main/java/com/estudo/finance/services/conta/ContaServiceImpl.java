package com.estudo.finance.services.conta;

import com.estudo.finance.domain.conta.ContaEntity;
import com.estudo.finance.domain.conta.TipoConta;
import com.estudo.finance.dtos.conta.ContaDTO;
import com.estudo.finance.repositories.banco.BancoRepository;
import com.estudo.finance.repositories.conta.ContaRepository;
import com.estudo.finance.repositories.usuario.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaServiceImpl implements ContaService {

    private BancoRepository bancoRepository;
    private UsuarioRepository usuarioRepository;
    private ContaRepository contaRepository;

    @Override
    public ContaEntity novaConta(ContaDTO dto) {
        ContaEntity contaEntity = dto.toEntity();

        setEntitys(contaEntity, dto);

        contaEntity = contaRepository.save(contaEntity);
        return contaEntity;
    }

    @Override
    public ContaEntity getConta(Long id) {
        return contaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Conta não encontrada"));
    }

    @Override
    public List<ContaEntity> getContasByUsuario(Long idUsuario) {
        return contaRepository.findAllByUsuarioId(idUsuario);
    }

    private void setEntitys(ContaEntity contaEntity, ContaDTO dto) {
        var usuario = usuarioRepository.findById(dto.idUsuario())
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));

        var banco = bancoRepository.findById(dto.idBanco())
                .orElseThrow(() -> new IllegalArgumentException("Banco não encontrado"));


        contaEntity.setUsuario(usuario);
        contaEntity.setBanco(banco);
        contaEntity.setTipoConta(TipoConta.values()[dto.tipoConta().intValue()]);
    }
}
