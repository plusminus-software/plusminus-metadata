package software.plusminus.metadata;

public interface MetadataService {

    <T> Class<T> findType(String typeName);

}
