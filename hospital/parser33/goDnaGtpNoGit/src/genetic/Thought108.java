package genetic;
import java.util.ArrayList;
class Thought108 extends Thought{
private static ArrayList<Thought108> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 190.8447923698961;
private double fd1 = 327.39451867668436;
private Thought fo0 = null;
private Thought fo1 = null;
Thought108 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought108 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought108 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought108 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought108 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought108 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought108 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought108 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought108 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought108 instance = new Thought108 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought108 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought108 instance = new Thought108 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought108 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought108 instance = new Thought108 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought108 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought108 instance = new Thought108 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought108 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought108 instance = new Thought108 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought108 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought108 instance = new Thought108 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought108 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought108 instance = new Thought108 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought108 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought108 instance = new Thought108 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    double ld0 = 669.1202800550118;
    fb1 = !fb0;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Output.points[3][2] += fd1;
    boolean lb3 = false;
    double ld4 = 64.63877914508346;
    Thought lo5 = Thought121.getInstance();

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab1 = !ab2;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
        fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = !fb0;
    fd0 = fd1 - fd0;
    fb1 = ab1 || ab2;
    Thought lo0 = Thought85.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought176.getInstance(fb0, fb1, fb0, fb1);
    Output.points[3][3] -= ad2;
    boolean lb1 = true;
    Thought lo2 = Thought131.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    Thought lo3 = Thought87.getInstance(fo0, fo1, fo0, fo1);
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Output.points[3][4] += ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ab1 = ad2 < ad3;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo0 != null){
      ad3 = fo0.m3(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
    double ld0 = 415.7079854222059;
    ad3 = ad4 - fd0;
    double ld1 = 450.6680190789076;
    Output.points[3][5] -= fd0;
        ab4 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[3][6] -= ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought97.getInstance();
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    double ld1 = 705.1692620540442;
    ad2 *= -1;
    fb0 = ad3 > ad4;
    fb1 = !lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    ad2 = ad3 + ad4;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = ad2 > ad3;
        ad4 = fd0 + fd1;
    double ld2 = 427.222647958934;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    ld1 *= -1;
    Output.points[3][7] += ld2;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(fd1, ld1, ld2, ad1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    boolean lb0 = true;
    double ld1 = 187.51176983835006;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(lb2, ab1, ab2, ab3);
}
    double ld3 = 374.14446876403963;
    fd0 = fd1 - ld1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld1, lb0, lb2, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(ld3, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    double ld4 = 243.6666906293318;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, ab1, ab2, ab3);
}
    double ld5 = 745.9589685154274;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld3 = ld4 - ld5;
    ab4 = fd0 > fd1;
    fb0 = ld1 > ld3;
    Output.points[3][8] -= ld4;
    boolean lb6 = false;
    Thought lo7 = Thought169.getInstance(ld5, fd0, fd1, ld1);
    boolean lb8 = false;
    Thought lo9 = Thought263.getInstance(fo1, ao1, ao2, ao3, ld3, ld4, ld5, fd0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ad4 = fd0 + fd1;
    ab3 = ad1 > ad2;
    double ld0 = 792.2279300897118;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    ab2 = ad2 > ad3;
    double ld1 = 773.0818041592506;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3);
}
    ad3 = ad4 + fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 704.7959485520595;
    double ld1 = 101.39000787403224;
    ld1 = fd0 + fd1;
    ld0 = ld1 - fd0;
    boolean lb2 = false;
    Thought lo3 = Thought31.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
    Thought lo4 = Thought363.getInstance();
    Output.points[4][0] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    ld0 = ld1 + fd0;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb0, fb1, lb2, lb5);
}
    boolean lb6 = true;
if(fo0 != null){
      fo0.m3(fd1, ld0, ld1, fd0, lb6, fb0, fb1, lb2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb5, lb6, fb0, fb1);
}
    Output.points[4][1] += ld0;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[4][2] += fd0;
if(fo1 != null){
      ab2 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 > fd0;
        fb0 = fd1 < fd0;
        Output.points[4][3] -= fd1;
        fb1 = !ab1;
        Output.points[4][4] += fd0;
        boolean lb0 = true;
}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    fb0 = !fb1;
    fb0 = !fb1;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought341.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[4][5] -= fd1;
