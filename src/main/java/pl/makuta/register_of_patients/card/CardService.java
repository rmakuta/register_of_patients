package pl.makuta.register_of_patients.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CardService {

    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<Card> findAll(){
        return cardRepository.findAll();
    }

    public void add(Card card){
        cardRepository.save(card);
    }

    public void delete(Card card){
        cardRepository.delete(card);
    }

    public Card findById(Long id){
        return cardRepository.findCardById(id);
    }

    public void update(Card card){
        cardRepository.save(card);
    }
}
