package genetic;
import java.util.ArrayList;
class Thought62 extends Thought{
private static ArrayList<Thought62> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 940.7418992594984;
private double fd1 = 478.5586987842125;
private Thought fo0 = null;
private Thought fo1 = null;
Thought62 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought62 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought62 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought62 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought62 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    boolean lb3 = true;
    lb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
    fd1 = fd0 - fd1;
    boolean lb4 = true;
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, lb4, fb0);
}
    Output.points[2][2] -= fd0;
    boolean lb5 = true;
        fd1 *= -1;
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        Output.points[2][3] -= fd1;
        boolean lb0 = true;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
        Output.points[2][4] -= fd1;
        ab2 = ab3 || ab4;
        Thought lo1 = Thought373.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        fb0 = fb1 || lb0;
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
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought323.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    double ld2 = 801.7276834808467;
    Thought lo3 = Thought221.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 || lb0;

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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    Output.points[2][5] -= fd0;
    fd1 = ad1 + ad2;
    double ld0 = 990.0420673279708;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    double ld1 = 198.73014333402145;
        boolean lb2 = false;
    Thought lo3 = Thought72.getInstance(fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
    ad1 *= -1;
    boolean lb4 = true;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb2, lb4, ab1, ab2);
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
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        lb0 = !fb0;
        fb1 = fd0 > fd1;
        lb0 = fd0 < fd1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
        for(int i1=0; i1<10; i1++){
            fb0 = !fb1;
            }
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          fd1 = ao2.m3();
}
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        }
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    Output.points[2][6] -= fd1;
    lb1 = fd0 < fd1;
    boolean lb2 = true;
    double ld3 = 862.2970169304759;
    lb2 = !fb0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
    double ld0 = 720.9501913797845;
    Thought lo1 = Thought45.getInstance(ad4, fd0, fd1, ld0);
    ad1 *= -1;
    Thought lo2 = Thought121.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought241.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld4 = 438.1857536633147;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld4, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld4);
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
      fd0 = ao2.m3();
}
    Thought lo0 = Thought30.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought161.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought191.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ab2 = fo0.m2(ad1, ad2, ad3, ad4);
}
    Output.points[2][7] += fd0;
    ab3 = fd1 > ad1;
    boolean lb1 = true;
    ad2 = ad3 - ad4;
    ab3 = fd0 < fd1;
    Output.points[2][8] += ad1;

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
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Output.points[3][0] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[3][1] -= fd0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
        fb1 = lb0 || fb0;
    Thought lo1 = Thought111.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    Output.points[3][2] -= fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    boolean lb3 = true;
    lb3 = fb0 || fb1;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb5 = true;
    double ld6 = 571.4022207862649;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    Thought lo0 = Thought247.getInstance(fd1, fd0, fd1, fd0);
    double ld1 = 481.42723027332346;
    fd0 = fd1 + ld1;
    double ld2 = 0.17395673155542224;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1);
}
    Thought lo3 = Thought152.getInstance();
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = ld2 < fd0;
    ab4 = fd1 < ld1;
    double ld4 = 772.155101236507;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ld1 > ld2;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb5 = false;
    ab2 = ab3 || ab4;
    ld4 = fd0 + fd1;
    Thought lo6 = Thought347.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ld1 = fo0.m3(ld2, ld4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, ld2, ld4, fd0);
}
    Thought lo7 = Thought138.getInstance();
    Thought lo8 = Thought188.getInstance(fb0, fb1, lb5, ab1);
    Thought lo9 = Thought117.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ld4, ab2, ab3, ab4, fb0);

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Output.points[3][3] += fd0;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought149.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
            ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3();
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    double ld2 = 352.62189907376325;
    fd0 = fd1 - ld2;
    fb1 = lb1 || fb0;

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
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    Output.points[3][4] -= ad2;
    ad3 = ad4 - fd0;
    Output.points[3][5] += fd1;
    fb0 = !fb1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;

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
if(ao2 != null){
          fb1 = ao2.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[3][6] += fd1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought142.getInstance();
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;

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
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought323.getInstance(ao3, ao4, fo0, fo1);
    Thought lo1 = Thought122.getInstance(ad2, ad3, ad4, fd0);
    fb1 = fd1 < ad1;
    fb0 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    double ld2 = 754.4250940020454;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 = ad3 - ad4;
    fb1 = !fb0;
if(ao3 != null){
      ao3.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, ad1, fb1, fb0, fb1, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought213.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    double ld1 = 309.8788071907606;
    boolean lb2 = false;
    Thought lo3 = Thought333.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb2);
    ab1 = ab2 && ab3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb4 = true;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought194.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    Thought lo1 = Thought136.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
    double ld3 = 687.5676120142823;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo4 = Thought79.getInstance(ld3, ad1, ad2, ad3);
    ab2 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld3, ad1, ad2);
}
    boolean lb5 = false;