if(fo0 != null){
      fo0.m2();
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
        Thought lo0 = Thought200.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;
    ab1 = fd1 > ad1;
    Thought lo1 = Thought227.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    double ld0 = 334.6583517940551;
if(ao2 != null){
      ao2.m3();
}
    Thought lo1 = Thought76.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
    boolean lb2 = false;
    fd0 *= -1;
    fb0 = fb1 || lb2;
    fd1 = ld0 + fd0;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[4][6] += ad1;
    boolean lb0 = true;
    lb0 = !fb0;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fb1 = !lb0;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    double ld2 = 157.5845106037553;
    lb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld2, ad1);
}
    boolean lb3 = false;
    Thought lo4 = Thought188.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    boolean lb5 = true;
    lb0 = !lb1;
    Thought lo6 = Thought303.getInstance();
    Output.points[4][7] += fd1;
    Thought lo7 = Thought124.getInstance(lb3, lb5, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3, lb0, lb1, lb3, lb5);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
    Thought lo0 = Thought29.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao1 != null){
      fd1 = ao1.m3(ab4, fb0, fb1, lb1);
}
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = !ab1;
    if (ab2) {
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
            Output.points[4][8] -= fd0;
            fd1 *= -1;
if(ao2 != null){
              ao1 = ao2.m4(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
            boolean lb1 = false;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            lb0 = fd0 < fd1;
            ad1 *= -1;
            ab1 = ab2 && ab3;
if(ao2 != null){
              ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
            boolean lb2 = false;
if(ao3 != null){
              ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
            ab3 = fd1 < ad1;
            for(int i1=0; i1<10; i1++){
if(ao3 != null){
                  ao2 = ao3.m4();
}
if(ao4 != null){
                  ao4.m2(ab4, fb0, fb1, lb1);
}
                boolean lb3 = true;
if(fo0 != null){
                  fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb1, lb2, lb0, ab1);
}
if(fo0 != null){
                  ao4 = fo0.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
                ad4 = fd0 + fd1;
                ad1 = ad2 + ad3;
                double ld4 = 407.00032676570424;
                boolean lb5 = false;
                fb0 = fb1 || lb3;
}}}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[5][0] += fd0;
    fd1 *= -1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought261.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = true;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = ab1 && ab2;
    Thought lo0 = Thought112.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
    boolean lb1 = false;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought177.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    fb1 = fb0 || fb1;
    ad4 *= -1;
    fd0 *= -1;
    Thought lo1 = Thought53.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 || fb0;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    Thought lo0 = Thought141.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab4 = fd0 > fd1;
    Thought lo1 = Thought77.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fb0 = fb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2();
}
    ab3 = fd0 < fd1;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    fd0 = fd1 + ad1;
    ab3 = ab4 || fb0;
    boolean lb3 = true;
    fb0 = fb1 && lb2;
    lb3 = ab1 && ab2;
    Thought lo4 = Thought311.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    Thought lo5 = Thought357.getInstance(fo0, fo1, fo0, fo1, lb2, lb3, ab1, ab2);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Output.points[5][1] += fd1;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][2] -= fd1;
    fb0 = fd0 < fd1;
        fd0 *= -1;
    Thought lo0 = Thought243.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought139.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    double ld2 = 636.4586052438698;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb3 = false;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb3, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
    Output.points[5][3] -= ad4;
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    lb0 = ad1 < ad2;
    double ld1 = 753.9007607006819;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = ld1 < ad1;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    double ld0 = 993.7009542798974;
    ab2 = ab3 && ab4;
    fd0 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd1 = ld0 + fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    double ld1 = 435.9964819387473;
    Output.points[5][4] -= ld0;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    double ld0 = 32.875897870732345;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ab2 = ad4 > fd0;
    Output.points[5][5] -= fd1;
    ab3 = ld0 > ad1;
    boolean lb1 = true;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
}
    boolean lb2 = true;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fb0 && fb1;
        double ld1 = 321.7364141109111;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought3.getInstance(lb0, fb0, fb1, lb0);
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb3, fb0, fb1, lb0);
}
    fd0 *= -1;
    lb3 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1, lb0, lb3, fb0, fb1);
}
    Output.points[5][6] += fd0;
    lb0 = fd1 > ld1;
    Thought lo4 = Thought142.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    fb0 = fb1 || lb0;
    lb3 = fb0 && fb1;
    double ld5 = 142.70095089071268;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld5);
}
    lb0 = lb3 && fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb0 = lb3 || fb0;
    Thought lo6 = Thought108.getInstance(fb1, lb0, lb3, fb0);
    fb1 = fd0 > fd1;
    Thought lo7 = Thought175.getInstance(fo1, fo0, fo1, fo0, ld1, ld5, fd0, fd1, lb0, lb3, fb0, fb1);
