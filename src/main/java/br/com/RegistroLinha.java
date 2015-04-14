package br.com;

import java.util.Date;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Record(minOccurs = 0, name = "individual", order = 3)
@Fields({
    @Field(length = 2, at = 0, name = "codigoLinha", literal = "03", rid = true)
})
public class RegistroLinha {

    @Field(length = 7, at = 2)
    private Integer id;

    @Field(length = 6, at = 9)
    private String nome;

    @Field(length = 6, at = 15)
    private String obs;

    @Field(length = 6, at = 30)
    private String test;

    @Field(length = 8, at = 36, format = "yyyyMMdd")
    private Date data;

    @Field(length = 3, at = 44, align = Align.RIGHT, padding = '0')
    private String numero;

    @Field(length = 2, at = 47, align = Align.LEFT, padding = '0')
    private String texto;

    private String texto2;
    
    public RegistroLinha() {
    }

    public RegistroLinha(Integer id, String nome, String obs, String test, Date data, String numero, String texto, String text2) {
        this.id = id;
        this.nome = nome;
        this.obs = obs;
        this.test = test;
        this.data = data;
        this.numero = numero;
        this.texto = texto;
        this.texto2 = texto2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }   

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }
    
    
}