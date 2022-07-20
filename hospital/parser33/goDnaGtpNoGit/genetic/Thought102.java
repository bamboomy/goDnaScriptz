package genetic;
import java.util.ArrayList;
class Thought102 extends Thought{
private static ArrayList<Thought102> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 486.3183202667209;
private double fd1 = 470.2067095932306;
private Thought fo0 = null;
private Thought fo1 = null;
Thought102 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought102 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought102 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought102 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought102 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought102 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought102 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought102 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought102 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought102 instance = new Thought102 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought102 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought102 instance = new Thought102 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought102 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought102 instance = new Thought102 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought102 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought102 instance = new Thought102 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought102 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought102 instance = new Thought102 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought102 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought102 instance = new Thought102 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought102 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought102 instance = new Thought102 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought102 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought102 instance = new Thought102 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    double ld4 = 274.16564781001796;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, lb0, lb1, lb2, lb3);
}
    fb0 = fb1 && lb0;
    boolean lb5 = true;
    lb1 = lb2 || lb3;
    lb5 = fb0 && fb1;
    lb0 = !lb1;
    fd1 = ld4 + fd0;
    double ld6 = 580.8677252584692;

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
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    Output.points[7][4] += fd1;
    ab4 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    lb0 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    boolean lb1 = false;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ad1 < ad2;
    double ld0 = 36.69321028048767;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    double ld1 = 290.63846874116916;
    fd0 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1);
}
    ad2 = ad3 - ad4;
    double ld3 = 148.51219044243842;
    double ld4 = 408.18124965775223;
    fb0 = ad3 > ad4;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld5 = 126.85990420030711;
    lb2 = fb0 || fb1;
    ld0 = ld1 + ld3;
    ld4 = ld5 - ad1;
    boolean lb6 = false;
        ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb6, fb0, fb1);
}
    ad3 = ad4 - fd0;
    boolean lb7 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ld3, lb2, lb6, lb7, fb0);
}
    ld4 = ld5 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, lb2, lb6, lb7);
}
    ld0 = ld1 - ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb6);
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
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ab1 = ad2 < ad3;
    ab2 = ad4 > fd0;
    ab3 = fd1 > ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    if (ab2) {
        Thought lo3 = Thought387.getInstance();
        ab3 = ab4 || fb0;
        ad1 = ad2 + ad3;
        boolean lb4 = true;
if(fo0 != null){
          fo0.m3(fb0, fb1, lb4, lb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    double ld0 = 426.9417138092831;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Output.points[7][5] -= fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought12.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);

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
      ao2.m3();
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    double ld0 = 198.62379919994214;
    fb0 = fb1 && fb0;
    ad2 = ad3 - ad4;
    double ld1 = 599.5249610048879;
if(ao4 != null){
      ao4.m3(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
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
    boolean lb0 = true;
    ab1 = !ab2;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    Output.points[7][6] += fd1;
    Output.points[7][7] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        ab1 = fd0 < fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          fd0 = ao1.m3();
}
if(ao2 != null){
          ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
        lb0 = lb1 && ab1;
        Thought lo2 = Thought189.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1);
}
    ab1 = ad2 > ad3;
    double ld0 = 355.1768364746949;
    ab2 = ad3 < ad4;
        fd0 = fd1 - ld0;
    Output.points[7][8] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    ld0 *= -1;
if(ao3 != null){
      ao3.m3(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought247.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = !fb1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    Output.points[8][0] -= ad3;
    ab2 = !ab3;
    ad4 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab4 = fd1 < ld0;
    fb0 = ad1 > ad2;
    boolean lb2 = false;
if(ao1 != null){
      fb0 = ao1.m2(ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought28.getInstance(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);

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
    Output.points[8][1] += fd0;
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb0 = true;
    Thought lo1 = Thought70.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    Thought lo2 = Thought85.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 982.487928807794;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    ab2 = ab3 || ab4;
    Output.points[8][2] -= ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    Output.points[8][3] -= fd0;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    for(int i0=0; i0<10; i0++){
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
    Thought lo0 = Thought293.getInstance();
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
    lb1 = ad2 > ad3;
    lb2 = ad4 < fd0;
    boolean lb3 = false;
if(fo1 != null){
      lb3 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb1, lb2);
}
    ad4 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb1);
}
    Thought lo4 = Thought158.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    lb2 = lb3 && fb0;
    Output.points[8][4] += ad4;
        fd0 *= -1;
    double ld5 = 112.83265355706834;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld5, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld5;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, lb3, lb6);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad1 = fo0.m3(ab1, ab2, ab3, ab4);
}
        ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ad1 > ad2;
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    ab4 = fb0 && fb1;
    lb0 = !ab1;
    ab2 = !ab3;
    ad1 = ad2 - ad3;
    ab4 = fb0 && fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 376.24250790310174;
    fb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    fb0 = fd0 < fd1;
    ld0 = fd0 + fd1;
    fb1 = fb0 || fb1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = ld0 > fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;

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
    double ld0 = 64.18458056908663;
    boolean lb1 = false;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        lb1 = fb0 || fb1;
    lb1 = ad1 > ad2;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    lb1 = !lb2;
    fb0 = fb1 && lb1;
    double ld3 = 263.0343522806538;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    lb2 = fb0 || fb1;
    lb1 = lb2 || fb0;

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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
        boolean lb0 = true;
        Output.points[8][5] += fd0;
        fd1 = fd0 + fd1;
        lb0 = !ab1;
        ab2 = !ab3;
        double ld1 = 851.0462864427246;
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
    ab2 = ab3 && ab4;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    boolean lb0 = false;
    double ld1 = 589.7162096197014;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
    double ld2 = 988.06002095677;
if(ao3 != null){
      ao3.m1(ld1, ld2, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ld1 + ld2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      fd0 = ao4.m3();
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = fd1 < fd0;
    double ld1 = 435.38503567746454;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = ld1 - fd0;
    fb1 = !lb0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m1(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    double ld2 = 583.3228687114793;
    Output.points[8][6] -= ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld1, ld2);
}
    lb0 = fd0 < fd1;
    Thought lo3 = Thought356.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || lb0;
    double ld4 = 671.386427127651;
if(fo1 != null){
      ld1 = fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld4, fd0, fd1, fb1, lb0, fb0, fb1);
}

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
        double ld0 = 710.5416982789204;
    fd0 *= -1;
    Output.points[8][7] += fd1;
    ab4 = ld0 > fd0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    fb1 = ld0 < fd0;
    boolean lb2 = true;
    lb1 = fd1 > ld0;
    double ld3 = 884.0103663558372;
    ld3 = fd0 + fd1;
    lb2 = ld0 < ld3;
    double ld4 = 602.69430731717;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
    Thought lo0 = Thought147.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = !fb1;
        fd1 = ad1 - ad2;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab1 = ab2 || ab3;
    ab4 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    Output.points[8][8] += fd0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    boolean lb1 = false;
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, lb0, lb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ab4 = ad4 > fd0;
    Thought lo3 = Thought367.getInstance();
    boolean lb4 = true;
    ab4 = fb0 && fb1;
    fd1 *= -1;
    lb0 = !lb1;
    lb2 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(lb4, ab1, ab2, ab3);
}
    Thought lo5 = Thought261.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
    boolean lb6 = true;

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
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb0 = false;
    double ld1 = 507.87751937008494;
    Output.points[0][0] -= ld1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    fb1 = fd0 < fd1;
    ld1 *= -1;
    boolean lb2 = true;
    boolean lb3 = true;
    double ld4 = 837.0970035831683;
    Thought lo5 = Thought108.getInstance(ld4, fd0, fd1, ld1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld4, fd0, fd1, ld1);
}
    lb0 = !lb2;
    double ld6 = 595.1481223659912;
    for(int i0=0; i0<10; i0++){
        lb3 = !fb0;
        ld4 = ld6 - fd0;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          fd1 = ao2.m3(fb1, lb0, lb2, lb3);
}
        ld1 *= -1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ld4, ld6, fd0, fd1, fb0, fb1, lb0, lb2);
}
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
        ad1 *= -1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        fb1 = fb0 && fb1;
        ad2 = ad3 + ad4;