if(fo1 != null){
      lb0 = fo1.m2(ld1, ld5, fd0, fd1, lb3, fb0, fb1, lb0);
}
    boolean lb8 = true;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        fb0 = fd1 < fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = ab1 || ab2;
        fd1 = fd0 + fd1;
        ab3 = ab4 || fb0;
        boolean lb0 = true;
        double ld1 = 830.492109720509;
        fb0 = !fb1;
        lb0 = ld1 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(ld1, fd0, fd1, ld1);
}
        fd0 = fd1 + ld1;
        Output.points[5][7] += fd0;
        fd1 = ld1 + fd0;
        Output.points[5][8] -= fd1;
        ld1 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    double ld0 = 206.46032289916513;
    Output.points[6][0] += ld0;
    fb1 = ad1 > ad2;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3();
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    ld0 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
    ld0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 - ld0;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    lb2 = fb0 || fb1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = !ab4;
    for(int i0=0; i0<10; i0++){
        if (fb0) {
            boolean lb0 = true;
            Output.points[6][1] += ad1;
            Thought lo1 = Thought320.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
            double ld2 = 937.8258810298728;
            double ld3 = 153.8933939603209;
}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2();
}
    Output.points[6][2] += fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    boolean lb1 = true;
    lb0 = !lb1;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao3.m2(fb1, lb0, lb1, fb0);
}

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    if (fb0) {
        fb1 = fb0 && fb1;
if(ao1 != null){
          fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
        fb0 = fb1 || fb0;
        } else if (fb1) {
        fb0 = ad1 > ad2;
        if (fb1) {
}}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    Thought lo1 = Thought229.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        Output.points[6][3] -= fd0;
        boolean lb2 = false;
        ab4 = !fb0;
if(ao1 != null){
          ao1.m1(fd1, fd0, fd1, fd0, fb1, lb2, lb0, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
        Thought lo3 = Thought203.getInstance();
if(fo0 != null){
          ao4 = fo0.m4(fb1, lb2, lb0, ab1);
}
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        boolean lb4 = false;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][4] += ad1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
        double ld0 = 643.2715350083155;
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 || fb0;
        ad4 *= -1;
        fb1 = fd0 > fd1;
        ab1 = !ab2;
}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought246.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb1 = fd1 < fd0;
    double ld1 = 378.3815457492247;
    boolean lb2 = true;
    boolean lb3 = false;
    lb2 = !lb3;
    double ld4 = 15.209514699443162;
    double ld5 = 933.0171029306603;
    ld4 = ld5 - fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 = ld1 - ld4;
    ld5 = fd0 - fd1;
    fb1 = lb2 && lb3;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, lb3, fb0);
}
    Thought lo6 = Thought216.getInstance(fo0, fo1, fo0, fo1, ld1, ld4, ld5, fd0, fb1, lb2, lb3, fb0);
    boolean lb7 = true;
    double ld8 = 818.730028822976;
    fd0 = fd1 - ld1;
    fb0 = ld4 > ld5;
if(fo0 != null){
      ld8 = fo0.m3(fd0, fd1, ld1, ld4, fb1, lb2, lb3, lb7);
}
    fb0 = fb1 && lb2;
    Thought lo9 = Thought246.getInstance(fo1, fo0, fo1, fo0, lb3, lb7, fb0, fb1);
    ld5 = ld8 - fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && lb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd1 = fd0 - fd1;
    double ld2 = 918.901854932027;
    ld2 = fd0 + fd1;
    ld2 = fd0 - fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    double ld0 = 827.4339894095863;
    Thought lo1 = Thought254.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    Thought lo2 = Thought293.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > ld0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
    fd1 = ld0 - fd0;
    Output.points[6][5] += fd1;
    fb1 = ld0 > fd0;
    Thought lo4 = Thought15.getInstance(fo1, fo0, fo1, fo0);
    boolean lb5 = true;
    Thought lo6 = Thought200.getInstance(fd1, ld0, fd0, fd1);
    Output.points[6][6] -= ld0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
