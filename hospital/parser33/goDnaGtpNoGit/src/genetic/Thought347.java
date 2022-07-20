package genetic;
import java.util.ArrayList;
class Thought347 extends Thought{
private static ArrayList<Thought347> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 525.0092121440728;
private double fd1 = 61.14716076290514;
private Thought fo0 = null;
private Thought fo1 = null;
Thought347 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought347 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought347 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought347 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought347 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought347 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought347 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought347 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought347 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought347 instance = new Thought347 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought347 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought347 instance = new Thought347 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought347 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought347 instance = new Thought347 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought347 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought347 instance = new Thought347 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought347 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought347 instance = new Thought347 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought347 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought347 instance = new Thought347 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought347 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought347 instance = new Thought347 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought347 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought347 instance = new Thought347 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought292.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb1 = lb2 || fb0;
    boolean lb3 = true;
    boolean lb4 = false;
    lb4 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fb1 = !lb1;

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
      fo1 = fo0.m4();
}
    Thought lo0 = Thought325.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
    boolean lb1 = true;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    lb1 = !ab1;
    boolean lb2 = false;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    boolean lb3 = true;
    boolean lb4 = false;
    Thought lo5 = Thought120.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, lb3, lb4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld6 = 577.0839340481978;
    fd0 = fd1 - ld6;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld6, fd0);
}
    ab3 = !ab4;
    fb0 = fb1 || lb1;
    lb2 = !lb3;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ad1 > ad2;
    boolean lb0 = false;
    boolean lb1 = true;
    ad3 *= -1;
    lb1 = fb0 || fb1;
if(fo1 != null){
      ad4 = fo1.m3(lb0, lb1, fb0, fb1);
}
    lb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    Output.points[0][4] -= ad4;
    Thought lo2 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 956.7932672855644;
    ld3 *= -1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1);
}
    lb1 = ad2 > ad3;

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
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
    fb1 = ab1 || ab2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought343.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        double ld1 = 218.99250500779496;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
        Output.points[0][5] += ad1;
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
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[0][6] -= fd1;
    Thought lo0 = Thought392.getInstance(fo1, ao1, ao2, ao3);
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = true;
    lb1 = fd0 < fd1;
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    lb2 = !lb3;
    fb0 = fd1 < fd0;
    Output.points[0][7] += fd1;
    Thought lo4 = Thought396.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);

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
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m1();
}
    boolean lb0 = false;
    ad4 = fd0 + fd1;
    boolean lb1 = true;
    Output.points[0][8] -= ad1;
