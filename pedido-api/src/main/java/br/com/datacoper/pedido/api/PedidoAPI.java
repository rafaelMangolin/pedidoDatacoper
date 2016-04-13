package br.com.datacoper.pedido.api;

import br.com.datacoper.pedido.application.service.PedidoService;
import br.com.datacoper.pedido.domain.model.Pedido;
import br.com.datacoper.pedido.domain.model.UnidadeMed;
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
@RequestMapping("/api/pedido")
public class PedidoAPI extends GumgaAPI<Pedido, Long> {


    @Autowired
    public PedidoAPI(GumgaService<Pedido, Long> service) {
        super(service);
    }

    @Override
    public Pedido load(@PathVariable Long id) {
        return ((PedidoService)service).loadPedidoFat(id);
    }


}
