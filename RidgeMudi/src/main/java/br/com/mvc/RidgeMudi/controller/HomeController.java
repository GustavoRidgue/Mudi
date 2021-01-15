package br.com.mvc.RidgeMudi.controller;

import br.com.mvc.RidgeMudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();

        pedido.setNomeProduto("Tagima guitar Baby Mahogany");
        pedido.setValorNegociado(new BigDecimal("881.90"));
        pedido.setDataDaEntrega(LocalDate.of(2021, 2, 9));
        pedido.setDescricao("Electro acoustic steel guitar");
        pedido.setUrlImagem("https://www.akusticamusical.com.br/uploads/imagens/5de54f5052c44_gg.jpg");
        pedido.setUrlProduto("https://www.gubisom.com.br/violao-tagima-baby-mahogany-eletro-acustico-cordas-de-aco");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}

//                "Tagima guitar Baby Mahogany",
//                new BigDecimal("881.40"),
//                LocalDate.of(2021, 2, 15),
//                "https://www.gubisom.com.br/violao-tagima-baby-mahogany-eletro-acustico-cordas-de-aco",
//                "Electro acoustic steel guitar"