if(ao2 != null){
          ao2.m3(fd0, fd1, ad1, ad2);
}
        Output.points[0][1] -= ad3;
        fb0 = ad4 > fd0;
        fd1 = ad1 + ad2;
        ad3 = ad4 + fd0;
        fb1 = fb0 && fb1;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        fb0 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb1 = fb0 && fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    boolean lb0 = true;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(ao2 != null){
      lb2 = ao2.m2(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought243.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
    fd0 = fd1 + fd0;
    boolean lb4 = false;
    lb2 = !lb4;
    fd1 *= -1;
    boolean lb5 = false;
    Thought lo6 = Thought172.getInstance(fd0, fd1, fd0, fd1, lb5, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
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
    if (ab2) {
        Output.points[0][2] += ad2;
        Output.points[0][3] -= ad3;
        Thought lo0 = Thought118.getInstance(ao1, ao2, ao3, ao4);
        ab3 = ab4 || fb0;
        double ld1 = 319.6818555653654;
if(fo0 != null){
          fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
        ab1 = ld1 > ad1;
        Thought lo2 = Thought231.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
if(fo0 != null){
          ao4 = fo0.m4();
}
        ab2 = fd1 > ld1;
        ab3 = ad1 < ad2;
        ab4 = ad3 > ad4;
        fb0 = fb1 && ab1;
        ab2 = fd0 > fd1;
        Output.points[0][4] += ld1;
        ab3 = ab4 && fb0;
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
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    lb0 = lb1 && fb0;
    Thought lo2 = Thought286.getInstance();
    Output.points[0][5] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb1, fb0);
}
    Thought lo3 = Thought230.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    fb1 = fd1 < fd0;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[0][6] += fd0;
    double ld0 = 623.4187568653481;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought90.getInstance();
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought36.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
    fb0 = fd1 > ld0;

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
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    double ld2 = 68.08682335620276;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo3 = Thought232.getInstance(lb0, lb1, fb0, fb1);
    lb0 = lb1 && fb0;
    boolean lb4 = true;
    fb0 = fd0 > fd1;
    if (fb1) {
        ld2 = ad1 + ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, lb0, lb1, lb4, fb0);
}
        ad1 *= -1;
        boolean lb5 = true;
        Output.points[0][7] += ad2;
        fb0 = !fb1;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(ld2, ad1, ad2, ad3, lb5, lb0, lb1, lb4);
}
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb5, lb0);
}
        Thought lo6 = Thought395.getInstance(fo0, fo1, fo0, fo1);
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
    Thought lo0 = Thought260.getInstance(ad2, ad3, ad4, fd0);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    boolean lb2 = true;
    lb1 = !lb2;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        fd0 = fd1 + ad1;
        Output.points[0][8] += ad2;
        ad3 = ad4 - fd0;
        fd1 = ad1 - ad2;
        double ld3 = 192.27722946259877;
        ab4 = !fb0;
        ad2 *= -1;
        Output.points[1][0] += ad3;
        fb1 = ad4 > fd0;
        Thought lo4 = Thought377.getInstance(lb1, lb2, ab1, ab2);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld3, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1, lb1, lb2, ab1, ab2);
}
        ab3 = ab4 || fb0;
        fb1 = ld3 < ad1;
        lb1 = lb2 && ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        ad2 = ad3 - ad4;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        lb1 = fd0 > fd1;
        ld3 = ad1 + ad2;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
        boolean lb0 = false;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    Thought lo1 = Thought274.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
    Thought lo2 = Thought139.getInstance();
    lb0 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
        fb0 = fd1 > fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 || fb1;
        lb0 = !fb0;
        fb1 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          fd1 = ao4.m3();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 767.078044813925;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ld0 = ad1 - ad2;
    Thought lo1 = Thought367.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought60.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    Output.points[1][1] += ad4;
    fd0 *= -1;
    fb0 = fd1 < ld0;
    fb1 = !fb0;
    if (fb1) {
        boolean lb3 = false;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[1][2] -= fd1;
    lb0 = fd0 < fd1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    Output.points[1][3] -= fd0;
    fb1 = lb0 && ab1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought114.getInstance();
    Output.points[1][4] -= fd1;
    double ld2 = 474.7650673050376;
    ld2 *= -1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    double ld3 = 96.63790433989143;
    ld3 *= -1;
    fd0 = fd1 + ld2;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m1(lb0, lb4, ab1, ab2);
}
    ld3 = fd0 - fd1;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
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
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    Thought lo0 = Thought387.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
    Thought lo1 = Thought203.getInstance(ao2, ao3, ao4, fo0);
        ab3 = !ab4;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    boolean lb2 = false;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    ab4 = fd0 < fd1;
if(fo1 != null){
          fo1.m1();
}
if(ao1 != null){
      ao1.m1(fb0, fb1, lb2, ab1);
}
    ad1 *= -1;
    ab2 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      lb2 = ao2.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb2, ab1);
}
    Output.points[1][5] -= fd1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 || fb0;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = !fb0;
    Output.points[1][6] += fd0;
    fd1 = fd0 - fd1;
    Output.points[1][7] -= fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb1 = fd1 > fd0;
if(fo0 != null){
      lb0 = fo0.m2();
}
    fb0 = !fb1;
    lb0 = fd1 > fd0;

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
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 39.95156338541062;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought142.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld2 = 992.6105090984;
    Thought lo3 = Thought377.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    fb1 = ld0 < ld2;
    Thought lo4 = Thought335.getInstance(fd0, fd1, ld0, ld2);

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
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[1][8] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought346.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 = fd0 - fd1;

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
