package genetic;
import java.util.ArrayList;
class Thought230 extends Thought{
private static ArrayList<Thought230> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 461.62908264921555;
private double fd1 = 576.8154207577056;
private Thought fo0 = null;
private Thought fo1 = null;
Thought230 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought230 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought230 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought230 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought230 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought230 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought230 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought230 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought230 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought230 instance = new Thought230 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought230 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought230 instance = new Thought230 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought230 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought230 instance = new Thought230 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought230 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought230 instance = new Thought230 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought230 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought230 instance = new Thought230 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought230 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought230 instance = new Thought230 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought230 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought230 instance = new Thought230 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought230 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought230 instance = new Thought230 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        lb0 = !ab1;
        if (ab2) {
if(fo1 != null){
              fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
            lb0 = fd0 > fd1;
            ab1 = fd0 < fd1;
            fd0 = fd1 - fd0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
            Output.points[8][6] -= fd1;
            boolean lb1 = false;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb0);
}
            ab1 = !ab2;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
              fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
            Output.points[8][7] -= fd1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][8] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    ad1 *= -1;
    fb1 = ad2 < ad3;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    lb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb1 = lb0 && lb1;
    fb0 = fb1 || lb0;
    ad2 = ad3 + ad4;

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
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    double ld1 = 326.3304840123539;
    boolean lb2 = false;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[0][0] += ad1;
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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        Thought lo1 = Thought62.getInstance(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        double ld2 = 865.1766624616021;
if(ao4 != null){
          ao4.m1(fd0, fd1, ld2, fd0);
}
        boolean lb3 = false;
        Output.points[0][1] -= fd1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2);
}
        Output.points[0][2] += fd0;
if(ao4 != null){
          fd1 = ao4.m3();
}
        lb3 = !fb0;
        ld2 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, lb3, fb0);
}
        if (fb1) {
            double ld4 = 222.8087010891833;
            ld4 = ld2 + fd0;
            double ld5 = 891.5782627151162;
            Output.points[0][3] += fd0;
if(ao1 != null){
              lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld4, ld5, ld2, lb3, fb0, fb1, lb0);
}
if(ao1 != null){
              fo1 = ao1.m4(fd0, fd1, ld4, ld5, lb3, fb0, fb1, lb0);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb0);
}
            } else {
            lb3 = fb0 && fb1;
            boolean lb6 = true;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][4] -= ad1;
    if (fb0) {
        fb1 = fb0 || fb1;
        fb0 = ad2 < ad3;
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
        fd0 *= -1;
        Thought lo0 = Thought343.getInstance(fd1, ad1, ad2, ad3);
        fb1 = fb0 && fb1;
        fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
        fb0 = fb1 && fb0;
if(ao1 != null){
          ao1.m2();
}
        boolean lb1 = true;
        fb0 = fb1 || lb1;
        boolean lb2 = false;
        ad2 = ad3 - ad4;
        Thought lo3 = Thought21.getInstance(lb2, fb0, fb1, lb1);
        fd0 = fd1 + ad1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb1);
}
        lb2 = fb0 || fb1;
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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    double ld0 = 308.13456761256253;
    fb0 = fd0 > fd1;
    ld0 = fd0 + fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    Output.points[0][5] -= fd1;
if(fo1 != null){
      ld0 = fo1.m3();
}
    fb1 = ab1 && ab2;
if(ao1 != null){
      ao1.m1(ab3, ab4, fb0, fb1);
}
    Output.points[0][6] += fd0;

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
    Thought lo0 = Thought108.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    double ld1 = 621.5681910610026;
    Thought lo2 = Thought107.getInstance(ad4, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
    Thought lo3 = Thought234.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
    boolean lb4 = true;
if(ao4 != null){
      lb4 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab1 = ad1 > ad2;
    double ld5 = 226.15810543056384;
    ab2 = ad2 < ad3;
    Thought lo6 = Thought24.getInstance(ad4, fd0, fd1, ld1);

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
    fd1 *= -1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[0][7] -= fd1;
    lb0 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    Thought lo1 = Thought73.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    boolean lb2 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[0][8] -= fd0;
    double ld3 = 841.5804236820909;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = fd0 > fd1;
    Thought lo0 = Thought274.getInstance(ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;

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
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought105.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought258.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought258.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4();
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought45.getInstance(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    Thought lo1 = Thought265.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
    Output.points[1][0] += fd0;
    ab2 = fd1 > ad1;
    ab3 = ab4 && fb0;
    Output.points[1][1] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    ab2 = !ab3;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2();
}
    Output.points[1][2] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, lb2, ab1, ab2);
}
    Output.points[1][3] -= ad4;
    ab3 = fd0 < fd1;
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[1][4] -= ad3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    double ld1 = 391.88222390032536;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1);
}
    fb1 = !lb0;
    Thought lo2 = Thought278.getInstance();
    fb0 = fb1 && lb0;
    fb0 = fd0 < fd1;
    fb1 = ld1 > fd0;
    Output.points[1][5] -= fd1;
    ld1 = fd0 - fd1;
    lb0 = !fb0;
        ld1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < ld1;
    double ld3 = 224.34414494102217;
    lb0 = ld3 < fd0;
