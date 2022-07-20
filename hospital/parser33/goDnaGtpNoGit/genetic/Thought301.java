package genetic;
import java.util.ArrayList;
class Thought301 extends Thought{
private static ArrayList<Thought301> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 543.8832350625983;
private double fd1 = 785.6861559970143;
private Thought fo0 = null;
private Thought fo1 = null;
Thought301 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought301 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought301 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought301 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought301 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought301 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought301 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought301 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought301 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought301 instance = new Thought301 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought301 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought301 instance = new Thought301 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought301 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought301 instance = new Thought301 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought301 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought301 instance = new Thought301 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought301 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought301 instance = new Thought301 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought301 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought301 instance = new Thought301 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought301 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought301 instance = new Thought301 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought301 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought301 instance = new Thought301 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
        Output.points[3][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
    for(int i0=0; i0<10; i0++){
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought166.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    Output.points[3][7] += fd0;
    fb1 = !ab1;
    ab2 = fd1 > fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
    fd0 *= -1;
    Thought lo3 = Thought43.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    double ld4 = 107.1955424596208;
    fb1 = lb1 || lb2;
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    Output.points[3][8] += ld4;

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
    fb0 = fb1 || fb0;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 > fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought240.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb0 = lb2 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    boolean lb3 = true;
    fb0 = fb1 || lb0;
    lb2 = !lb3;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    lb2 = lb3 || fb0;

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
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(lb0, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought374.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
    ad2 = ad3 + ad4;
    boolean lb2 = false;
    fd0 *= -1;

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
    Output.points[4][0] += fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[4][1] += fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 742.5424345830273;
    Output.points[4][2] += fd0;
    boolean lb1 = false;
    Thought lo2 = Thought85.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
    lb1 = fb0 && fb1;
    lb1 = fb0 && fb1;
    double ld3 = 475.9046616448656;

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
    fb0 = fb1 && fb0;
        Thought lo0 = Thought353.getInstance();
    ad1 *= -1;
    fb1 = !fb0;
    ad2 = ad3 - ad4;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        boolean lb3 = true;
        lb3 = ad1 < ad2;
if(ao3 != null){
          lb1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb3);
}
        lb1 = fb0 || fb1;
        lb2 = lb3 || lb1;
        boolean lb4 = true;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb2);
}
        lb3 = fd0 < fd1;
        ad1 *= -1;
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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought345.getInstance(ao1, ao2, ao3, ao4);
    Thought lo1 = Thought254.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    ab3 = ab4 && fb0;
    fd1 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      fd0 = ao4.m3();
}
    Output.points[4][3] -= fd1;
    Thought lo3 = Thought293.getInstance(fb1, lb2, ab1, ab2);
    ab3 = !ab4;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb2;
    fd1 = fd0 + fd1;
    Thought lo4 = Thought174.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, fd0, fd1, fb1, lb2, ab1, ab2);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Thought lo6 = Thought310.getInstance();

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
    ad1 = ad2 + ad3;
    ad4 *= -1;
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      fd0 = ao2.m3(ab3, ab4, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab4 = fb0 && fb1;
    ad4 = fd0 + fd1;
    lb0 = ad1 > ad2;
if(ao3 != null){
      ad3 = ao3.m3(lb1, lb2, ab1, ab2);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 || lb2;
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
    lb2 = fd1 > ad1;
    ab1 = ad2 < ad3;
    ab2 = ab3 || ab4;

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
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought89.getInstance(fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        double ld2 = 337.5257405228016;
        ld2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
        double ld3 = 929.6785436399979;
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo5 = Thought282.getInstance(lb4, fb0, fb1, lb1);
if(fo0 != null){
          lb4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3, fb0, fb1, lb1, lb4);
}
        fd0 = fd1 + ld2;
if(fo0 != null){
          fo1 = fo0.m4(ld3, fd0, fd1, ld2, fb0, fb1, lb1, lb4);
}
        fb0 = fb1 && lb1;
        lb4 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb4, fb0);
}
if(fo1 != null){
          ld3 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb1 = lb1 && lb4;
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, ld3);
}
        lb6 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1);
}
        double ld7 = 685.8836065567854;
if(fo0 != null){
          ld2 = fo0.m3();
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    Output.points[4][4] -= fd0;
    Output.points[4][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;
    double ld0 = 26.418594286057612;
    boolean lb1 = true;
    fd0 *= -1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    Thought lo2 = Thought194.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, lb1, ab1, ab2);
    double ld3 = 531.5458762145307;
    ld0 = ld3 - fd0;
if(fo1 != null){
      ab3 = fo1.m2(fd1, ld0, ld3, fd0, ab4, fb0, fb1, lb1);
}
    ab1 = ab2 || ab3;
    fd1 = ld0 + ld3;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
}
if(fo1 != null){
      fo1.m3();
}
    double ld5 = 410.7188801557623;
    Output.points[4][6] -= ld5;
    Thought lo6 = Thought213.getInstance(lb1, lb4, ab1, ab2);

