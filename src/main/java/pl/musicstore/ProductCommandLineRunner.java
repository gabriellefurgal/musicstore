/*package pl.musicstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
class ProductCommandLineRunner implements CommandLineRunner
{
    @Override
    public void run(String... args ) throws Exception
    {
        for (Product p : this.productRepository.findAll())
            System.out.println(p.toString());
    }

    @Autowired
    ProductRepository productRepository;
}*/