if(ao1 != null){
      ad3 = ao1.m3();
}
    Output.points[3][7] -= ad4;
    ab2 = fd0 > fd1;
    boolean lb6 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld3, ad1, ad2, ad3, fb1, lb2, lb5, lb6);
}
    boolean lb7 = true;
    double ld8 = 481.3699172626351;
    double ld9 = 557.4204222745363;
    lb7 = ad2 < ad3;

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
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 141.10606001813906;
    Thought lo1 = Thought271.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    double ld3 = 813.7107253384922;
    lb2 = ld3 < fd0;
    fb0 = fd1 > ld0;
    fb1 = ld3 > fd0;
    lb2 = fd1 > ld0;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0);
}

Thought.STACK_COUNTER++;
return ld3;
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
    Thought lo0 = Thought263.getInstance();
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought103.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb4 = false;
        double ld5 = 826.9443791251215;
        fb0 = !fb1;
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
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Output.points[3][8] -= ad2;
        double ld0 = 231.24736320577628;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        boolean lb1 = false;
        lb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
        ad3 *= -1;
        ad4 *= -1;
if(fo0 != null){
          lb1 = fo0.m2();
}
        Output.points[4][0] -= fd0;
        fb0 = fd1 > ld0;
        fb1 = ad1 < ad2;
if(fo1 != null){
          fo1.m2(lb1, fb0, fb1, lb1);
}
        fb0 = ad3 > ad4;
        fb1 = fd0 < fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld0, ad1, fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought7.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
        fb0 = fb1 && lb1;
        Output.points[4][1] += ad2;
        fb0 = fb1 && lb1;
        fb0 = fb1 && lb1;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought357.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    Output.points[4][2] += fd0;
    double ld1 = 645.7182395440868;
    boolean lb2 = true;
    Output.points[4][3] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb3, ab1, ab2, ab3);
}
    ld1 = ad1 - ad2;
    double ld4 = 881.9041325657497;

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
    fd0 *= -1;
    double ld0 = 296.4154003212779;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought390.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
        fb1 = fb0 && fb1;
        fd0 = fd1 - ld0;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
        fd1 = ld0 - fd0;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
        boolean lb2 = true;
        fb0 = fd0 < fd1;
        double ld3 = 781.1187276976501;
        boolean lb4 = false;
        double ld5 = 703.4406157604005;
if(fo1 != null){
          ld3 = fo1.m3(ao1, ao2, ao3, ao4, ld5, ld0, fd0, fd1);
}
        boolean lb6 = true;
        Output.points[4][4] -= ld3;
        lb6 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ld5 *= -1;
        boolean lb7 = false;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb2, lb4);
}
        lb6 = lb7 && fb0;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld3, lb2, lb4, lb6, lb7);
}
if(ao3 != null){
          ao2 = ao3.m4(ld5, ld0, fd0, fd1, fb0, fb1, lb2, lb4);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, lb6, lb7, fb0, fb1);
}
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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3();
}
    Thought lo0 = Thought26.getInstance(fb1, fb0, fb1, fb0);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[4][5] -= fd0;
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought88.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = ad3 > ad4;
    double ld2 = 931.2451442092223;
    fb1 = fb0 || fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought136.getInstance();
    fd0 = fd1 - fd0;
    ab3 = ab4 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, lb1, ab1);
}
    Thought lo3 = Thought279.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
        fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
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
if(ao2 != null){
      ad2 = ao2.m3();
}
    Thought lo0 = Thought92.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ad3 > ad4;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    double ld2 = 636.8893403188835;
    ab2 = ad1 < ad2;
    ab3 = ad3 < ad4;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
        fb0 = !fb1;
if(fo1 != null){
          fo1.m2(fb0, fb1, fb0, fb1);
}
        double ld0 = 368.5603464909348;
        ld0 = fd0 + fd1;
        Thought lo1 = Thought399.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
        boolean lb2 = true;
        double ld3 = 696.36285824595;
        boolean lb4 = true;
