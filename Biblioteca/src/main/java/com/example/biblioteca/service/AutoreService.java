package com.example.biblioteca.service;
import com.example.biblioteca.dto.AutoreDTO;
import com.example.biblioteca.entities.AutoreEntity;
import com.example.biblioteca.mapper.AutoreMapper;
import com.example.biblioteca.repository.AutoreRepository;
import com.example.biblioteca.repository.AutoreRepositoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {
    @Autowired
    private AutoreRepository autoreRepository;
    @Autowired
    AutoreRepositoryDTO autoreRepositoryDTO;

    public AutoreEntity saveAutore(AutoreEntity autore) {
        return autoreRepository.save(autore);
    }
    public AutoreDTO saveAutoreDTO(AutoreDTO autoreDTO){
        return autoreRepositoryDTO.save(autoreDTO);
}

    public List<AutoreEntity> getAllAutore() {
        return autoreRepository.findAll();
    }

    public List<AutoreDTO> getAllAutoreDTO(){return autoreRepositoryDTO.findAll();}

    public Optional<AutoreEntity> getAutoreById(Long id) {
        return autoreRepository.findById(id);
    }
    public Optional<AutoreDTO> getAutoreByIdDTO(Long id){return autoreRepositoryDTO.findById(id);}

    public AutoreEntity updateEditore(AutoreEntity autore) {

        Optional<AutoreEntity> autoreEntity = getAutoreById(autore.getIdAutore());
        if (autoreEntity.isEmpty()) throw new NullPointerException();

        return autoreRepository.save(autore);
    }

    public void deleteAutore(Long id) {
        autoreRepository.deleteById(id);
    }

    public void deleteAutoreDTO(Long id){
        autoreRepositoryDTO.deleteById(id);
    }


    public List<AutoreDTO> getAutoreInfo() {
        List<AutoreEntity> autoreEntityList = autoreRepository.getAutoreInfo();
        List<AutoreDTO> autoreDTOList = new ArrayList<>();
        for (int i = 0; i < autoreEntityList.size(); i++) {
            autoreDTOList.add(AutoreMapper.AUTORE_MAPPER.entityToDto(autoreEntityList.get(i)));
        }
        return autoreDTOList;
    }










}