if(fo0 != null){
      fo0.m1(fd1, ld1, ld3, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    ld1 = ld3 - fd0;

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
    Thought lo0 = Thought83.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    Thought lo2 = Thought243.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    Thought lo3 = Thought168.getInstance();
    lb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    double ld4 = 623.5251460984541;
    lb1 = !fb0;
if(fo0 != null){
      ad4 = fo0.m3(fb1, lb1, fb0, fb1);
}
    double ld5 = 449.0649926095856;
    Thought lo6 = Thought364.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld4, lb1, fb0, fb1, lb1);
    fb0 = !fb1;
    ld5 *= -1;
    lb1 = fb0 || fb1;
    lb1 = fb0 && fb1;
    double ld7 = 857.4256810494645;
if(ao4 != null){
      ao4.m2(ld7, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
    Thought lo8 = Thought324.getInstance(fo0, fo1, ao1, ao2);
    Thought lo9 = Thought260.getInstance(ad4, fd0, fd1, ld4);

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
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought250.getInstance();
    ab1 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    double ld2 = 118.8349783709233;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1, fb1, lb0, ab1, ab2);
}
    double ld3 = 860.0916848889992;
if(ao2 != null){
      ao1 = ao2.m4(ld2, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
    if (lb0) {
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        double ld4 = 200.45996734179505;
        boolean lb5 = true;
        ld4 = ld2 + ld3;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        fd0 = fd1 - ld4;
        ld2 = ld3 + fd0;
if(ao1 != null){
          ab4 = ao1.m2(fd1, ld4, ld2, ld3);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld4, ld2);
}
        fb0 = !fb1;
        ld3 = fd0 - fd1;
        ld4 = ld2 - ld3;
        fd0 = fd1 + ld4;
        boolean lb6 = false;
        ld2 *= -1;
if(ao2 != null){
          ao1 = ao2.m4();
}
}
Thought.STACK_COUNTER++;
return lb0;
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
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ad1 *= -1;
    ab4 = fb0 || fb1;
    double ld0 = 413.05006403703044;
    Thought lo1 = Thought238.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 = fd1 + ld0;
    Thought lo2 = Thought93.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    double ld3 = 898.7118795441359;
if(fo1 != null){
      ld3 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ad1 = ad2 - ad3;
    Thought lo4 = Thought251.getInstance(ad4, fd0, fd1, ld0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld3, ad1, ad2, ad3);
}
    Thought lo5 = Thought10.getInstance();
    ab3 = ad4 < fd0;
    Thought lo6 = Thought397.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ld3, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Output.points[1][6] += fd1;
    boolean lb7 = false;
    boolean lb8 = false;
    ld0 = ld3 - ad1;
    boolean lb9 = false;
    boolean lb10 = true;

Thought.STACK_COUNTER++;
return lb10;
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
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[1][7] -= fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
        fd0 *= -1;
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
    Thought lo0 = Thought27.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    Output.points[1][8] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought235.getInstance();
    double ld2 = 315.2084782966081;
    ld2 = fd0 + fd1;
    boolean lb3 = false;
    ab3 = ld2 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, lb3);
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      lb3 = fo0.m2(fd1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb3;
    ab1 = ld2 > fd0;
    Thought lo4 = Thought237.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb3 && ab1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(ld2, fd0, fd1, ld2);
}
    fd0 = fd1 + ld2;

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
    fb0 = ad1 < ad2;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 > ad2;
    ad3 *= -1;
    fb0 = ad4 > fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 || fb1;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;

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
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ad1 = ad2 - ad3;
    Thought lo0 = Thought117.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb2);
}
    ab1 = ad3 > ad4;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought4.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2);
}
    lb1 = ad3 > ad4;
    Thought lo4 = Thought182.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb2 = fo0.m2(ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;

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
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    double ld0 = 548.0590475247809;
    fb0 = ld0 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
    Output.points[2][0] += fd0;
    fd1 *= -1;
    ld0 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld0;
        fd0 = fd1 - ld0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        boolean lb1 = true;
        for(int i1=0; i1<10; i1++){
            fb0 = !fb1;
if(ao3 != null){
              lb1 = ao3.m2(fd0, fd1, ld0, fd0);
}
            fb0 = fb1 && lb1;
            fd1 = ld0 - fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 686.3682011874303;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    fb0 = ld0 < ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fd1 = ld0 - ad1;
    fb0 = !fb1;
    double ld2 = 429.54109918057054;
    lb1 = ad1 < ad2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought186.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    double ld1 = 218.79462579244108;
    fd0 = fd1 + ld1;
    ab4 = !fb0;
    fd0 = fd1 - ld1;
    double ld2 = 952.0675740142752;
    fb1 = ld2 > fd0;
    boolean lb3 = false;
    lb3 = ab1 && ab2;
    ab3 = !ab4;
    double ld4 = 219.51787375030543;
    boolean lb5 = false;
    fd0 *= -1;
    ab4 = fd1 > ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb3, lb5);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    ld2 *= -1;

Thought.STACK_COUNTER++;
return ld4;
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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ab1 = ad4 > fd0;
    Thought lo0 = Thought41.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd1 = ad1 + ad2;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[2][1] -= fd0;
    fd1 = ad1 + ad2;
    fb1 = ab1 && ab2;
    ab3 = !ab4;

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
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 547.3300410180485;
    Output.points[2][2] += fd0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    double ld1 = 247.6101741020304;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    ld0 *= -1;
    ld1 = fd0 - fd1;
    boolean lb3 = false;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb2);
}
    ld1 = fd0 - fd1;
    lb3 = ld0 > ld1;
    Output.points[2][3] -= fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought106.getInstance(fo1, fo0, fo1, fo0);
        fb0 = fb1 || lb2;
        fd1 = ld0 + ld1;
        lb3 = fb0 || fb1;
