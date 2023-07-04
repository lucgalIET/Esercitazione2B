package com.example.biblioteca.mapper;
import com.example.biblioteca.dto.LibroDTO;
import com.example.biblioteca.entities.LibroEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface LibroMapper {
    LibroMapper LIBRO_MAPPER = Mappers.getMapper(LibroMapper.class);
    @Mapping(source = "idLibro",target="idLibro")
    @Mapping(source = "titolo",target="titolo")
    @Mapping(source = "prezzo",target="prezzo")
    @Mapping(source = "pagine",target="pagine")
    LibroDTO entitytoDto(LibroEntity libroEntity);

    @Mapping(source = "idLibro",target="idLibro")
    @Mapping(source = "titolo",target="titolo")
    @Mapping(source = "prezzo",target="prezzo")
    @Mapping(source = "pagine",target="pagine")
    LibroEntity dtoToEntity (LibroDTO libroDTO);


}
