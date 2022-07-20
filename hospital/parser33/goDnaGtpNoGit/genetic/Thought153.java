package genetic;
import java.util.ArrayList;
class Thought153 extends Thought{
private static ArrayList<Thought153> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 402.58167363597045;
private double fd1 = 933.8752969870218;
private Thought fo0 = null;
private Thought fo1 = null;
Thought153 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought153 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought153 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought153 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought153 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought153 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought153 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought153 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought153 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought153 instance = new Thought153 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought153 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought153 instance = new Thought153 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought153 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought153 instance = new Thought153 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought153 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought153 instance = new Thought153 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought153 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought153 instance = new Thought153 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought153 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought153 instance = new Thought153 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought153 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought153 instance = new Thought153 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought153 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought153 instance = new Thought153 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Output.points[1][2] += fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo0 = Thought398.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2();
}
    Output.points[1][3] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    Output.points[1][4] -= fd1;
    Thought lo3 = Thought79.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    lb2 = fb0 || fb1;

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
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought367.getInstance(lb0, ab1, ab2, ab3);
    fd1 = fd0 + fd1;
    double ld2 = 864.6834524260792;
    double ld3 = 539.7374968014365;
    Thought lo4 = Thought261.getInstance(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1, ab4, fb0, fb1, lb0);
if(fo0 != null){
      ab1 = fo0.m2(ld2, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;

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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    double ld0 = 114.95830534523283;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld0);
}
    Thought lo1 = Thought272.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fb1 = fb0 || fb1;
    Thought lo2 = Thought172.getInstance();

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
    ab1 = ad2 < ad3;
        ad4 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    double ld0 = 581.8295955703903;
    if (ab1) {
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        } else if (ab3) {
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        if (ab4) {
            fb0 = ld0 < ad1;
            boolean lb1 = true;
            fb0 = ad2 < ad3;
            ad4 = fd0 - fd1;
            Output.points[1][5] += ld0;
            boolean lb2 = true;
            Thought lo3 = Thought50.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
            fb0 = fb1 && lb1;
}}
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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    Output.points[1][6] += fd0;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld1 = 172.4680778867707;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, fd0);
}
    double ld2 = 671.7836164198466;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld2);
}
    boolean lb3 = false;
    fd0 = fd1 + ld1;
    ld2 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo4 = Thought326.getInstance(lb3, fb0, fb1, lb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld2, fd0, fd1, lb3, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m1(ld1, ld2, fd0, fd1, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb3, fb0, fb1, lb0);
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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[1][7] += ad1;
    Thought lo0 = Thought260.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought142.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought267.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[1][8] -= fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    ab4 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    lb0 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    fb0 = fd0 > fd1;
    if (fb1) {
        lb0 = lb1 && lb2;
        fd0 *= -1;
        ab1 = !ab2;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(ab3, ab4, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    double ld0 = 505.06994744915863;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld0;
    fb1 = ab1 || ab2;
    ad1 = ad2 + ad3;
    ab3 = ad4 < fd0;
    for(int i0=0; i0<10; i0++){
        if (ab4) {
            fb0 = fb1 && ab1;
}}
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
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
        Output.points[2][0] += fd0;
        boolean lb0 = true;
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        double ld1 = 788.3307223509936;
        fb1 = lb0 && fb0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - ld1;
        fb1 = !lb0;
if(fo1 != null){
          fo1.m2(fd0, fd1, ld1, fd0);
}
        fb0 = fb1 || lb0;
        fd1 *= -1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
        for(int i1=0; i1<10; i1++){
            boolean lb2 = true;
if(fo1 != null){
              fo1.m1();
}
}}
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought30.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    Thought lo2 = Thought187.getInstance(fo1, fo0, fo1, fo0);
    ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
    lb0 = lb3 && ab1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
    lb0 = lb3 || lb4;
    ab1 = ab2 || ab3;
    ab4 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb3);
}
    Thought lo5 = Thought188.getInstance(fd1, fd0, fd1, fd0, lb4, ab1, ab2, ab3);

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = ad2 > ad3;
    fb1 = fb0 && fb1;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Output.points[2][1] += ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    fb0 = fb1 && fb0;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad1 < ad2;

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
    boolean lb0 = true;
    lb0 = ad1 < ad2;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        Output.points[2][2] += ad3;
        lb0 = ad4 < fd0;
        boolean lb3 = false;
