package br.com.datacoper.pedido.api;

import br.com.datacoper.pedido.application.service.PessoaService;
import br.com.datacoper.pedido.domain.model.Pessoa;
import gumga.framework.application.GumgaService;
import gumga.framework.presentation.GumgaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMethod;
import gumga.framework.presentation.RestResponse;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.validation.BindingResult;
import gumga.framework.application.GumgaTempFileService;
import gumga.framework.domain.domains.GumgaImage;
import gumga.framework.presentation.GumgaAPI;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaAPI extends GumgaAPI<Pessoa, Long> {


    @Autowired
    public PessoaAPI(GumgaService<Pessoa, Long> service) {
        super(service);
    }

    @Override
    public Pessoa load(@PathVariable Long id) {
        return ((PessoaService)service).loadPessoaFat(id);
    }


}
