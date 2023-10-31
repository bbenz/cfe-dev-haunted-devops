import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Override
    protected String getKeyspaceName() {
        return "your_keyspace";
    }

    @Override
    protected String getContactPoints() {
        return "cassandra-service";
    }

    @Override
    protected int getPort() {
        return 9042;
    }
}