if(fo0 != null){
          fd1 = fo0.m3();
}
        lb0 = lb1 && ab1;
        ab2 = ad1 > ad2;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
        double ld4 = 140.80602959935;
        lb2 = ld4 < ad1;
        ad2 *= -1;
        lb3 = !lb0;
        boolean lb5 = true;
        lb0 = ad3 > ad4;
        fd0 = fd1 + ld4;
        lb1 = ab1 || ab2;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld4, ad1, lb2, lb3, lb5, lb0);
}
        boolean lb6 = false;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 990.6600410781157;
    Thought lo1 = Thought125.getInstance(ao1, ao2, ao3, ao4);
    ld0 *= -1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && fb0;
    Thought lo2 = Thought314.getInstance(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
    fd0 = fd1 - ld0;
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[2][3] -= ad2;
    Thought lo0 = Thought105.getInstance(ad3, ad4, fd0, fd1);
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    boolean lb1 = false;
    double ld2 = 964.6899808791608;
    ad1 = ad2 + ad3;
    lb1 = !fb0;

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
    ab1 = ab2 && ab3;
if(ao1 != null){
      ao1.m3();
}
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    boolean lb2 = true;
    ab1 = fd1 > fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 722.6877400553177;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
    boolean lb1 = false;
if(ao1 != null){
      ab3 = ao1.m2(ad1, ad2, ad3, ad4);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    lb1 = !ab1;
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought244.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
if(ao2 != null){
      fd1 = ao2.m3(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;
    for(int i0=0; i0<10; i0++){
        double ld3 = 983.7970565981846;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought154.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    lb1 = !fb0;
    fd0 = fd1 + fd0;
    double ld2 = 683.0229452785984;
    fb1 = lb1 && fb0;
    fb1 = lb1 && fb0;
    fd0 *= -1;
    fb1 = fd1 < ld2;
    Thought lo3 = Thought378.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
    lb1 = fd1 < ld2;
    fb0 = !fb1;
    lb1 = fd0 > fd1;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo1.m2();
}
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;
    ld2 = fd0 - fd1;
    Thought lo4 = Thought11.getInstance(fb0, fb1, lb1, fb0);
    Output.points[2][4] += ld2;
    fb1 = fd0 < fd1;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + ld2;
    Thought lo5 = Thought59.getInstance(fd0, fd1, ld2, fd0, fb0, fb1, lb1, fb0);

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
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    Output.points[2][5] += fd0;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
        Output.points[2][6] += fd1;
    fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab4 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought217.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 = fd1 + fd0;
    fd1 *= -1;
    boolean lb2 = true;
    fd0 *= -1;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb2, ab1);
}
        ab2 = fd1 < fd0;
        ab3 = ab4 && fb0;
        if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, ab1, ab2);
}
            boolean lb3 = true;
}}
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
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    Thought lo0 = Thought2.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    if (fb0) {
        } else {
if(fo0 != null){
          fo0.m1();
}
        double ld1 = 550.051711103818;
        double ld2 = 676.1723866674423;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld1, ld2, ad1, ad2, fb1, fb0, fb1, fb0);
}
        ad3 = ad4 - fd0;
        fd1 = ld1 - ld2;
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = true;
    Thought lo1 = Thought317.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    lb0 = ab1 || ab2;
    ad3 = ad4 + fd0;
    boolean lb2 = true;
    boolean lb3 = false;
    ab1 = ab2 && ab3;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    double ld0 = 156.7073953254991;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld1 = 753.71174676644;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, fd0, fd1);
}
    Thought lo2 = Thought99.getInstance(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo3 = Thought375.getInstance(fb1, fb0, fb1, fb0);

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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    Output.points[2][7] += ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    Output.points[2][8] += fd0;
    boolean lb0 = true;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    Output.points[3][0] += ad4;
    fb0 = !fb1;
    Thought lo2 = Thought264.getInstance(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
    lb0 = fd0 < fd1;
    lb1 = !fb0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Output.points[3][1] += ad1;
    if (fb1) {
        ad2 = ad3 - ad4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = !ab2;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Output.points[3][2] -= fd1;
    double ld0 = 487.86905543357415;
    ab3 = ld0 < fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    boolean lb1 = false;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb1, lb1, lb2, ab1);
}
    Output.points[3][3] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      lb0 = ao1.m2();
}
    lb1 = ad3 < ad4;
    Output.points[3][4] += fd0;
    ab1 = ab2 && ab3;
    double ld2 = 855.5664778368135;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
    lb1 = ab1 && ab2;
    fd0 = fd1 - ld2;
    ad1 = ad2 - ad3;

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
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
        fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 793.3238911753335;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 1000.796488484329;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld3, fd0);
}
    lb1 = lb2 || fb0;
    Thought lo4 = Thought89.getInstance();
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, lb2, fb0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = !ab1;
    ab2 = ab3 && ab4;
    Output.points[3][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[3][6] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][7] += fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    lb1 = fd1 > fd0;
    Thought lo2 = Thought280.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        double ld3 = 964.2931860001606;