if(ao2 != null){
      lb0 = ao2.m2(lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, lb0, lb1, lb2, fb0);
}
        double ld3 = 495.85633809872905;
        ad3 = ad4 - fd0;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld3, ad1, ad2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        boolean lb4 = true;
        fb0 = !fb1;
        double ld5 = 614.4862797756969;
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
    ab1 = fd0 < fd1;
    Output.points[1][0] += fd0;
    for(int i0=0; i0<10; i0++){
        ab2 = fd1 < fd0;
        fd1 *= -1;
        ab3 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        }
    fb1 = fd0 < fd1;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab1 = ao4.m2(fd0, fd1, fd0, fd1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad2 = ao3.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld2 = 174.4604996864031;
    boolean lb3 = true;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
          ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
        }
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld2 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb3, fb0);
}
    fb1 = !lb0;
    Output.points[1][1] += fd1;
    double ld4 = 807.2119875514544;
    lb1 = lb3 && fb0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    Output.points[1][2] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Output.points[1][3] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(lb2, ab1, ab2, ab3);
}
    double ld3 = 56.79488231824726;
    ab4 = fb0 || fb1;
    lb0 = lb1 || lb2;
    Thought lo4 = Thought139.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
    Output.points[1][4] += fd0;
    Output.points[1][5] -= fd1;
    ld3 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb1);
}
    lb2 = ab1 && ab2;
    fd0 = fd1 - ld3;

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
    Thought lo0 = Thought259.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
    lb1 = lb2 && fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb1 = lb2 || fb0;
    Thought lo3 = Thought240.getInstance(fb1, lb1, lb2, fb0);
    boolean lb4 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      lb4 = fo0.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb1, lb2);
}
    lb4 = fb0 && fb1;
    Thought lo5 = Thought164.getInstance(fo1, fo0, fo1, fo0, lb1, lb2, lb4, fb0);
    fb1 = !lb1;
    Thought lo6 = Thought243.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    lb2 = !lb4;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 380.39897768131266;
    ab1 = ab2 || ab3;
    ad1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > ld0;
    boolean lb1 = true;
    ab3 = !ab4;
    ad1 = ad2 + ad3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    if (fb1) {
        boolean lb0 = true;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        if (fb0) {
            double ld1 = 522.2471596478548;
if(ao2 != null){
              fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
            fb0 = fd0 > fd1;
if(ao1 != null){
              ld1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
              fb1 = fo1.m2(fd0, fd1, ld1, fd0);
}
            fd1 *= -1;
if(ao1 != null){
              ao1.m1(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
            if (lb0) {
                fb0 = fb1 && lb0;
                fd0 = fd1 + ld1;
if(fo1 != null){
                  fb0 = fo1.m2();
}
                Output.points[1][6] -= fd0;
if(ao1 != null){
                  fb1 = ao1.m2(lb0, fb0, fb1, lb0);
}
                double ld2 = 178.05988472264096;
if(ao2 != null){
                  fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ld1, fb1, lb0, fb0, fb1);
}
}}}
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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    double ld0 = 483.90710527089067;
    fb0 = fb1 && fb0;
    double ld1 = 90.5261739944852;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
        Thought lo3 = Thought398.getInstance(ao4, fo0, fo1, ao1, ld0, ld1, ad1, ad2);
        fb0 = fb1 || lb2;
if(ao3 != null){
          ao2 = ao3.m4();
}
        }
        ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb2, fb0);
}
    Thought lo4 = Thought219.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ad1, fb1, lb2, fb0, fb1);
    Output.points[1][7] -= ad2;
    lb2 = ad3 > ad4;
    if (fb0) {
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 926.1236078435543;
    fb0 = ld0 < fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    ld0 = fd0 - fd1;
    ab4 = fb0 && fb1;
        ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ld0 = fd0 - fd1;
if(ao3 != null){
      ab4 = ao3.m2(ld0, fd0, fd1, ld0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
    Output.points[1][8] += fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb1);
}
    double ld2 = 613.1262401310568;
    double ld3 = 164.20777326076194;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld2, ld3, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, ld2, ld3, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = fd0 < fd1;
    Thought lo4 = Thought137.getInstance(ao1, ao2, ao3, ao4, lb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo1 = Thought397.getInstance();
    if (ab1) {
        ab2 = ab3 || ab4;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
        boolean lb2 = false;
        ad4 *= -1;
        fd0 = fd1 - ad1;
        ab1 = ad2 < ad3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    lb0 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 || fb1;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        lb0 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought106.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    Thought lo1 = Thought358.getInstance(fd0, fd1, fd0, fd1);
    ab1 = !ab2;
    boolean lb2 = true;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[2][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    ab3 = !ab4;

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
    Thought lo0 = Thought202.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought84.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
        fb1 = ad4 > fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        fd1 *= -1;
        boolean lb2 = true;
        fb0 = ad1 > ad2;
        fb1 = lb2 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        double ld3 = 824.9400711373012;
        ad2 *= -1;
        ad3 = ad4 + fd0;
        Thought lo4 = Thought145.getInstance(fd1, ld3, ad1, ad2);
        ad3 *= -1;
        Output.points[2][1] += ad4;
        fd0 *= -1;
        double ld5 = 835.7945154316059;
        fb1 = fd0 < fd1;
        ld3 = ld5 + ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        lb2 = fd1 < ld3;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought163.getInstance();
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
        ab2 = ab3 && ab4;
        boolean lb1 = true;
        ab4 = fb0 && fb1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
        ad2 *= -1;
        boolean lb2 = false;
if(fo0 != null){
          ad3 = fo0.m3(lb1, lb2, ab1, ab2);
}
        ad4 *= -1;
        fd0 = fd1 - ad1;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
          fo0.m2(fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
        double ld3 = 369.15534055051637;
        ad3 = ad4 - fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    Thought lo0 = Thought191.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought302.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        lb2 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao1 != null){
          fb1 = ao1.m2(lb2, fb0, fb1, lb2);
}
        fd1 *= -1;
        Thought lo3 = Thought126.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
        fd0 *= -1;
        Output.points[2][2] -= fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
}
        fb1 = !lb2;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        fb0 = fd1 < fd0;
        double ld4 = 62.34639167100282;
        fd0 *= -1;
        fb1 = lb2 && fb0;
if(fo1 != null){
          fd1 = fo1.m3(ld4, fd0, fd1, ld4);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld4, fd0);
}
        }
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fd0 > fd1;

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
    Thought lo0 = Thought85.getInstance();
    Thought lo1 = Thought227.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    double ld2 = 285.75395403310813;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld2, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    Output.points[2][3] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo0 != null){
      fo0.m1(lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
    boolean lb2 = false;
    lb1 = fd0 < fd1;
    lb2 = fd0 > fd1;
    Output.points[2][4] += fd0;

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
    ab2 = ab3 && ab4;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    double ld0 = 85.27754069656642;
    Thought lo1 = Thought384.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
if(ao2 != null){
      ao2.m3();
}
    Thought lo2 = Thought361.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 + ld0;
    fb0 = fb1 || ab1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Output.points[2][5] += ad2;
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    Output.points[2][6] += fd1;
    boolean lb1 = false;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
    lb1 = !fb0;

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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
        double ld1 = 388.5874537953105;
    Output.points[2][7] -= ld1;
    fd0 *= -1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    double ld2 = 378.38673610067156;
    ld1 = ld2 + fd0;
    fd1 = ld1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld2 = fd0 + fd1;
    ab1 = ab2 || ab3;

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
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 143.70436016621525;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ad1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[2][8] -= fd1;
    double ld0 = 977.4969815422744;
if(fo1 != null){
      ld0 = fo1.m3();
}
    double ld1 = 567.1023680144995;
    Thought lo2 = Thought41.getInstance(ab1, ab2, ab3, ab4);
    double ld3 = 617.6956572372737;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ld3, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ad3 = ad4 + fd0;
    boolean lb4 = true;
    ab3 = fd1 < ld0;
    Thought lo5 = Thought150.getInstance(ld1, ld3, ad1, ad2, ab4, fb0, fb1, lb4);
    ad3 = ad4 - fd0;
    Thought lo6 = Thought61.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    fd1 = ld0 + ld1;
if(fo0 != null){
      ld3 = fo0.m3(ad1, ad2, ad3, ad4);
}
    lb4 = ab1 && ab2;
    fd0 *= -1;

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
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = !fb0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb0 = true;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought247.getInstance(fb1, lb0, fb0, fb1);
    double ld2 = 394.20528645741206;
    fd0 *= -1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, ld2, fd0, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld2, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2();
}
    double ld1 = 391.98082072487495;
    lb0 = fb0 || fb1;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought274.getInstance(lb0, fb0, fb1, lb0);
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, ad1, fb1, lb0, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld1;

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
    ab1 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        boolean lb0 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Output.points[3][0] -= fd1;
        Thought lo1 = Thought243.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        Thought lo2 = Thought119.getInstance();
        fd1 = fd0 + fd1;
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, lb0, ab1);
}
        ab2 = !ab3;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        boolean lb3 = true;
        lb3 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        boolean lb4 = false;
        fd1 *= -1;
        double ld5 = 285.3954838509455;
        ld5 = fd0 - fd1;
        double ld6 = 704.3781487147621;
        ab4 = ld5 > ld6;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ab3 = fd0 > fd1;
    ad1 = ad2 - ad3;
    Thought lo0 = Thought191.getInstance(ad4, fd0, fd1, ad1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo1 = Thought33.getInstance();
    double ld2 = 749.0542003145282;
    ld2 = ad1 - ad2;
    ab4 = !fb0;
    fb1 = !ab1;
    ad3 *= -1;

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
        fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    double ld1 = 780.320022370666;
    lb0 = fb0 && fb1;

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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1();
}
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    double ld0 = 62.06393065726358;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
            fb1 = ld0 < fd0;
    Output.points[3][1] += fd1;

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
if(fo0 != null){
      fo0.m3();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    Thought lo1 = Thought227.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
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
