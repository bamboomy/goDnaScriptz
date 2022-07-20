package genetic;
import java.util.ArrayList;
class Thought171 extends Thought{
private static ArrayList<Thought171> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 106.01893603684415;
private double fd1 = 159.88449579354366;
private Thought fo0 = null;
private Thought fo1 = null;
Thought171 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought171 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought171 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought171 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought171 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought171 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought171 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought171 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought171 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought171 instance = new Thought171 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought171 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought171 instance = new Thought171 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought171 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought171 instance = new Thought171 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought171 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought171 instance = new Thought171 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought171 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought171 instance = new Thought171 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought171 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought171 instance = new Thought171 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought171 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought171 instance = new Thought171 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought171 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought171 instance = new Thought171 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought351.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought345.getInstance(ab1, ab2, ab3, ab4);
    boolean lb1 = false;
    double ld2 = 312.46368787555645;
    Thought lo3 = Thought130.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb1);
    fd1 = ld2 - fd0;
    ab1 = fd1 > ld2;
    Thought lo4 = Thought343.getInstance(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
    double ld5 = 489.8262451859216;
    fd0 = fd1 + ld2;
    ld5 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, ld5);
}
    fd0 = fd1 - ld2;
    fb1 = lb1 && ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      ld5 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld5);
}
if(fo1 != null){
      fo1.m2();
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, ab1, ab2);
}
    ld2 *= -1;

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
    double ld0 = 118.47387260539257;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought86.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld2 = 841.2204883586712;
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb3 = true;
        fb0 = ld2 > ad1;
        fb1 = !lb3;
        Thought lo4 = Thought105.getInstance(ad2, ad3, ad4, fd0);
        fb0 = fd1 < ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 241.1256267065698;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought205.getInstance(ab1, ab2, ab3, ab4);
    Thought lo2 = Thought56.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    double ld3 = 649.6531496569872;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ld3, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought271.getInstance(ad4, fd0, fd1, ld0);
    ld3 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
    ld0 = ld3 + ad1;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    double ld5 = 304.9643781520897;
    ab1 = ab2 || ab3;
        ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Thought lo0 = Thought97.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[5][3] += fd0;
    if (fb1) {
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
          ao1.m2();
}
if(ao2 != null){
          fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        fb1 = !fb0;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb0 = !fb1;
        boolean lb1 = false;
        lb1 = fb0 || fb1;
        boolean lb2 = true;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought146.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    Thought lo2 = Thought205.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
if(ao1 != null){
      fo1 = ao1.m4();
}
    if (fb0) {
        fb1 = ad3 > ad4;
        fd0 = fd1 + ad1;
if(ao3 != null){
          ao2 = ao3.m4(lb1, fb0, fb1, lb1);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
        boolean lb3 = false;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb3, lb1);
}
        boolean lb4 = true;
        Thought lo5 = Thought385.getInstance(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb3);
        lb4 = lb1 || fb0;
        ad4 = fd0 + fd1;
        double ld6 = 180.592011852253;
        boolean lb7 = true;
        Thought lo8 = Thought378.getInstance(ao3, ao4, fo0, fo1);
        fb0 = !fb1;
        lb3 = lb4 && lb7;
        ld6 = ad1 - ad2;
        Output.points[5][4] += ad3;
        lb1 = fb0 || fb1;
if(ao1 != null){
          lb3 = ao1.m2(ad4, fd0, fd1, ld6);
}
        boolean lb9 = false;
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
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    Output.points[5][5] -= fd1;
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    double ld1 = 973.691351874654;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld1 = ad1 + ad2;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb0, lb2, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = ad3 > ad4;
    boolean lb3 = false;
    fd0 = fd1 - ld1;
    fb0 = ad1 > ad2;
    double ld4 = 484.3802139886348;
    ad2 *= -1;
    fb1 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, ld4);
}
    boolean lb5 = false;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    Output.points[5][6] -= fd1;
    Thought lo6 = Thought53.getInstance();

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
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    double ld0 = 794.6700454013906;
    fb1 = ld0 > fd0;
    fb0 = fd1 < ld0;
    boolean lb1 = true;
    Output.points[5][7] -= fd0;
    boolean lb2 = true;
    fd1 = ld0 + fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
        lb2 = ld0 > fd0;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb2);
}
            ld0 = fd0 + fd1;
            boolean lb3 = true;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb3);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              fo0.m3(ld0, fd0, fd1, ld0);
}
            fd0 = fd1 - ld0;
            boolean lb4 = false;
            fd0 *= -1;
            Output.points[5][8] += fd1;
            }
        lb2 = ld0 > fd0;
        boolean lb5 = false;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought295.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab2 = !ab3;
    ab4 = !fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1();
}
    double ld1 = 483.572828984217;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    Output.points[6][0] -= ld1;
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld2 = 934.0111876568076;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, fd0, fd1);
}
    double ld3 = 85.61245274593512;
    boolean lb4 = false;
    Thought lo5 = Thought179.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, ld3, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb4);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ld3, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ld1 = ld2 + ld3;