if(fo1 != null){
          ab1 = fo1.m2();
}
        fd0 = fd1 + ld3;
        ab2 = ab3 || ab4;
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
    ad2 *= -1;
    double ld0 = 97.65195295396333;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    double ld3 = 522.8692759113461;
    boolean lb4 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld3, ad1, lb1, lb2, lb4, fb0);
}
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, lb1, lb2, lb4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, lb4, fb0);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ad1 > ad2;
    boolean lb5 = true;
    Output.points[3][8] += ad3;
    lb1 = lb2 && lb4;
    boolean lb6 = false;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ld3);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought398.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    ab2 = ab3 || ab4;
    boolean lb1 = false;
    double ld2 = 15.326117732557435;
    ab4 = ad4 < fd0;
    boolean lb3 = true;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = false;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb1, lb3);
}
    lb4 = ab1 || ab2;
    ab3 = fd1 > ld2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ad1, lb3, lb4, ab1, ab2);
}
    ab3 = ab4 || fb0;
    double ld5 = 806.1384356481873;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][0] -= fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
            fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 *= -1;
    double ld0 = 126.26094204711012;
    fb1 = fb0 && fb1;
    Output.points[4][1] -= fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    Thought lo2 = Thought76.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
    Thought lo3 = Thought93.getInstance();
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
    boolean lb4 = false;
    fd1 = ld0 + fd0;
    lb4 = !fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    fb1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 360.357517868337;
    Thought lo1 = Thought257.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ld0;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    Thought lo2 = Thought323.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
    fb1 = fb0 || fb1;
    boolean lb3 = false;
    double ld4 = 325.7394109221976;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m2(lb3, fb0, fb1, lb3);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb3, fb0);
}
    fb1 = ld0 > ld4;
    lb3 = fb0 && fb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    double ld0 = 592.1714561952341;
    fd0 *= -1;
    ab4 = fb0 && fb1;
    Thought lo1 = Thought214.getInstance(ao3, ao4, fo0, fo1);
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
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
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    ad1 *= -1;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    Output.points[4][2] += ad3;
    boolean lb1 = true;
    boolean lb2 = true;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;

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
    double ld0 = 481.17917087440213;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
              fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[4][3] -= fd0;
    fd1 *= -1;
    boolean lb1 = true;
    ld0 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
}
    fd1 = ld0 + fd0;

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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    fb0 = fd1 < fd0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
    Thought lo2 = Thought238.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    lb0 = fd1 > fd0;
    boolean lb3 = false;
    fd1 = fd0 + fd1;
    lb1 = fd0 < fd1;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    boolean lb4 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = fd0 > fd1;
    lb3 = fd0 < fd1;

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
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
    Thought lo0 = Thought118.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld1 = 314.52268610391786;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    Output.points[4][4] -= ld1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    double ld3 = 984.2889044221478;
    double ld4 = 63.00986774440391;
    boolean lb5 = true;
    boolean lb6 = false;
    boolean lb7 = false;
    lb2 = ld3 > ld4;

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
