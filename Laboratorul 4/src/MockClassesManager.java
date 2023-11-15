package clase;
public class MockClassesManager implements ISourceManager {
    @Override
    public void AddCurs(Curs curs){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void UpdateCurs(Curs curs){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void DeleteCurs(Curs curs){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Curs[] GetCursuri(){
        Curs[] cursuri = new Curs[1];
        Student[] studenti = new Student[]{new Student("Andrei","Negoita",2231), new Student("Ion","Mateescu",4221)};
        Professor prof = new Professor("Anton","Panaitescu");
        cursuri[0] = new Curs("Rezistenta Materialelor" , "calculul reactiunilor, \n " + "diagramele de eforturi , calcululcaracteristicilor geometriceale \n " + "suprafetelorplane s i c a l c u l u l e l e m e n t e l o r de r e z i s t e n t a l a s o l i c i t a r is i m p l e \n " , prof , s t u d e n t i ) ;)
        return cursuri;
        }
    }
}