Thought.STACK_COUNTER++;
return lb4;
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
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    lb1 = ad3 > ad4;
    fd0 = fd1 - ad1;
    lb2 = !fb0;
    Thought lo3 = Thought131.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ad2 < ad3;
    double ld4 = 142.5823557709353;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ld4 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb5 = true;
    Thought lo6 = Thought160.getInstance();
    lb0 = lb1 && lb2;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(lb5, fb0, fb1, lb0);
}
    double ld7 = 707.1850668638333;
    fd0 = fd1 + ld4;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    ad4 = fd0 + fd1;
    fb1 = ad1 < ad2;
    Thought lo0 = Thought353.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = ad3 < ad4;
    double ld2 = 322.60194212807187;
    fb0 = fb1 && lb1;
    ab1 = !ab2;
    ab3 = ad4 < fd0;
    ab4 = fd1 < ld2;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
    boolean lb4 = false;
    fd0 = fd1 + ld2;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld5 = 82.31459360646393;
    ab3 = fd0 < fd1;
    ab4 = ld2 > ld5;
    boolean lb6 = true;
    Thought lo7 = Thought56.getInstance();
    ab4 = fb0 && fb1;
    lb1 = ad1 < ad2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    fd1 *= -1;

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
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought392.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
    fb0 = fb1 || fb0;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = ad1 > ad2;
    double ld1 = 839.6492609857223;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld1;
    double ld2 = 643.7257397298399;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought53.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    double ld1 = 317.3882813948121;
    Thought lo2 = Thought149.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab1 = !ab2;
if(fo0 != null){
      fo0.m3(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
    ab3 = ab4 && fb0;
    fb1 = lb3 || ab1;
    Thought lo4 = Thought250.getInstance();
    boolean lb5 = true;
    Thought lo6 = Thought243.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1, lb5, ab1, ab2, ab3);
}
    ld1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb3);
}

Thought.STACK_COUNTER++;
return lb5;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Output.points[6][1] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
        double ld0 = 129.2841886358516;
        ab2 = ab3 || ab4;
if(ao2 != null){
          ao2.m3(ad2, ad3, ad4, fd0);
}
        double ld1 = 369.08782135208713;
        fb0 = fd0 > fd1;
        Thought lo2 = Thought381.getInstance(ao3, ao4, fo0, fo1, ld0, ld1, ad1, ad2);
        Output.points[6][2] -= ad3;
if(ao2 != null){
          ao1 = ao2.m4();
}
        ad4 *= -1;
        double ld3 = 697.8100593155016;
if(ao3 != null){
          ad4 = ao3.m3(fb1, ab1, ab2, ab3);
}
        fd0 = fd1 + ld0;
        Output.points[6][3] -= ld1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
if(fo0 != null){
          ao4 = fo0.m4(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought356.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought59.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    boolean lb1 = false;
        Thought lo2 = Thought73.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        fd1 *= -1;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 997.435343362349;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 *= -1;
    boolean lb1 = false;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    lb1 = ld0 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[6][4] += fd1;
    fb0 = ld0 > ad1;
    fb1 = lb1 && fb0;
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
    ld0 *= -1;
    lb1 = ad1 > ad2;
    boolean lb2 = true;
    ad3 = ad4 + fd0;
if(fo0 != null){
          lb2 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb1, lb2);
}
    fb0 = fb1 && lb1;
    lb2 = fd1 > ld0;
    double ld3 = 199.51844713275614;
    fb0 = !fb1;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, ld0, ld3, lb2, fb0, fb1, lb1);
}
    boolean lb4 = false;
    lb2 = ad1 < ad2;
    ad3 = ad4 + fd0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought102.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    Output.points[6][5] += fd0;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 691.7017964890046;
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    ab2 = fd0 > fd1;
    Output.points[6][6] += ld1;
    ab3 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought208.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    Thought lo1 = Thought311.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
}
        Thought lo2 = Thought89.getInstance(fd1, fd0, fd1, fd0);
        fd1 = fd0 - fd1;
        fd0 *= -1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        Output.points[6][7] -= fd1;
        fb0 = fb1 && fb0;
        boolean lb3 = false;
        Thought lo4 = Thought126.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb3, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb3, fb0, fb1);
}
        boolean lb5 = false;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb3, lb5, fb0, fb1);
}
        lb3 = fd0 > fd1;
        Output.points[6][8] -= fd0;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, lb5, fb0, fb1, lb3);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Thought lo6 = Thought139.getInstance(fd1, fd0, fd1, fd0);
        fd1 *= -1;
        Output.points[7][0] += fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        boolean lb0 = true;
        lb0 = ad1 > ad2;
        ad3 = ad4 - fd0;
        for(int i0=0; i0<10; i0++){
            fb0 = fd1 > ad1;
if(ao1 != null){
              ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
            fb1 = !lb0;
if(fo1 != null){
              ad1 = fo1.m3();
}
            ad2 = ad3 + ad4;
if(ao1 != null){
              ao1.m2(fb0, fb1, lb0, fb0);
}
            fb1 = fd0 < fd1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
              ao2.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
            lb0 = fb0 && fb1;
if(ao2 != null){
              ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
            ad4 *= -1;
            if (lb0) {
                fd0 = fd1 + ad1;
                boolean lb1 = true;
if(ao1 != null){
                  ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
                  fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
                  fd0 = ao1.m3();
}
                Thought lo2 = Thought109.getInstance(lb0, fb0, fb1, lb1);
                double ld3 = 368.37616706013154;
                fd0 = fd1 - ld3;
}}}
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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought369.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = ab1 || ab2;
    ab3 = fd1 < fd0;
    ab4 = fd1 > fd0;
    boolean lb1 = false;
    boolean lb2 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
    ab4 = fd1 < fd0;
    fd1 = fd0 - fd1;

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
    boolean lb0 = true;
    Output.points[7][1] += ad2;
if(ao2 != null){
      ab1 = ao2.m2();
}
    Output.points[7][2] += ad3;
    ab2 = ad4 < fd0;
    fd1 = ad1 - ad2;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, ab1, ab2);
}
    boolean lb1 = false;
    boolean lb2 = true;
    ab1 = ad3 > ad4;
    fd0 *= -1;
    ab2 = ab3 && ab4;
    boolean lb3 = false;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    lb2 = ad4 < fd0;
