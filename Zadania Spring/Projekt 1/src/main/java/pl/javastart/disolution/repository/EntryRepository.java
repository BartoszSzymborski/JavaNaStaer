package pl.javastart.disolution.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.javastart.disolution.model.Entry;
import pl.javastart.disolution.service.FileService;

import java.io.IOException;
import java.util.*;
@Repository
public class EntryRepository {

    private List<Entry> entries;

    @Autowired
    EntryRepository(FileService fileService){
        try {
            this.entries = fileService.readAllFile();
        }catch (IOException e){
            entries = new ArrayList<>();
        }
    }
    public List<Entry>getAll(){
        return entries;
    }
    public Set<Entry>getRadnomEntries(int number){
        Random random = new Random();
        Set<Entry>randomEntries = new HashSet<>();
        while (randomEntries.size()<number&&randomEntries.size()<entries.size()){
            randomEntries.add(entries.get(random.nextInt(entries.size())));
        }
        return randomEntries;
    }
    public void add(Entry entry){
        entries.add(entry);
    }
    public int size(){
        return entries.size();
    }
    public boolean isEmpty(){
        return entries.isEmpty();
    }
}
