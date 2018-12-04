package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Component;
import pl.javastart.config.DatabaseDatasource;

import javax.xml.crypto.Data;
import java.util.List;

@Component
public class NamesRepository {
    private DatabaseDatasource ds;

    @Autowired
    public NamesRepository(DatabaseDatasource ds){
        this.ds = ds;
    }
    public List<String>getAll(){
        return ds.getDatabase();
    }
}