if(fo0 != null){
          ld3 = fo0.m3(fd0, fd1, ld0, ld3, lb2, lb4, fb0, fb1);
}
        boolean lb5 = false;
        if (lb2) {
if(fo1 != null){
              lb4 = fo1.m2(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb2);
}
            boolean lb6 = true;
            boolean lb7 = true;
            lb7 = lb2 || lb4;
            lb5 = !fb0;
            double ld8 = 768.7224614873394;
            ld3 = fd0 - fd1;
            ld8 = ld0 - ld3;
            fb1 = lb6 || lb7;
            lb2 = lb4 || lb5;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0);
}
}}
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
    ab1 = !ab2;
    Output.points[4][6] -= fd1;
    ab3 = fd0 < fd1;
    ab4 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = ab1 || ab2;
    fd0 = fd1 + fd0;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Output.points[4][7] += fd0;
    fb1 = !ab1;
    fd1 = fd0 - fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[4][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought146.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought187.getInstance(fo0, fo1, fo0, fo1);
    ad1 *= -1;
    fb1 = ad2 > ad3;
    if (fb0) {
        Thought lo2 = Thought26.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        Output.points[5][0] += ad3;
        ad4 *= -1;
        boolean lb3 = false;
        boolean lb4 = true;
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
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 348.2758923758199;
    ad1 = ad2 + ad3;
    Output.points[5][1] += ad4;
    fb1 = fd0 < fd1;
    double ld1 = 920.9302232703918;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    Thought lo2 = Thought177.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    ld0 *= -1;
    fb1 = !ab1;
    boolean lb3 = true;
    Thought lo4 = Thought145.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    for(int i0=0; i0<10; i0++){
        double ld5 = 219.50126985380516;
        Thought lo6 = Thought101.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m1(ld0, ld1, ad1, ad2);
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
    Thought lo0 = Thought99.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1();
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    double ld1 = 51.37899187086401;
    fd0 = fd1 + ld1;
    boolean lb2 = true;
    Thought lo3 = Thought168.getInstance(lb2, fb0, fb1, lb2);
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb2);
}
    fb0 = fd1 > ld1;
    fb1 = !lb2;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb2, fb0, fb1);
}
    double ld4 = 115.11673820801609;
    ld4 *= -1;
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
    double ld0 = 493.13872633969254;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
    fb1 = ad4 < fd0;
    lb1 = fd1 > ld0;
    Output.points[5][2] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    lb1 = ld0 > ad1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad4 *= -1;
if(ao3 != null){
      lb1 = ao3.m2(fb0, fb1, lb1, fb0);
}
    double ld2 = 673.4430955006851;

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
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = fd1 > fd0;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld2 = 440.2776045155305;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
    boolean lb4 = false;
    ab3 = ld2 > fd0;
    ab4 = fb0 && fb1;
    lb0 = lb1 || lb3;
    lb4 = ab1 && ab2;
    Thought lo5 = Thought34.getInstance(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1);
    if (ab3) {
        ab4 = ld2 < fd0;
        fd1 = ld2 - fd0;
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
          fo1.m3(fb0, fb1, lb0, lb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1, lb3, lb4, ab1, ab2);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab3 = ab4 || fb0;
    fd0 *= -1;
    Output.points[5][3] -= fd1;
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
if(ao4 != null){
      ab1 = ao4.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4();
}
    ab3 = !ab4;
    fd0 *= -1;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    Thought lo0 = Thought17.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
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
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought177.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
        lb0 = fd0 > fd1;

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
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Output.points[5][4] += fd1;
    Thought lo0 = Thought218.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 679.3639867215195;
    fb1 = ld1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    ld1 *= -1;
    Output.points[5][5] += fd0;
    double ld2 = 938.7113696869375;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    Output.points[5][6] -= ld1;
if(fo0 != null){
      ld2 = fo0.m3();
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    double ld3 = 233.43974907957013;
    double ld4 = 995.3714109626586;
    fb0 = ld3 > ld4;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    double ld0 = 358.9285849619397;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
    double ld2 = 825.8207307162883;
    double ld3 = 363.8869093822139;
    fb0 = fb1 && lb1;
    ld2 = ld3 + fd0;
    Output.points[5][7] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ld3, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = ld0 - ld2;
    ld3 = fd0 - fd1;
    fb1 = lb1 || fb0;
    Output.points[5][8] += ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    Output.points[6][0] -= ld2;

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