if(fo1 != null){
          fo1.m3(fd0, fd1, ld0, ld1);
}
        if (lb2) {
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld2 = 664.6268790559603;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb3, ab1, ab2);
}
    ld2 = fd0 + fd1;
    Thought lo4 = Thought132.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0, lb0, lb1, lb3, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    double ld2 = 816.40134460246;
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fd1, ld2, ad1, ad2, lb1, fb0, fb1, lb0);
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
    ab2 = ab3 || ab4;
    fb0 = ad2 < ad3;
    Thought lo0 = Thought335.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    Thought lo1 = Thought43.getInstance(fo1, fo0, fo1, fo0);
    ab4 = !fb0;
    double ld2 = 128.5472600032292;
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        fb1 = !ab1;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld2);
}
        Thought lo3 = Thought119.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
        ab2 = fd0 < fd1;
        double ld4 = 643.984721668973;
        ld4 = ld2 + ad1;
        double ld5 = 439.8946705584631;
        ad1 = ad2 - ad3;
        ab3 = ad4 < fd0;
        ab4 = fb0 || fb1;
        Thought lo6 = Thought104.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
        double ld7 = 172.31348265853313;
        fb0 = fd0 > fd1;
        for(int i1=0; i1<10; i1++){
            Output.points[2][4] -= ld4;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, ld7, ld2, ad1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
              ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
            if (ab2) {
}}}
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
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo0 = Thought131.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    double ld1 = 26.113076654709012;
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
if(ao1 != null){
      fb1 = ao1.m2();
}
        fb0 = fd1 < ld1;
    boolean lb2 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought317.getInstance(fb0, fb1, fb0, fb1);
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        fb1 = ad3 < ad4;
        } else if (fb0) {
        fb1 = !fb0;
        fb1 = fd0 > fd1;
        Output.points[2][5] += ad1;
        ad2 *= -1;
        fb0 = ad3 < ad4;
        Thought lo1 = Thought36.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
        fb1 = ad3 > ad4;
        Output.points[2][6] -= fd0;
        boolean lb2 = false;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, lb2, fb0, fb1, lb2);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
          fb0 = ao2.m2();
}
        fb1 = lb2 && fb0;
if(ao3 != null){
          fb1 = ao3.m2(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
        double ld3 = 650.5627463839774;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    double ld0 = 299.01481255407447;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[2][7] -= fd0;
    boolean lb1 = false;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
    double ld2 = 299.5687631515556;
    ld2 = fd0 + fd1;
        Output.points[2][8] += ld0;
    ld2 = fd0 + fd1;

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
    Thought lo0 = Thought149.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    ab1 = ab2 || ab3;
    boolean lb1 = true;
    fd0 = fd1 - ad1;
    Thought lo2 = Thought254.getInstance();
    double ld3 = 447.00991843256907;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ld3 = ad1 + ad2;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb1);
}
    boolean lb4 = true;
if(fo1 != null){
      lb4 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld3 = ad1 + ad2;
    if (fb0) {
        fb1 = ad3 < ad4;
        boolean lb5 = false;
        lb5 = !lb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld3, ad1, lb4, ab1, ab2, ab3);
}
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb5);
}
        double ld6 = 356.5228750816974;
        ad2 = ad3 - ad4;
        fd0 *= -1;
        Thought lo7 = Thought107.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
          ao4 = fo0.m4(fd1, ld6, ld3, ad1);
}
        Output.points[3][0] -= ad2;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
}
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
    Thought lo0 = Thought261.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = !fb1;
        lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    double ld2 = 722.0405043022133;
if(fo0 != null){
      fo0.m2(ld2, fd0, fd1, ld2, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    Output.points[3][1] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1);
}
    fb0 = !fb1;

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
        fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought172.getInstance();
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought48.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    Thought lo3 = Thought321.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;

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
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    Thought lo0 = Thought67.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought272.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
}
