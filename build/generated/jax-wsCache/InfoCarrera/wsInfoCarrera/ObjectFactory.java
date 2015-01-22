
package wsInfoCarrera;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsInfoCarrera package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfHorarioDocente_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfHorarioDocente");
    private final static QName _String_QNAME = new QName("http://academico.espoch.edu.ec/", "string");
    private final static QName _Docente_QNAME = new QName("http://academico.espoch.edu.ec/", "Docente");
    private final static QName _ArrayOfActasNotasOralesGrado_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfActasNotasOralesGrado");
    private final static QName _ArrayOfParametro_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfParametro");
    private final static QName _ArrayOfDatosInscritosInstSexo_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfDatosInscritosInstSexo");
    private final static QName _ArrayOfConvalidacion_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfConvalidacion");
    private final static QName _ArrayOfTitulosDocente_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfTitulosDocente");
    private final static QName _ArrayOfTitulosEst_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfTitulosEst");
    private final static QName _Acta_QNAME = new QName("http://academico.espoch.edu.ec/", "Acta");
    private final static QName _Persona_QNAME = new QName("http://academico.espoch.edu.ec/", "Persona");
    private final static QName _ArrayOfHorarioClase_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfHorarioClase");
    private final static QName _ArrayOfPromocionesEst_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfPromocionesEst");
    private final static QName _ArrayOfMateriaPensum_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfMateria_Pensum");
    private final static QName _ArrayOfEstudiante_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfEstudiante");
    private final static QName _ArrayOfMateriasR_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfMateriasR");
    private final static QName _ArrayOfNotas_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfNotas");
    private final static QName _ArrayOfHorarioClaseParalelo_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfHorarioClaseParalelo");
    private final static QName _ArrayOfTodasMatriculaEstudiantes_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfTodasMatriculaEstudiantes");
    private final static QName _ActaCalGrado_QNAME = new QName("http://academico.espoch.edu.ec/", "ActaCalGrado");
    private final static QName _ArrayOfInscripcion_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfInscripcion");
    private final static QName _ArrayOfHorarioEstudiante_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfHorarioEstudiante");
    private final static QName _Double_QNAME = new QName("http://academico.espoch.edu.ec/", "double");
    private final static QName _ArrayOfDatosGrado_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfDatosGrado");
    private final static QName _Estudiante_QNAME = new QName("http://academico.espoch.edu.ec/", "Estudiante");
    private final static QName _ArrayOfMateria_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfMateria");
    private final static QName _Matricula_QNAME = new QName("http://academico.espoch.edu.ec/", "Matricula");
    private final static QName _ArrayOfCarreraTitulos_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfCarreraTitulos");
    private final static QName _ArrayOfActaNotasEscritasGrado_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfActaNotasEscritasGrado");
    private final static QName _Credentials_QNAME = new QName("http://academico.espoch.edu.ec/", "credentials");
    private final static QName _ArrayOfMateriasAprobadas_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfMaterias_aprobadas");
    private final static QName _InscripcionGratuidad_QNAME = new QName("http://academico.espoch.edu.ec/", "InscripcionGratuidad");
    private final static QName _ArrayOfDictadoMateria_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfDictado_Materia");
    private final static QName _ArrayOfMateriaParalelo_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfMateriaParalelo");
    private final static QName _ParamCarrera_QNAME = new QName("http://academico.espoch.edu.ec/", "ParamCarrera");
    private final static QName _Materia_QNAME = new QName("http://academico.espoch.edu.ec/", "Materia");
    private final static QName _ArrayOfMateriasCre_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfMateriasCre");
    private final static QName _ArrayOfMateriasNoAprobadas_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfMaterias_no_aprobadas");
    private final static QName _ArrayOfHorarioExamenesEstudiante_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfHorarioExamenesEstudiante");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsInfoCarrera
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTitulosCarrera }
     * 
     */
    public GetTitulosCarrera createGetTitulosCarrera() {
        return new GetTitulosCarrera();
    }

    /**
     * Create an instance of {@link ArrayOfMateriasCre }
     * 
     */
    public ArrayOfMateriasCre createArrayOfMateriasCre() {
        return new ArrayOfMateriasCre();
    }

    /**
     * Create an instance of {@link GetHorarioDocente }
     * 
     */
    public GetHorarioDocente createGetHorarioDocente() {
        return new GetHorarioDocente();
    }

    /**
     * Create an instance of {@link ArrayOfMateria }
     * 
     */
    public ArrayOfMateria createArrayOfMateria() {
        return new ArrayOfMateria();
    }

    /**
     * Create an instance of {@link GetMallaCurricularPensumVigente }
     * 
     */
    public GetMallaCurricularPensumVigente createGetMallaCurricularPensumVigente() {
        return new GetMallaCurricularPensumVigente();
    }

    /**
     * Create an instance of {@link ArrayOfActaNotasEscritasGrado }
     * 
     */
    public ArrayOfActaNotasEscritasGrado createArrayOfActaNotasEscritasGrado() {
        return new ArrayOfActaNotasEscritasGrado();
    }

    /**
     * Create an instance of {@link GetInscripcionesEstudianteNoActivadosResponse }
     * 
     */
    public GetInscripcionesEstudianteNoActivadosResponse createGetInscripcionesEstudianteNoActivadosResponse() {
        return new GetInscripcionesEstudianteNoActivadosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInscripcion }
     * 
     */
    public ArrayOfInscripcion createArrayOfInscripcion() {
        return new ArrayOfInscripcion();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link GetAlumnosMateria }
     * 
     */
    public GetAlumnosMateria createGetAlumnosMateria() {
        return new GetAlumnosMateria();
    }

    /**
     * Create an instance of {@link GetMallaCurricularPensumVigenteSinDescripcionResponse }
     * 
     */
    public GetMallaCurricularPensumVigenteSinDescripcionResponse createGetMallaCurricularPensumVigenteSinDescripcionResponse() {
        return new GetMallaCurricularPensumVigenteSinDescripcionResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMateriaPensum }
     * 
     */
    public ArrayOfMateriaPensum createArrayOfMateriaPensum() {
        return new ArrayOfMateriaPensum();
    }

    /**
     * Create an instance of {@link GetParametrosCarreraTotalResponse }
     * 
     */
    public GetParametrosCarreraTotalResponse createGetParametrosCarreraTotalResponse() {
        return new GetParametrosCarreraTotalResponse();
    }

    /**
     * Create an instance of {@link ArrayOfParametro }
     * 
     */
    public ArrayOfParametro createArrayOfParametro() {
        return new ArrayOfParametro();
    }

    /**
     * Create an instance of {@link ArrayOfHorarioClase }
     * 
     */
    public ArrayOfHorarioClase createArrayOfHorarioClase() {
        return new ArrayOfHorarioClase();
    }

    /**
     * Create an instance of {@link GetCreditosAprobadosCS }
     * 
     */
    public GetCreditosAprobadosCS createGetCreditosAprobadosCS() {
        return new GetCreditosAprobadosCS();
    }

    /**
     * Create an instance of {@link GetHorariosDocenteParalelo }
     * 
     */
    public GetHorariosDocenteParalelo createGetHorariosDocenteParalelo() {
        return new GetHorariosDocenteParalelo();
    }

    /**
     * Create an instance of {@link ArrayOfHorarioClaseParalelo }
     * 
     */
    public ArrayOfHorarioClaseParalelo createArrayOfHorarioClaseParalelo() {
        return new ArrayOfHorarioClaseParalelo();
    }

    /**
     * Create an instance of {@link ArrayOfMateriasR }
     * 
     */
    public ArrayOfMateriasR createArrayOfMateriasR() {
        return new ArrayOfMateriasR();
    }

    /**
     * Create an instance of {@link GetMateriasDocenteResponse }
     * 
     */
    public GetMateriasDocenteResponse createGetMateriasDocenteResponse() {
        return new GetMateriasDocenteResponse();
    }

    /**
     * Create an instance of {@link GetDatosUsuarioCarrera }
     * 
     */
    public GetDatosUsuarioCarrera createGetDatosUsuarioCarrera() {
        return new GetDatosUsuarioCarrera();
    }

    /**
     * Create an instance of {@link GetInscripcionesEstudianteResponse }
     * 
     */
    public GetInscripcionesEstudianteResponse createGetInscripcionesEstudianteResponse() {
        return new GetInscripcionesEstudianteResponse();
    }

    /**
     * Create an instance of {@link GetInfoGeneralGradoEstudiante }
     * 
     */
    public GetInfoGeneralGradoEstudiante createGetInfoGeneralGradoEstudiante() {
        return new GetInfoGeneralGradoEstudiante();
    }

    /**
     * Create an instance of {@link GetAlumnosMateriaResponse }
     * 
     */
    public GetAlumnosMateriaResponse createGetAlumnosMateriaResponse() {
        return new GetAlumnosMateriaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEstudiante }
     * 
     */
    public ArrayOfEstudiante createArrayOfEstudiante() {
        return new ArrayOfEstudiante();
    }

    /**
     * Create an instance of {@link GetDictadosMateriaResponse }
     * 
     */
    public GetDictadosMateriaResponse createGetDictadosMateriaResponse() {
        return new GetDictadosMateriaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDictadoMateria }
     * 
     */
    public ArrayOfDictadoMateria createArrayOfDictadoMateria() {
        return new ArrayOfDictadoMateria();
    }

    /**
     * Create an instance of {@link GetMateriasAprobadasResponse }
     * 
     */
    public GetMateriasAprobadasResponse createGetMateriasAprobadasResponse() {
        return new GetMateriasAprobadasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMateriasAprobadas }
     * 
     */
    public ArrayOfMateriasAprobadas createArrayOfMateriasAprobadas() {
        return new ArrayOfMateriasAprobadas();
    }

    /**
     * Create an instance of {@link Acta }
     * 
     */
    public Acta createActa() {
        return new Acta();
    }

    /**
     * Create an instance of {@link GetInscripcionGratuidad }
     * 
     */
    public GetInscripcionGratuidad createGetInscripcionGratuidad() {
        return new GetInscripcionGratuidad();
    }

    /**
     * Create an instance of {@link ArrayOfConvalidacion }
     * 
     */
    public ArrayOfConvalidacion createArrayOfConvalidacion() {
        return new ArrayOfConvalidacion();
    }

    /**
     * Create an instance of {@link GetEvaluacionesOralGradoResponse }
     * 
     */
    public GetEvaluacionesOralGradoResponse createGetEvaluacionesOralGradoResponse() {
        return new GetEvaluacionesOralGradoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfActasNotasOralesGrado }
     * 
     */
    public ArrayOfActasNotasOralesGrado createArrayOfActasNotasOralesGrado() {
        return new ArrayOfActasNotasOralesGrado();
    }

    /**
     * Create an instance of {@link GetDatosCompletosEstudianteResponse }
     * 
     */
    public GetDatosCompletosEstudianteResponse createGetDatosCompletosEstudianteResponse() {
        return new GetDatosCompletosEstudianteResponse();
    }

    /**
     * Create an instance of {@link Estudiante }
     * 
     */
    public Estudiante createEstudiante() {
        return new Estudiante();
    }

    /**
     * Create an instance of {@link GetMallaCurricularPensumVigenteSinDescripcion }
     * 
     */
    public GetMallaCurricularPensumVigenteSinDescripcion createGetMallaCurricularPensumVigenteSinDescripcion() {
        return new GetMallaCurricularPensumVigenteSinDescripcion();
    }

    /**
     * Create an instance of {@link GetParametrosCarreraTotal }
     * 
     */
    public GetParametrosCarreraTotal createGetParametrosCarreraTotal() {
        return new GetParametrosCarreraTotal();
    }

    /**
     * Create an instance of {@link ArrayOfCarreraTitulos }
     * 
     */
    public ArrayOfCarreraTitulos createArrayOfCarreraTitulos() {
        return new ArrayOfCarreraTitulos();
    }

    /**
     * Create an instance of {@link GetParametrosCarrera }
     * 
     */
    public GetParametrosCarrera createGetParametrosCarrera() {
        return new GetParametrosCarrera();
    }

    /**
     * Create an instance of {@link GetHorariosDocente }
     * 
     */
    public GetHorariosDocente createGetHorariosDocente() {
        return new GetHorariosDocente();
    }

    /**
     * Create an instance of {@link GetMateriasEstudiante }
     * 
     */
    public GetMateriasEstudiante createGetMateriasEstudiante() {
        return new GetMateriasEstudiante();
    }

    /**
     * Create an instance of {@link GetMateriasReprobadosResponse }
     * 
     */
    public GetMateriasReprobadosResponse createGetMateriasReprobadosResponse() {
        return new GetMateriasReprobadosResponse();
    }

    /**
     * Create an instance of {@link GetMateriasReprobados }
     * 
     */
    public GetMateriasReprobados createGetMateriasReprobados() {
        return new GetMateriasReprobados();
    }

    /**
     * Create an instance of {@link ArrayOfPromocionesEst }
     * 
     */
    public ArrayOfPromocionesEst createArrayOfPromocionesEst() {
        return new ArrayOfPromocionesEst();
    }

    /**
     * Create an instance of {@link GetHorarioExamenesEstudianteResponse }
     * 
     */
    public GetHorarioExamenesEstudianteResponse createGetHorarioExamenesEstudianteResponse() {
        return new GetHorarioExamenesEstudianteResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHorarioExamenesEstudiante }
     * 
     */
    public ArrayOfHorarioExamenesEstudiante createArrayOfHorarioExamenesEstudiante() {
        return new ArrayOfHorarioExamenesEstudiante();
    }

    /**
     * Create an instance of {@link GetDatosEstudianteMatriculadoResponse }
     * 
     */
    public GetDatosEstudianteMatriculadoResponse createGetDatosEstudianteMatriculadoResponse() {
        return new GetDatosEstudianteMatriculadoResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link GetTitulosDocentes }
     * 
     */
    public GetTitulosDocentes createGetTitulosDocentes() {
        return new GetTitulosDocentes();
    }

    /**
     * Create an instance of {@link GetDatosMatricula }
     * 
     */
    public GetDatosMatricula createGetDatosMatricula() {
        return new GetDatosMatricula();
    }

    /**
     * Create an instance of {@link ArrayOfTodasMatriculaEstudiantes }
     * 
     */
    public ArrayOfTodasMatriculaEstudiantes createArrayOfTodasMatriculaEstudiantes() {
        return new ArrayOfTodasMatriculaEstudiantes();
    }

    /**
     * Create an instance of {@link GetEstadoEstudianteCarreraResponse }
     * 
     */
    public GetEstadoEstudianteCarreraResponse createGetEstadoEstudianteCarreraResponse() {
        return new GetEstadoEstudianteCarreraResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDatosGrado }
     * 
     */
    public ArrayOfDatosGrado createArrayOfDatosGrado() {
        return new ArrayOfDatosGrado();
    }

    /**
     * Create an instance of {@link GetHorariosDocenteParaleloResponse }
     * 
     */
    public GetHorariosDocenteParaleloResponse createGetHorariosDocenteParaleloResponse() {
        return new GetHorariosDocenteParaleloResponse();
    }

    /**
     * Create an instance of {@link GetDatosDocente }
     * 
     */
    public GetDatosDocente createGetDatosDocente() {
        return new GetDatosDocente();
    }

    /**
     * Create an instance of {@link GetHorarioDocenteResponse }
     * 
     */
    public GetHorarioDocenteResponse createGetHorarioDocenteResponse() {
        return new GetHorarioDocenteResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHorarioDocente }
     * 
     */
    public ArrayOfHorarioDocente createArrayOfHorarioDocente() {
        return new ArrayOfHorarioDocente();
    }

    /**
     * Create an instance of {@link GetHorarioEstudianteResponse }
     * 
     */
    public GetHorarioEstudianteResponse createGetHorarioEstudianteResponse() {
        return new GetHorarioEstudianteResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHorarioEstudiante }
     * 
     */
    public ArrayOfHorarioEstudiante createArrayOfHorarioEstudiante() {
        return new ArrayOfHorarioEstudiante();
    }

    /**
     * Create an instance of {@link GetDatosMatriculaResponse }
     * 
     */
    public GetDatosMatriculaResponse createGetDatosMatriculaResponse() {
        return new GetDatosMatriculaResponse();
    }

    /**
     * Create an instance of {@link Matricula }
     * 
     */
    public Matricula createMatricula() {
        return new Matricula();
    }

    /**
     * Create an instance of {@link GetGradosEstudiante }
     * 
     */
    public GetGradosEstudiante createGetGradosEstudiante() {
        return new GetGradosEstudiante();
    }

    /**
     * Create an instance of {@link ArrayOfTitulosDocente }
     * 
     */
    public ArrayOfTitulosDocente createArrayOfTitulosDocente() {
        return new ArrayOfTitulosDocente();
    }

    /**
     * Create an instance of {@link ArrayOfTitulosEst }
     * 
     */
    public ArrayOfTitulosEst createArrayOfTitulosEst() {
        return new ArrayOfTitulosEst();
    }

    /**
     * Create an instance of {@link GetParametrosCarreraResponse }
     * 
     */
    public GetParametrosCarreraResponse createGetParametrosCarreraResponse() {
        return new GetParametrosCarreraResponse();
    }

    /**
     * Create an instance of {@link ParamCarrera }
     * 
     */
    public ParamCarrera createParamCarrera() {
        return new ParamCarrera();
    }

    /**
     * Create an instance of {@link ArrayOfMateriaParalelo }
     * 
     */
    public ArrayOfMateriaParalelo createArrayOfMateriaParalelo() {
        return new ArrayOfMateriaParalelo();
    }

    /**
     * Create an instance of {@link GetInscripcionesEstudiante }
     * 
     */
    public GetInscripcionesEstudiante createGetInscripcionesEstudiante() {
        return new GetInscripcionesEstudiante();
    }

    /**
     * Create an instance of {@link GetActaGradoEstudianteResponse }
     * 
     */
    public GetActaGradoEstudianteResponse createGetActaGradoEstudianteResponse() {
        return new GetActaGradoEstudianteResponse();
    }

    /**
     * Create an instance of {@link GetHorarioExamenesEstudiante }
     * 
     */
    public GetHorarioExamenesEstudiante createGetHorarioExamenesEstudiante() {
        return new GetHorarioExamenesEstudiante();
    }

    /**
     * Create an instance of {@link GetHorariosDocenteResponse }
     * 
     */
    public GetHorariosDocenteResponse createGetHorariosDocenteResponse() {
        return new GetHorariosDocenteResponse();
    }

    /**
     * Create an instance of {@link GetDatosInscInstSexo }
     * 
     */
    public GetDatosInscInstSexo createGetDatosInscInstSexo() {
        return new GetDatosInscInstSexo();
    }

    /**
     * Create an instance of {@link GetTitulosDocentesResponse }
     * 
     */
    public GetTitulosDocentesResponse createGetTitulosDocentesResponse() {
        return new GetTitulosDocentesResponse();
    }

    /**
     * Create an instance of {@link GetDatosDocenteResponse }
     * 
     */
    public GetDatosDocenteResponse createGetDatosDocenteResponse() {
        return new GetDatosDocenteResponse();
    }

    /**
     * Create an instance of {@link Docente }
     * 
     */
    public Docente createDocente() {
        return new Docente();
    }

    /**
     * Create an instance of {@link GetDatosUsuarioCarreraResponse }
     * 
     */
    public GetDatosUsuarioCarreraResponse createGetDatosUsuarioCarreraResponse() {
        return new GetDatosUsuarioCarreraResponse();
    }

    /**
     * Create an instance of {@link GetTitulosEstudianteResponse }
     * 
     */
    public GetTitulosEstudianteResponse createGetTitulosEstudianteResponse() {
        return new GetTitulosEstudianteResponse();
    }

    /**
     * Create an instance of {@link GetMateriasEstudianteResponse }
     * 
     */
    public GetMateriasEstudianteResponse createGetMateriasEstudianteResponse() {
        return new GetMateriasEstudianteResponse();
    }

    /**
     * Create an instance of {@link GetTodasMatriculaEstudiantes }
     * 
     */
    public GetTodasMatriculaEstudiantes createGetTodasMatriculaEstudiantes() {
        return new GetTodasMatriculaEstudiantes();
    }

    /**
     * Create an instance of {@link GetDatosEstudianteMatriculado }
     * 
     */
    public GetDatosEstudianteMatriculado createGetDatosEstudianteMatriculado() {
        return new GetDatosEstudianteMatriculado();
    }

    /**
     * Create an instance of {@link GetConvalidacionesResponse }
     * 
     */
    public GetConvalidacionesResponse createGetConvalidacionesResponse() {
        return new GetConvalidacionesResponse();
    }

    /**
     * Create an instance of {@link GetPromocionesEstudianteResponse }
     * 
     */
    public GetPromocionesEstudianteResponse createGetPromocionesEstudianteResponse() {
        return new GetPromocionesEstudianteResponse();
    }

    /**
     * Create an instance of {@link GetUltimasNotasEstudianteCarreraResponse }
     * 
     */
    public GetUltimasNotasEstudianteCarreraResponse createGetUltimasNotasEstudianteCarreraResponse() {
        return new GetUltimasNotasEstudianteCarreraResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNotas }
     * 
     */
    public ArrayOfNotas createArrayOfNotas() {
        return new ArrayOfNotas();
    }

    /**
     * Create an instance of {@link ActaCalGrado }
     * 
     */
    public ActaCalGrado createActaCalGrado() {
        return new ActaCalGrado();
    }

    /**
     * Create an instance of {@link GetInscripcionesEstudianteNoActivados }
     * 
     */
    public GetInscripcionesEstudianteNoActivados createGetInscripcionesEstudianteNoActivados() {
        return new GetInscripcionesEstudianteNoActivados();
    }

    /**
     * Create an instance of {@link GetUltimasNotasEstudianteCarrera }
     * 
     */
    public GetUltimasNotasEstudianteCarrera createGetUltimasNotasEstudianteCarrera() {
        return new GetUltimasNotasEstudianteCarrera();
    }

    /**
     * Create an instance of {@link GetDatosCompletosEstudiante }
     * 
     */
    public GetDatosCompletosEstudiante createGetDatosCompletosEstudiante() {
        return new GetDatosCompletosEstudiante();
    }

    /**
     * Create an instance of {@link GetTitulosEstudiante }
     * 
     */
    public GetTitulosEstudiante createGetTitulosEstudiante() {
        return new GetTitulosEstudiante();
    }

    /**
     * Create an instance of {@link GetEvaluacionesEscritasGradoResponse }
     * 
     */
    public GetEvaluacionesEscritasGradoResponse createGetEvaluacionesEscritasGradoResponse() {
        return new GetEvaluacionesEscritasGradoResponse();
    }

    /**
     * Create an instance of {@link GetMateriasParaleloEstudianteResponse }
     * 
     */
    public GetMateriasParaleloEstudianteResponse createGetMateriasParaleloEstudianteResponse() {
        return new GetMateriasParaleloEstudianteResponse();
    }

    /**
     * Create an instance of {@link GetConvalidaciones }
     * 
     */
    public GetConvalidaciones createGetConvalidaciones() {
        return new GetConvalidaciones();
    }

    /**
     * Create an instance of {@link GetInfoGeneralGradoEstudianteResponse }
     * 
     */
    public GetInfoGeneralGradoEstudianteResponse createGetInfoGeneralGradoEstudianteResponse() {
        return new GetInfoGeneralGradoEstudianteResponse();
    }

    /**
     * Create an instance of {@link GetActaGradoEstudiante }
     * 
     */
    public GetActaGradoEstudiante createGetActaGradoEstudiante() {
        return new GetActaGradoEstudiante();
    }

    /**
     * Create an instance of {@link GetCreditosAprobadosCSResponse }
     * 
     */
    public GetCreditosAprobadosCSResponse createGetCreditosAprobadosCSResponse() {
        return new GetCreditosAprobadosCSResponse();
    }

    /**
     * Create an instance of {@link GetInscripcionGratuidadResponse }
     * 
     */
    public GetInscripcionGratuidadResponse createGetInscripcionGratuidadResponse() {
        return new GetInscripcionGratuidadResponse();
    }

    /**
     * Create an instance of {@link InscripcionGratuidad }
     * 
     */
    public InscripcionGratuidad createInscripcionGratuidad() {
        return new InscripcionGratuidad();
    }

    /**
     * Create an instance of {@link GetDictadosMateria }
     * 
     */
    public GetDictadosMateria createGetDictadosMateria() {
        return new GetDictadosMateria();
    }

    /**
     * Create an instance of {@link GetDatosInscInstSexoResponse }
     * 
     */
    public GetDatosInscInstSexoResponse createGetDatosInscInstSexoResponse() {
        return new GetDatosInscInstSexoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDatosInscritosInstSexo }
     * 
     */
    public ArrayOfDatosInscritosInstSexo createArrayOfDatosInscritosInstSexo() {
        return new ArrayOfDatosInscritosInstSexo();
    }

    /**
     * Create an instance of {@link GetMateriasAprobadas }
     * 
     */
    public GetMateriasAprobadas createGetMateriasAprobadas() {
        return new GetMateriasAprobadas();
    }

    /**
     * Create an instance of {@link GetDatosMateria }
     * 
     */
    public GetDatosMateria createGetDatosMateria() {
        return new GetDatosMateria();
    }

    /**
     * Create an instance of {@link GetMateriasNoAprobadasResponse }
     * 
     */
    public GetMateriasNoAprobadasResponse createGetMateriasNoAprobadasResponse() {
        return new GetMateriasNoAprobadasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMateriasNoAprobadas }
     * 
     */
    public ArrayOfMateriasNoAprobadas createArrayOfMateriasNoAprobadas() {
        return new ArrayOfMateriasNoAprobadas();
    }

    /**
     * Create an instance of {@link Materia }
     * 
     */
    public Materia createMateria() {
        return new Materia();
    }

    /**
     * Create an instance of {@link GetEstadoEstudianteCarrera }
     * 
     */
    public GetEstadoEstudianteCarrera createGetEstadoEstudianteCarrera() {
        return new GetEstadoEstudianteCarrera();
    }

    /**
     * Create an instance of {@link GetMateriasEstudianteCreditos }
     * 
     */
    public GetMateriasEstudianteCreditos createGetMateriasEstudianteCreditos() {
        return new GetMateriasEstudianteCreditos();
    }

    /**
     * Create an instance of {@link GetTodasMatriculaEstudiantesResponse }
     * 
     */
    public GetTodasMatriculaEstudiantesResponse createGetTodasMatriculaEstudiantesResponse() {
        return new GetTodasMatriculaEstudiantesResponse();
    }

    /**
     * Create an instance of {@link GetMateriasDocente }
     * 
     */
    public GetMateriasDocente createGetMateriasDocente() {
        return new GetMateriasDocente();
    }

    /**
     * Create an instance of {@link GetMallaCurricularPensumVigenteResponse }
     * 
     */
    public GetMallaCurricularPensumVigenteResponse createGetMallaCurricularPensumVigenteResponse() {
        return new GetMallaCurricularPensumVigenteResponse();
    }

    /**
     * Create an instance of {@link GetTitulosCarreraResponse }
     * 
     */
    public GetTitulosCarreraResponse createGetTitulosCarreraResponse() {
        return new GetTitulosCarreraResponse();
    }

    /**
     * Create an instance of {@link GetGradosEstudianteResponse }
     * 
     */
    public GetGradosEstudianteResponse createGetGradosEstudianteResponse() {
        return new GetGradosEstudianteResponse();
    }

    /**
     * Create an instance of {@link GetPromocionesEstudiante }
     * 
     */
    public GetPromocionesEstudiante createGetPromocionesEstudiante() {
        return new GetPromocionesEstudiante();
    }

    /**
     * Create an instance of {@link GetMateriasNoAprobadas }
     * 
     */
    public GetMateriasNoAprobadas createGetMateriasNoAprobadas() {
        return new GetMateriasNoAprobadas();
    }

    /**
     * Create an instance of {@link GetMateriasParaleloEstudiante }
     * 
     */
    public GetMateriasParaleloEstudiante createGetMateriasParaleloEstudiante() {
        return new GetMateriasParaleloEstudiante();
    }

    /**
     * Create an instance of {@link GetDatosMateriaResponse }
     * 
     */
    public GetDatosMateriaResponse createGetDatosMateriaResponse() {
        return new GetDatosMateriaResponse();
    }

    /**
     * Create an instance of {@link GetEvaluacionesEscritasGrado }
     * 
     */
    public GetEvaluacionesEscritasGrado createGetEvaluacionesEscritasGrado() {
        return new GetEvaluacionesEscritasGrado();
    }

    /**
     * Create an instance of {@link GetEvaluacionesOralGrado }
     * 
     */
    public GetEvaluacionesOralGrado createGetEvaluacionesOralGrado() {
        return new GetEvaluacionesOralGrado();
    }

    /**
     * Create an instance of {@link GetMateriasEstudianteCreditosResponse }
     * 
     */
    public GetMateriasEstudianteCreditosResponse createGetMateriasEstudianteCreditosResponse() {
        return new GetMateriasEstudianteCreditosResponse();
    }

    /**
     * Create an instance of {@link GetHorarioEstudiante }
     * 
     */
    public GetHorarioEstudiante createGetHorarioEstudiante() {
        return new GetHorarioEstudiante();
    }

    /**
     * Create an instance of {@link MateriasR }
     * 
     */
    public MateriasR createMateriasR() {
        return new MateriasR();
    }

    /**
     * Create an instance of {@link TitulosDocente }
     * 
     */
    public TitulosDocente createTitulosDocente() {
        return new TitulosDocente();
    }

    /**
     * Create an instance of {@link Inscripcion }
     * 
     */
    public Inscripcion createInscripcion() {
        return new Inscripcion();
    }

    /**
     * Create an instance of {@link MateriasCre }
     * 
     */
    public MateriasCre createMateriasCre() {
        return new MateriasCre();
    }

    /**
     * Create an instance of {@link HorarioEstudiante }
     * 
     */
    public HorarioEstudiante createHorarioEstudiante() {
        return new HorarioEstudiante();
    }

    /**
     * Create an instance of {@link Parametro }
     * 
     */
    public Parametro createParametro() {
        return new Parametro();
    }

    /**
     * Create an instance of {@link MateriaPensum }
     * 
     */
    public MateriaPensum createMateriaPensum() {
        return new MateriaPensum();
    }

    /**
     * Create an instance of {@link PromocionesEst }
     * 
     */
    public PromocionesEst createPromocionesEst() {
        return new PromocionesEst();
    }

    /**
     * Create an instance of {@link HorarioClaseParalelo }
     * 
     */
    public HorarioClaseParalelo createHorarioClaseParalelo() {
        return new HorarioClaseParalelo();
    }

    /**
     * Create an instance of {@link HorarioExamenesEstudiante }
     * 
     */
    public HorarioExamenesEstudiante createHorarioExamenesEstudiante() {
        return new HorarioExamenesEstudiante();
    }

    /**
     * Create an instance of {@link Notas }
     * 
     */
    public Notas createNotas() {
        return new Notas();
    }

    /**
     * Create an instance of {@link MateriaRequisito }
     * 
     */
    public MateriaRequisito createMateriaRequisito() {
        return new MateriaRequisito();
    }

    /**
     * Create an instance of {@link MateriaParalelo }
     * 
     */
    public MateriaParalelo createMateriaParalelo() {
        return new MateriaParalelo();
    }

    /**
     * Create an instance of {@link DatosGrado }
     * 
     */
    public DatosGrado createDatosGrado() {
        return new DatosGrado();
    }

    /**
     * Create an instance of {@link ActaNotasEscritasGrado }
     * 
     */
    public ActaNotasEscritasGrado createActaNotasEscritasGrado() {
        return new ActaNotasEscritasGrado();
    }

    /**
     * Create an instance of {@link TodasMatriculaEstudiantes }
     * 
     */
    public TodasMatriculaEstudiantes createTodasMatriculaEstudiantes() {
        return new TodasMatriculaEstudiantes();
    }

    /**
     * Create an instance of {@link ActasNotasOralesGrado }
     * 
     */
    public ActasNotasOralesGrado createActasNotasOralesGrado() {
        return new ActasNotasOralesGrado();
    }

    /**
     * Create an instance of {@link HorarioClase }
     * 
     */
    public HorarioClase createHorarioClase() {
        return new HorarioClase();
    }

    /**
     * Create an instance of {@link HorarioDocente }
     * 
     */
    public HorarioDocente createHorarioDocente() {
        return new HorarioDocente();
    }

    /**
     * Create an instance of {@link TitulosEst }
     * 
     */
    public TitulosEst createTitulosEst() {
        return new TitulosEst();
    }

    /**
     * Create an instance of {@link CarreraTitulos }
     * 
     */
    public CarreraTitulos createCarreraTitulos() {
        return new CarreraTitulos();
    }

    /**
     * Create an instance of {@link MateriasAprobadas }
     * 
     */
    public MateriasAprobadas createMateriasAprobadas() {
        return new MateriasAprobadas();
    }

    /**
     * Create an instance of {@link ArrayOfMateriaRequisito }
     * 
     */
    public ArrayOfMateriaRequisito createArrayOfMateriaRequisito() {
        return new ArrayOfMateriaRequisito();
    }

    /**
     * Create an instance of {@link DictadoMateria }
     * 
     */
    public DictadoMateria createDictadoMateria() {
        return new DictadoMateria();
    }

    /**
     * Create an instance of {@link Convalidacion }
     * 
     */
    public Convalidacion createConvalidacion() {
        return new Convalidacion();
    }

    /**
     * Create an instance of {@link DatosInscritosInstSexo }
     * 
     */
    public DatosInscritosInstSexo createDatosInscritosInstSexo() {
        return new DatosInscritosInstSexo();
    }

    /**
     * Create an instance of {@link MateriasNoAprobadas }
     * 
     */
    public MateriasNoAprobadas createMateriasNoAprobadas() {
        return new MateriasNoAprobadas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHorarioDocente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfHorarioDocente")
    public JAXBElement<ArrayOfHorarioDocente> createArrayOfHorarioDocente(ArrayOfHorarioDocente value) {
        return new JAXBElement<ArrayOfHorarioDocente>(_ArrayOfHorarioDocente_QNAME, ArrayOfHorarioDocente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Docente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "Docente")
    public JAXBElement<Docente> createDocente(Docente value) {
        return new JAXBElement<Docente>(_Docente_QNAME, Docente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfActasNotasOralesGrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfActasNotasOralesGrado")
    public JAXBElement<ArrayOfActasNotasOralesGrado> createArrayOfActasNotasOralesGrado(ArrayOfActasNotasOralesGrado value) {
        return new JAXBElement<ArrayOfActasNotasOralesGrado>(_ArrayOfActasNotasOralesGrado_QNAME, ArrayOfActasNotasOralesGrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParametro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfParametro")
    public JAXBElement<ArrayOfParametro> createArrayOfParametro(ArrayOfParametro value) {
        return new JAXBElement<ArrayOfParametro>(_ArrayOfParametro_QNAME, ArrayOfParametro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosInscritosInstSexo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfDatosInscritosInstSexo")
    public JAXBElement<ArrayOfDatosInscritosInstSexo> createArrayOfDatosInscritosInstSexo(ArrayOfDatosInscritosInstSexo value) {
        return new JAXBElement<ArrayOfDatosInscritosInstSexo>(_ArrayOfDatosInscritosInstSexo_QNAME, ArrayOfDatosInscritosInstSexo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConvalidacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfConvalidacion")
    public JAXBElement<ArrayOfConvalidacion> createArrayOfConvalidacion(ArrayOfConvalidacion value) {
        return new JAXBElement<ArrayOfConvalidacion>(_ArrayOfConvalidacion_QNAME, ArrayOfConvalidacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTitulosDocente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfTitulosDocente")
    public JAXBElement<ArrayOfTitulosDocente> createArrayOfTitulosDocente(ArrayOfTitulosDocente value) {
        return new JAXBElement<ArrayOfTitulosDocente>(_ArrayOfTitulosDocente_QNAME, ArrayOfTitulosDocente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTitulosEst }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfTitulosEst")
    public JAXBElement<ArrayOfTitulosEst> createArrayOfTitulosEst(ArrayOfTitulosEst value) {
        return new JAXBElement<ArrayOfTitulosEst>(_ArrayOfTitulosEst_QNAME, ArrayOfTitulosEst.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Acta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "Acta")
    public JAXBElement<Acta> createActa(Acta value) {
        return new JAXBElement<Acta>(_Acta_QNAME, Acta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "Persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHorarioClase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfHorarioClase")
    public JAXBElement<ArrayOfHorarioClase> createArrayOfHorarioClase(ArrayOfHorarioClase value) {
        return new JAXBElement<ArrayOfHorarioClase>(_ArrayOfHorarioClase_QNAME, ArrayOfHorarioClase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromocionesEst }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfPromocionesEst")
    public JAXBElement<ArrayOfPromocionesEst> createArrayOfPromocionesEst(ArrayOfPromocionesEst value) {
        return new JAXBElement<ArrayOfPromocionesEst>(_ArrayOfPromocionesEst_QNAME, ArrayOfPromocionesEst.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMateriaPensum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfMateria_Pensum")
    public JAXBElement<ArrayOfMateriaPensum> createArrayOfMateriaPensum(ArrayOfMateriaPensum value) {
        return new JAXBElement<ArrayOfMateriaPensum>(_ArrayOfMateriaPensum_QNAME, ArrayOfMateriaPensum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfEstudiante")
    public JAXBElement<ArrayOfEstudiante> createArrayOfEstudiante(ArrayOfEstudiante value) {
        return new JAXBElement<ArrayOfEstudiante>(_ArrayOfEstudiante_QNAME, ArrayOfEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMateriasR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfMateriasR")
    public JAXBElement<ArrayOfMateriasR> createArrayOfMateriasR(ArrayOfMateriasR value) {
        return new JAXBElement<ArrayOfMateriasR>(_ArrayOfMateriasR_QNAME, ArrayOfMateriasR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfNotas")
    public JAXBElement<ArrayOfNotas> createArrayOfNotas(ArrayOfNotas value) {
        return new JAXBElement<ArrayOfNotas>(_ArrayOfNotas_QNAME, ArrayOfNotas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHorarioClaseParalelo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfHorarioClaseParalelo")
    public JAXBElement<ArrayOfHorarioClaseParalelo> createArrayOfHorarioClaseParalelo(ArrayOfHorarioClaseParalelo value) {
        return new JAXBElement<ArrayOfHorarioClaseParalelo>(_ArrayOfHorarioClaseParalelo_QNAME, ArrayOfHorarioClaseParalelo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTodasMatriculaEstudiantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfTodasMatriculaEstudiantes")
    public JAXBElement<ArrayOfTodasMatriculaEstudiantes> createArrayOfTodasMatriculaEstudiantes(ArrayOfTodasMatriculaEstudiantes value) {
        return new JAXBElement<ArrayOfTodasMatriculaEstudiantes>(_ArrayOfTodasMatriculaEstudiantes_QNAME, ArrayOfTodasMatriculaEstudiantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActaCalGrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ActaCalGrado")
    public JAXBElement<ActaCalGrado> createActaCalGrado(ActaCalGrado value) {
        return new JAXBElement<ActaCalGrado>(_ActaCalGrado_QNAME, ActaCalGrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInscripcion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfInscripcion")
    public JAXBElement<ArrayOfInscripcion> createArrayOfInscripcion(ArrayOfInscripcion value) {
        return new JAXBElement<ArrayOfInscripcion>(_ArrayOfInscripcion_QNAME, ArrayOfInscripcion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHorarioEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfHorarioEstudiante")
    public JAXBElement<ArrayOfHorarioEstudiante> createArrayOfHorarioEstudiante(ArrayOfHorarioEstudiante value) {
        return new JAXBElement<ArrayOfHorarioEstudiante>(_ArrayOfHorarioEstudiante_QNAME, ArrayOfHorarioEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosGrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfDatosGrado")
    public JAXBElement<ArrayOfDatosGrado> createArrayOfDatosGrado(ArrayOfDatosGrado value) {
        return new JAXBElement<ArrayOfDatosGrado>(_ArrayOfDatosGrado_QNAME, ArrayOfDatosGrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "Estudiante")
    public JAXBElement<Estudiante> createEstudiante(Estudiante value) {
        return new JAXBElement<Estudiante>(_Estudiante_QNAME, Estudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMateria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfMateria")
    public JAXBElement<ArrayOfMateria> createArrayOfMateria(ArrayOfMateria value) {
        return new JAXBElement<ArrayOfMateria>(_ArrayOfMateria_QNAME, ArrayOfMateria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Matricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "Matricula")
    public JAXBElement<Matricula> createMatricula(Matricula value) {
        return new JAXBElement<Matricula>(_Matricula_QNAME, Matricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCarreraTitulos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfCarreraTitulos")
    public JAXBElement<ArrayOfCarreraTitulos> createArrayOfCarreraTitulos(ArrayOfCarreraTitulos value) {
        return new JAXBElement<ArrayOfCarreraTitulos>(_ArrayOfCarreraTitulos_QNAME, ArrayOfCarreraTitulos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfActaNotasEscritasGrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfActaNotasEscritasGrado")
    public JAXBElement<ArrayOfActaNotasEscritasGrado> createArrayOfActaNotasEscritasGrado(ArrayOfActaNotasEscritasGrado value) {
        return new JAXBElement<ArrayOfActaNotasEscritasGrado>(_ArrayOfActaNotasEscritasGrado_QNAME, ArrayOfActaNotasEscritasGrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "credentials")
    public JAXBElement<Credentials> createCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMateriasAprobadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfMaterias_aprobadas")
    public JAXBElement<ArrayOfMateriasAprobadas> createArrayOfMateriasAprobadas(ArrayOfMateriasAprobadas value) {
        return new JAXBElement<ArrayOfMateriasAprobadas>(_ArrayOfMateriasAprobadas_QNAME, ArrayOfMateriasAprobadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InscripcionGratuidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "InscripcionGratuidad")
    public JAXBElement<InscripcionGratuidad> createInscripcionGratuidad(InscripcionGratuidad value) {
        return new JAXBElement<InscripcionGratuidad>(_InscripcionGratuidad_QNAME, InscripcionGratuidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDictadoMateria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfDictado_Materia")
    public JAXBElement<ArrayOfDictadoMateria> createArrayOfDictadoMateria(ArrayOfDictadoMateria value) {
        return new JAXBElement<ArrayOfDictadoMateria>(_ArrayOfDictadoMateria_QNAME, ArrayOfDictadoMateria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMateriaParalelo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfMateriaParalelo")
    public JAXBElement<ArrayOfMateriaParalelo> createArrayOfMateriaParalelo(ArrayOfMateriaParalelo value) {
        return new JAXBElement<ArrayOfMateriaParalelo>(_ArrayOfMateriaParalelo_QNAME, ArrayOfMateriaParalelo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamCarrera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ParamCarrera")
    public JAXBElement<ParamCarrera> createParamCarrera(ParamCarrera value) {
        return new JAXBElement<ParamCarrera>(_ParamCarrera_QNAME, ParamCarrera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Materia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "Materia")
    public JAXBElement<Materia> createMateria(Materia value) {
        return new JAXBElement<Materia>(_Materia_QNAME, Materia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMateriasCre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfMateriasCre")
    public JAXBElement<ArrayOfMateriasCre> createArrayOfMateriasCre(ArrayOfMateriasCre value) {
        return new JAXBElement<ArrayOfMateriasCre>(_ArrayOfMateriasCre_QNAME, ArrayOfMateriasCre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMateriasNoAprobadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfMaterias_no_aprobadas")
    public JAXBElement<ArrayOfMateriasNoAprobadas> createArrayOfMateriasNoAprobadas(ArrayOfMateriasNoAprobadas value) {
        return new JAXBElement<ArrayOfMateriasNoAprobadas>(_ArrayOfMateriasNoAprobadas_QNAME, ArrayOfMateriasNoAprobadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHorarioExamenesEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfHorarioExamenesEstudiante")
    public JAXBElement<ArrayOfHorarioExamenesEstudiante> createArrayOfHorarioExamenesEstudiante(ArrayOfHorarioExamenesEstudiante value) {
        return new JAXBElement<ArrayOfHorarioExamenesEstudiante>(_ArrayOfHorarioExamenesEstudiante_QNAME, ArrayOfHorarioExamenesEstudiante.class, null, value);
    }

}
