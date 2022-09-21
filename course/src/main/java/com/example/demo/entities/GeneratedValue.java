package com.example.demo.entities;

import javax.persistence.GenerationType;

public @interface GeneratedValue {

	GenerationType strategy();

}
