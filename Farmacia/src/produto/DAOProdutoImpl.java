package produto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ResourceManager;

public class DAOProdutoImpl implements dao.DAOProduto {

	@Override
	public void cadastraMedicamento(Medicamento m) {
		try {
			Connection con = ResourceManager.getConnection();
			String sql = "INSERT INTO med VALUES (?, ?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, m.getNome());
			pst.setString(2, m.getFabricante());
//			pst.setDate(3, (Date) m.getValidade());
			pst.setDouble(3, m.getValorUnitario());
			pst.setString(4, m.getDescricao());
			pst.executeUpdate();
			ResourceManager.close(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Medicamento buscaMedicamento(String nome) {
		try {
			Connection con = ResourceManager.getConnection();
			String sql = "SELECT * FROM medicamento WHERE nome = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, nome);
			ResultSet rs = pst.executeQuery();
			Medicamento medicamento = null;
			if(rs.next()){
				medicamento = new Medicamento();
				medicamento.setNome(rs.getString("nome"));
				medicamento.setFabricante(rs.getString("fabricante"));
//				medicamento.setValidade(rs.getDate("validade"));
				medicamento.setValorUnitario(rs.getDouble("valor_unitario"));
				medicamento.setDescricao(rs.getString("descricao"));
			}
			
			ResourceManager.close(con);			
			return medicamento;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void atualizaEstoque() {
	}

}
