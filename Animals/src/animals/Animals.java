
package animals;

public class Animals {

    public static void main(String[] args) {
        dog dog_Obj = new dog();
        cat cat_Obj = new cat();
        snake snake_Obj = new snake();
        
        dog_Obj.noise();
        dog_Obj.follow();
        dog_Obj.fetch();
        dog_Obj.chase();
        
        cat_Obj.noise();
        cat_Obj.follow();
        cat_Obj.lickPaw();
        cat_Obj.scratch();
        
        snake_Obj.noise();
        snake_Obj.follow();
        snake_Obj.slither();
        snake_Obj.eatRabbit();
        
    }
    
}
