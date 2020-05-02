package com.johnmedlock.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class BinarySearchImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm; // This is a dependency of BinarySearchImpl

    public int binarySearch(int[] numbers, int numbersToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @PreDestroy
    public void perDestroy() {
        logger.info("perDestroy");
    }
}