Thought.STACK_COUNTER++;
return ab3;
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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[4][7] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought161.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    Output.points[4][8] -= ad4;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought24.getInstance(fo1, fo0, fo1, fo0);
        lb1 = !fb0;
        fb1 = ad3 > ad4;
        fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
}
Thought.STACK_COUNTER++;
return lb1;
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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    double ld1 = 216.78793607883298;
    ad3 = ad4 + fd0;
    ab3 = !ab4;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = lb0 || ab1;
    Output.points[5][0] += fd1;
    ab2 = ld1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
return ab4;
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
    Output.points[5][1] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
        boolean lb0 = true;
    Output.points[5][2] += fd0;
    fb0 = fd1 < fd0;
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
        Output.points[5][3] += fd1;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          lb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 || lb0;
        fd1 *= -1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          fb0 = ao2.m2();
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    fb1 = !fb0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Thought lo0 = Thought371.getInstance(ao4, fo0, fo1, ao1);
    boolean lb1 = false;
if(ao2 != null){
      lb1 = ao2.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && lb1;
    Thought lo2 = Thought197.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, fb0);
}
    fb1 = ad4 > fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    lb1 = fd1 > ad1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
        fb0 = !fb1;

Thought.STACK_COUNTER++;
return lb1;
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
    fd0 = fd1 - fd0;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        }
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    if (fb1) {
        fd0 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 *= -1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    double ld0 = 635.5390659988801;
    Thought lo1 = Thought156.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
    boolean lb2 = false;
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    if (lb2) {
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        ab2 = ab3 && ab4;
        fb0 = fb1 || lb2;
        fd0 *= -1;
        Thought lo3 = Thought71.getInstance();
        ab1 = fd1 < ld0;
if(ao2 != null){
          ad1 = ao2.m3(ab2, ab3, ab4, fb0);
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought267.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = fd0 > fd1;
    double ld2 = 562.8348348944074;
    Output.points[5][4] += ld2;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb3 = false;
    ld2 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[5][5] += ld2;
    double ld4 = 583.8787294930788;
    double ld5 = 273.1578888620022;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb3, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ld4, ld5, fd0, fd1, lb3, fb0, fb1, lb1);
}
    ld2 = ld4 - ld5;
    fd0 = fd1 - ld2;
    lb3 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld4, ld5, fd0, fd1, fb1, lb1, lb3, fb0);
}

Thought.STACK_COUNTER++;
return ld2;
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
    fd1 = fd0 + fd1;
    double ld0 = 187.22467655138485;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        ld0 *= -1;
    Thought lo1 = Thought358.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    Output.points[5][6] += fd1;

Thought.STACK_COUNTER++;
return ld0;
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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    Output.points[5][7] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
        double ld1 = 649.6081820404776;
        boolean lb2 = true;
        ad2 *= -1;
        for(int i1=0; i1<10; i1++){
}}
Thought.STACK_COUNTER++;
return ad4;
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo1 = Thought357.getInstance(ab4, fb0, fb1, lb0);
        fd1 *= -1;
        ad1 *= -1;
        ab1 = !ab2;
        Output.points[5][8] -= ad2;
        ab3 = !ab4;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        boolean lb2 = false;
        Output.points[6][0] -= fd1;
        fb0 = !fb1;
        ad1 = ad2 - ad3;
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
        ab4 = !fb0;
        fb1 = lb2 && lb0;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 + ad1;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    double ld0 = 145.2400726468204;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought46.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    Output.points[6][1] += fd1;
    if (fb1) {
        fb0 = ld0 > fd0;
        double ld2 = 677.1934394434637;
        fd0 = fd1 + ld2;
        ld0 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
return ld0;
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
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = !fb0;
    double ld0 = 12.537756951521267;
    fb1 = fb0 && fb1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Output.points[6][2] -= ad1;
    ad2 *= -1;
    Output.points[6][3] -= ad3;
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        boolean lb2 = true;
if(ao4 != null){
          lb2 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb2);
}
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fb0 = !fb1;
        Output.points[6][4] -= ad3;
        boolean lb3 = true;
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ld0);
}
        ad1 *= -1;
}
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
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
    Thought lo3 = Thought99.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    boolean lb4 = false;
if(fo1 != null){
      fo1.m3();
}
    lb0 = !lb1;
