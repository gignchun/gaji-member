
package GAJI.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="Product", url="http://Product:8080")
public interface ProductService {

    @RequestMapping(method= RequestMethod.DELETE, path="/products")
    public void delete(@RequestBody Product product);

}