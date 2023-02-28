package br.com.abril.processamento.model;

public class CadastroClientes {
	public CadastroClientes(Integer id, String razaoSocial, String nacionalidade, String identificacao,
			String inscricaoEstadual, String orgaoDoGoverno, String email, String contato, String cep, String endereco,
			String cidade, String uf, String pais) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nacionalidade = nacionalidade;
		this.identificacao = identificacao;
		this.inscricaoEstadual = inscricaoEstadual;
		this.orgaoDoGoverno = orgaoDoGoverno;
		this.email = email;
		this.contato = contato;
		this.cep = cep;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
		this.pais = pais;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CadastroClientes [id=" + id + ", razaoSocial=" + razaoSocial + ", nacionalidade=" + nacionalidade
				+ ", identificacao=" + identificacao + ", inscricaoEstadual=" + inscricaoEstadual + ", orgaoDoGoverno="
				+ orgaoDoGoverno + ", email=" + email + ", contato=" + contato + ", cep=" + cep + ", endereco="
				+ endereco + ", cidade=" + cidade + ", uf=" + uf + ", pais=" + pais + "]";
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getOrgaoDoGoverno() {
		return orgaoDoGoverno;
	}
	public void setOrgaoDoGoverno(String orgaoDoGoverno) {
		this.orgaoDoGoverno = orgaoDoGoverno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	private Integer id;
	private String razaoSocial;
	private String nacionalidade;
	private String identificacao;
	private String inscricaoEstadual;
	private String orgaoDoGoverno;
	private String email;
	private String contato;
	private String cep;
	private String endereco;
	private String cidade;
	private String uf;
	private String pais;
}
