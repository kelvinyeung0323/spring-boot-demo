package com.taurus.demo.jpa.entity.relationship.unidirectional.one2one;

import javax.persistence.*;

/**
 * Created by Kelvin Yeung on 2018/8/26.
 */
@Entity(name = "PhoneUniOne2One")
public class Phone {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "`number`")
    private String number;

    @OneToOne
    @JoinColumn(name = "details_id")
    private PhoneDetails details;


}