if(ao4 != null){
      lb3 = ao4.m2(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
        lb0 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought280.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb0 = !fb0;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;

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
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb1 = !ab1;
    Thought lo2 = Thought352.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;

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
    fb0 = ad1 < ad2;
    Output.points[7][3] += ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = true;
    lb1 = ad1 < ad2;
    Thought lo3 = Thought246.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = lb4 || fb0;

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
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
        double ld0 = 305.3365997163042;
        fb1 = ad2 > ad3;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = ad4 > fd0;
        Output.points[7][4] -= fd1;
        Thought lo1 = Thought137.getInstance(fo1, fo0, fo1, fo0);
        ld0 *= -1;
        ad1 *= -1;
        ad2 *= -1;
        Thought lo2 = Thought44.getInstance(ad3, ad4, fd0, fd1);
        ab1 = !ab2;
        ab3 = !ab4;
        boolean lb3 = false;
        double ld4 = 599.9865392491062;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld4, ad1, ad2);
}
if(fo1 != null){
          ad3 = fo1.m3();
}
        Thought lo5 = Thought164.getInstance(ab4, fb0, fb1, lb3);
        ab1 = ad4 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld4, ad1, ad2, ab2, ab3, ab4, fb0);
}
        ad3 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(ad4, fd0, fd1, ld0, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb3);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][5] += fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought113.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    if (fb0) {
}
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
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 126.24173210009953;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fb1 = lb1 && fb0;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
if(ao1 != null){
          ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
          fo1.m2();
}
        Thought lo3 = Thought320.getInstance(fb0, fb1, lb2, lb1);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, lb1);
}
        }
    Thought lo4 = Thought335.getInstance(fd0, fd1, ld0, ad1, fb1, lb1, fb0, fb1);
    Thought lo5 = Thought246.getInstance(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
        boolean lb6 = false;
    lb6 = ad2 > ad3;
    Output.points[7][6] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    if (ab1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        boolean lb0 = true;
        double ld1 = 279.95043263247754;
if(ao3 != null){
          ld1 = ao3.m3();
}
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        Thought lo2 = Thought129.getInstance(fb1, lb0, ab1, ab2);
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          fd1 = ao3.m3(ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
        double ld3 = 244.038259728334;
        ab4 = fb0 || fb1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
        ld3 = fd0 - fd1;
        } else {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    lb0 = ad4 < fd0;
    double ld1 = 629.8206020939193;
    Output.points[7][7] += fd0;
    fd1 = ld1 + ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ad1);
}
    lb2 = lb3 || ab1;
    Thought lo4 = Thought88.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
if(ao1 != null){
      fd1 = ao1.m3();
}
    ab2 = ld1 < ad1;
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb2);
}
    Thought lo5 = Thought34.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb3, ab1, ab2, ab3);
    double ld6 = 574.9431947062209;
    fd0 = fd1 - ld1;
    ab4 = fb0 && fb1;
    Thought lo7 = Thought371.getInstance(ld6, ad1, ad2, ad3, lb0, lb2, lb3, ab1);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld8 = 890.5161459492839;
    ad3 = ad4 + fd0;

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
    double ld0 = 518.8431249256693;
        fb0 = ld0 < fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Output.points[7][8] -= ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 < ld0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
    lb1 = !lb2;
    fd0 = fd1 - ld0;
    fb0 = fd0 < fd1;

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;

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
    fd0 = fd1 - fd0;
        double ld0 = 220.93657447344373;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - fd0;
    double ld1 = 513.1969699432611;
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fd1 = ld0 + ld1;
    boolean lb3 = false;
    Thought lo4 = Thought268.getInstance(fo0, fo1, fo0, fo1);
    Output.points[8][0] += fd0;

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
