package classVO;


public class GrupoVO {    
    private String horario;
    private String Nivel;
    private String Grado_Grupo;

    public GrupoVO() {
    }

    public GrupoVO(String horario, String Nivel, String Grado_Grupo) {
        this.horario = horario;
        this.Nivel = Nivel;
        this.Grado_Grupo = Grado_Grupo;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the Nivel
     */
    public String getNivel() {
        return Nivel;
    }

    /**
     * @param Nivel the Nivel to set
     */
    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    /**
     * @return the Grado_Grupo
     */
    public String getGrado_Grupo() {
        return Grado_Grupo;
    }

    /**
     * @param Grado_Grupo the Grado_Grupo to set
     */
    public void setGrado_Grupo(String Grado_Grupo) {
        this.Grado_Grupo = Grado_Grupo;
    }
    
}