if(ao1 != null){
      ao1.m3(lb2, lb4, ab1, ab2);
}
    boolean lb5 = false;
    fd1 *= -1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb2, lb4, lb5, ab1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ab2 = ad4 > fd0;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought68.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
    double ld1 = 403.28314261927477;
    fb0 = fb1 && ab1;
    Thought lo2 = Thought217.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    double ld3 = 758.5273642915421;
    ab4 = ad4 < fd0;
    fb0 = fb1 && ab1;
    if (ab2) {
if(ao3 != null){
          ao3.m3(fd1, ld1, ld3, ad1, ab3, ab4, fb0, fb1);
}
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    double ld0 = 671.8844937126954;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    double ld1 = 258.57451578482903;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    ld1 *= -1;
    if (fb0) {
        boolean lb2 = false;
        fb0 = fb1 || lb2;
        fd0 = fd1 + ld0;
if(fo0 != null){
          fo0.m1();
}
        } else if (fb1) {
        boolean lb3 = false;
if(fo1 != null){
          fo1.m3(lb3, fb0, fb1, lb3);
}
        fb0 = ld1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb1, lb3, fb0, fb1);
}
        fd1 = ld0 + ld1;
        lb3 = fd0 < fd1;
        fb0 = fb1 && lb3;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld1, fd0, fd1, fb0, fb1, lb3, fb0);
}
        ld0 = ld1 + fd0;
        fb1 = lb3 && fb0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab1 = fo1.m2();
}
    if (ab2) {
if(fo0 != null){
          ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        fd1 *= -1;
        Thought lo0 = Thought141.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
        boolean lb1 = false;
        ab1 = !ab2;
        fd0 *= -1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ab3 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fd1 = fo1.m3(ab4, fb0, fb1, lb1);
}
        ab1 = fd0 > fd1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 < ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[6][5] += ad4;
    fb1 = fd0 > fd1;
    ad1 = ad2 + ad3;
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
        if (fb1) {
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ad4 *= -1;
    ab2 = ab3 && ab4;
    fd0 = fd1 + ad1;
        boolean lb0 = true;
    ab4 = fb0 || fb1;
    boolean lb1 = false;
    lb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    Output.points[6][6] -= ad4;
    Output.points[6][7] -= fd0;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought243.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb5 = true;
        lb1 = fd1 > fd0;
        boolean lb6 = false;
if(ao3 != null){
          ao2 = ao3.m4(lb1, lb2, lb3, lb4);
}
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb5, lb6, lb1);
}
        lb2 = !lb3;
        for(int i1=0; i1<10; i1++){
            fd1 *= -1;
            Thought lo7 = Thought207.getInstance(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb5);
            fd0 = fd1 + fd0;
}}
Thought.STACK_COUNTER++;
return ao3;
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
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[6][8] += ad2;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
    fb0 = !fb1;
    ad3 *= -1;
    boolean lb0 = false;
    ad4 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    lb0 = ad4 > fd0;
    Output.points[7][0] -= fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      ao1.m1(lb1, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
    fb0 = ad1 < ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, lb1, fb0);
}
    Output.points[7][1] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 && lb1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought152.getInstance(ao2, ao3, ao4, fo0);
    ad2 = ad3 + ad4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[7][2] += fd1;
    ab1 = !ab2;
    boolean lb0 = false;
    ab2 = fd0 > fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
}
    Thought lo3 = Thought348.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, lb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab1 = !ab2;
    boolean lb4 = true;
    Thought lo5 = Thought370.getInstance(fd1, fd0, fd1, fd0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    Thought lo6 = Thought357.getInstance();
    ab3 = fd1 > fd0;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, lb0, lb1);
}
    lb2 = lb4 && ab1;
    ab2 = fd1 < fd0;
    boolean lb7 = true;
    double ld8 = 644.227355165877;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad2 = ad3 + ad4;
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    double ld1 = 397.0449928098516;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab1 = ao1.m2(ld1, ad1, ad2, ad3);
}
    ab2 = ab3 || ab4;
    ad4 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fb1 = lb0 && ab1;
if(ao1 != null){
      ab2 = ao1.m2();
}
    Thought lo2 = Thought246.getInstance(ab3, ab4, fb0, fb1);
    boolean lb3 = true;
    lb0 = !lb3;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought280.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, lb3, ab1);
    Output.points[7][3] += fd1;

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
    boolean lb0 = true;
    Thought lo1 = Thought371.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
    fd1 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 || lb0;
    lb2 = fb0 || fb1;
    lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    lb2 = !fb0;
    Thought lo3 = Thought232.getInstance(fd1, fd0, fd1, fd0);
    double ld4 = 727.0265990375755;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0);
}
    fb1 = !lb0;
    lb2 = fd1 < ld4;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m3();
}
            fd0 = fd1 - ld4;
    boolean lb6 = false;

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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought211.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    Thought lo2 = Thought171.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    Thought lo4 = Thought34.getInstance(fd0, fd1, fd0, fd1);
    double ld5 = 699.8493172842662;
        Thought lo6 = Thought160.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld5);
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb3 = !fb0;

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
        fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    double ld0 = 24.94268847098073;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Output.points[7][4] += fd1;
    fb0 = ld0 < fd0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;

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
