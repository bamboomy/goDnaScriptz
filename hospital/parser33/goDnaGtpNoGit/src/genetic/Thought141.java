package genetic;
import java.util.ArrayList;
class Thought141 extends Thought{
private static ArrayList<Thought141> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 257.8712306904265;
private double fd1 = 85.99236113427983;
private Thought fo0 = null;
private Thought fo1 = null;
Thought141 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought141 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought141 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought141 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought141 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought141 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought141 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought141 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought141 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought141 instance = new Thought141 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought141 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought141 instance = new Thought141 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought141 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought141 instance = new Thought141 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought141 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought141 instance = new Thought141 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought141 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought141 instance = new Thought141 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought141 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought141 instance = new Thought141 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought141 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought141 instance = new Thought141 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought141 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought141 instance = new Thought141 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
    Output.points[6][4] -= fd1;
    Thought lo0 = Thought151.getInstance();
    if (fb1) {
        Thought lo1 = Thought339.getInstance(fb0, fb1, fb0, fb1);
        fb0 = !fb1;
        boolean lb2 = true;
        fd0 = fd1 + fd0;
        lb2 = fd1 > fd0;
        double ld3 = 584.7207088661193;
        fb0 = !fb1;
        fd0 = fd1 + ld3;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
          fo1.m2(fd1, ld3, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
        lb2 = ld3 > fd0;
        boolean lb4 = true;
        boolean lb5 = false;
        boolean lb6 = false;
        boolean lb7 = true;
        fd1 = ld3 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld8 = 896.0335374731635;
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 113.66373562586593;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    Thought lo1 = Thought34.getInstance();
    double ld2 = 719.483423332623;
    ld2 = fd0 - fd1;
    ld0 = ld2 - fd0;
    ab2 = fd1 < ld0;
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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    double ld2 = 479.24877363394216;
    boolean lb3 = true;
        lb0 = lb1 && lb3;
    fb0 = ad1 < ad2;
    boolean lb4 = true;
    fb0 = !fb1;
    lb0 = ad3 > ad4;
    if (lb1) {
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
    Thought lo0 = Thought239.getInstance(ad2, ad3, ad4, fd0);
    boolean lb1 = false;
    Thought lo2 = Thought155.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
if(fo0 != null){
      lb1 = fo0.m2();
}
    boolean lb3 = true;
    lb3 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    lb1 = ad1 < ad2;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        double ld4 = 949.2269734829758;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb1;
        Thought lo5 = Thought352.getInstance(fo1, fo0, fo1, fo0);
        lb3 = ab1 || ab2;
        Thought lo6 = Thought346.getInstance(fd1, ld4, ad1, ad2);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        Thought lo7 = Thought231.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
        Thought lo8 = Thought56.getInstance(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3, lb1, lb3, ab1, ab2);
if(fo1 != null){
          fo1.m3(ad4, fd0, fd1, ld4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
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
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao3 != null){
      fd1 = ao3.m3();
}
    fd0 = fd1 + fd0;
    lb0 = fb0 || fb1;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);
}
        boolean lb4 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb4, lb0);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
          ao1.m3();
}
        double ld5 = 903.8668261484478;
if(ao2 != null){
          fd0 = ao2.m3(lb1, lb2, lb3, fb0);
}
        fb1 = lb4 && lb0;
        lb1 = fd1 > ld5;
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
    fb1 = ad2 > ad3;
    Output.points[6][5] += ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    lb0 = ad3 < ad4;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought366.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
            lb0 = fd0 < fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
    double ld2 = 454.59576637222756;
    lb0 = ld2 > ad1;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
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
    ab2 = ab3 || ab4;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
        double ld1 = 147.0834658590405;
        ld1 *= -1;
        fd0 *= -1;
        double ld2 = 759.8526465374864;
        double ld3 = 833.2567217888978;
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
    ab2 = ad1 < ad2;
    ab3 = ad3 < ad4;
    ab4 = fb0 || fb1;
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought150.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Output.points[6][6] -= fd1;
    fd0 *= -1;
    Output.points[6][7] += fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 < fd1;
    Output.points[6][8] -= fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
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
    ab1 = ab2 && ab3;
    Output.points[7][0] += fd0;
    Thought lo0 = Thought317.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    boolean lb1 = true;
    Thought lo2 = Thought46.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Thought lo3 = Thought122.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb4 = false;
    Output.points[7][1] += fd1;
    fd0 = fd1 - fd0;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb4, ab1, ab2, ab3);
}
    Output.points[7][2] += fd0;
    ab4 = fd1 < fd0;
    Output.points[7][3] -= fd1;
    if (fb0) {
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, fb1, lb1, lb4, ab1);
}
        boolean lb5 = false;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - fd0;
        boolean lb6 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought396.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = false;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    double ld2 = 467.86536293543486;
    Output.points[7][4] += ld2;
    lb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
        ld2 = ad1 - ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2, fb0, fb1, lb1, fb0);
}
        fb1 = lb1 || fb0;
        Thought lo3 = Thought235.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
        if (lb1) {
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
            ld2 *= -1;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
            fd1 = ld2 + ad1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
              fo1 = fo0.m4();
}
            Output.points[7][5] += fd1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad1 = fo1.m3(ab4, fb0, fb1, ab1);
}
    Output.points[7][6] += ad2;
    Output.points[7][7] -= ad3;
    ab2 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ad2 = ad3 - ad4;
        ab3 = !ab4;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        double ld0 = 387.0600216466921;
        fb0 = fb1 || ab1;
if(fo0 != null){
          fo0.m1(fd0, fd1, ld0, ad1);
}
        ab2 = ab3 && ab4;
        boolean lb1 = true;
        ab4 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
        Thought lo2 = Thought197.getInstance();
        Thought lo3 = Thought353.getInstance(fb0, fb1, lb1, ab1);
        ab2 = ad1 > ad2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought312.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    Thought lo1 = Thought364.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        lb2 = fb0 && fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m3();
}
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought201.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb1);
}
    lb2 = ad3 > ad4;
    double ld3 = 582.7686897073099;
    ad4 = fd0 - fd1;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb4, fb0, fb1, lb1);
}
    ld3 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
        boolean lb5 = false;
        for(int i1=0; i1<10; i1++){
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[7][8] -= fd0;
    ab1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Output.points[8][0] -= fd1;

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    ab1 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    Output.points[8][1] -= ad3;
    Thought lo1 = Thought263.getInstance(ab2, ab3, ab4, fb0);
    double ld2 = 798.6491901343736;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ld2;
    lb0 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought248.getInstance(fd0, fd1, ld2, ad1, fb1, lb0, ab1, ab2);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    Thought lo4 = Thought146.getInstance(fo1, ao1, ao2, ao3);
        boolean lb5 = false;
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
    boolean lb6 = true;
    Thought lo7 = Thought47.getInstance(fo0, fo1, ao1, ao2, ld2, ad1, ad2, ad3);
    ab1 = !ab2;
    ad4 = fd0 + fd1;

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
    fb0 = !fb1;
    double ld0 = 301.9201550444671;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ld0 > fd0;
    fb1 = fd1 < ld0;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fd1 *= -1;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    Output.points[8][2] += ld0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = fd0 < fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought113.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    Thought lo1 = Thought325.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought355.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    double ld3 = 820.1941019304156;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld3, fd0);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
    fb1 = !ab1;
if(fo1 != null){
      fo1.m2();
}
    Output.points[8][3] += ld3;
    ab2 = ab3 && ab4;
    Output.points[8][4] += fd0;
    fd1 *= -1;
    ld3 *= -1;

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
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 953.7431984096343;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
    double ld2 = 894.5381399743262;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb3 = false;
    fd1 *= -1;
    fb0 = ld0 < ld2;
    fb1 = lb1 && lb3;
    fb0 = ad1 > ad2;
    boolean lb4 = false;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb3);
}
    lb4 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, lb3, lb4, fb0);
}
    fb1 = lb1 || lb3;
    lb4 = ld0 < ld2;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
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
    ab2 = ab3 || ab4;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    ad2 *= -1;
    double ld1 = 311.4224607436098;
if(fo1 != null){
          fo1.m1();
}
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    ad2 *= -1;
    Output.points[8][5] -= ad3;
    double ld2 = 124.17691329251849;
    ab2 = ab3 && ab4;
    ad3 *= -1;
    Thought lo3 = Thought17.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
    ld2 = ad1 - ad2;
    Thought lo4 = Thought184.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    boolean lb5 = false;
    ld1 *= -1;
    boolean lb6 = false;
    Thought lo7 = Thought26.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    double ld1 = 874.5696895306598;
    double ld2 = 657.1151125142958;
    lb0 = ld1 < ld2;
    Thought lo3 = Thought107.getInstance(fd0, fd1, ld1, ld2);
    fb0 = !fb1;
    boolean lb4 = false;
    lb0 = lb4 && fb0;
    fd0 = fd1 - ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld1);
}
    fb1 = ld2 > fd0;
    lb0 = !lb4;
    Output.points[8][6] += fd1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = !lb0;
    double ld5 = 404.7251389218586;
if(ao3 != null){
      ao3.m1(lb4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld2, ld5, fd0, lb4, fb0, fb1, lb0);
}
    boolean lb6 = false;
    if (lb4) {
        lb6 = fb0 && fb1;
        boolean lb7 = false;
        } else {
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(ld1, ld2, ld5, fd0, lb0, lb4, lb6, fb0);
}
        double ld8 = 845.3394500627227;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb0, lb4, lb6);
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
    ad2 *= -1;
    fb1 = fb0 || fb1;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    Output.points[8][7] -= ad3;
    fb0 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought370.getInstance(fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m3();
}
    ad2 *= -1;

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
    fd1 *= -1;
        ab1 = ab2 && ab3;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 && ab2;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Thought lo0 = Thought211.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
        fd0 = fd1 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Thought lo1 = Thought330.getInstance(fd1, fd0, fd1, fd0);
        boolean lb2 = true;
        ab4 = fd1 < fd0;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb1 = fd1 > fd0;
if(ao2 != null){
          ao1 = ao2.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    Output.points[8][8] += ad3;
    double ld0 = 518.7702604020147;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m1(ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = ad4 > fd0;
    fd1 = ld0 - ad1;
    Output.points[0][0] -= ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
        ad4 = fd0 - fd1;
    boolean lb1 = true;
    ld0 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab3 = ad3 < ad4;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ad1, ad2);
}
    Output.points[0][1] += ad3;
    boolean lb2 = false;
    Output.points[0][2] -= ad4;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
    Thought lo1 = Thought398.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 = fd1 + fd0;
    boolean lb2 = true;
    fb0 = fb1 && lb0;
    Output.points[0][3] += fd1;
    boolean lb3 = true;
    fd0 = fd1 - fd0;
    lb2 = lb3 || fb0;
    fd1 = fd0 - fd1;
    fb1 = lb0 || lb2;
    Thought lo4 = Thought225.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
    boolean lb5 = true;
    boolean lb6 = true;
    boolean lb7 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    fd0 = fd1 - fd0;
    ab2 = !ab3;
        ab4 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
    boolean lb0 = true;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld1 = 660.3328694302737;
    double ld2 = 726.6479232383005;
    fb0 = ld2 < fd0;
    fb1 = fd1 < ld1;
    lb0 = ab1 || ab2;
    ab3 = ld2 < fd0;
    fd1 = ld1 + ld2;
    fd0 = fd1 - ld1;
    ab4 = !fb0;
    ld2 = fd0 - fd1;
    fb1 = !lb0;
    ab1 = ld1 > ld2;

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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    double ld1 = 799.8973400394865;
    ad4 = fd0 - fd1;
    fb1 = ld1 < ad1;
    lb0 = !fb0;
    fb1 = !lb0;
    Output.points[0][4] -= ad2;
    Thought lo2 = Thought167.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        double ld3 = 451.30517834566;
        ld3 *= -1;
        fb0 = fb1 || lb0;
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought268.getInstance(ad3, ad4, fd0, fd1);
    ab2 = ad1 > ad2;
    ab3 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      ad3 = fo1.m3();
}
    lb0 = !lb1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
    Thought lo3 = Thought190.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
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
    Output.points[0][5] -= fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
        boolean lb0 = false;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fd1 > fd0;
if(ao1 != null){
      fb1 = ao1.m2(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought278.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 = fd0 + fd1;
    fb1 = !lb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    double ld2 = 576.4900736060335;
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld2, fd0);
}
    lb0 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1);
}
    Thought lo3 = Thought26.getInstance();
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fb1 && lb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
    fb1 = ad2 > ad3;
    boolean lb0 = false;
    lb0 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    lb0 = fd1 < ad1;
if(ao2 != null){
      ao2.m3();
}
    Output.points[0][6] += ad2;
    ad3 = ad4 + fd0;
    lb1 = fd1 < ad1;
    if (lb2) {
        fb0 = ad2 > ad3;
        double ld3 = 882.3163995544999;
        for(int i0=0; i0<10; i0++){
            Output.points[0][7] -= ad3;
if(ao4 != null){
              ao3 = ao4.m4(fb1, lb0, lb1, lb2);
}
            fb0 = ad4 > fd0;
            }
        fd1 = ld3 + ad1;
        Output.points[0][8] -= ad2;
        ad3 = ad4 - fd0;
        boolean lb4 = true;
        boolean lb5 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld3, ad1, ad2, lb2, fb0, fb1, lb4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
    Thought lo0 = Thought175.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    boolean lb1 = false;
    lb1 = ab1 && ab2;
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        lb1 = !ab1;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        double ld2 = 967.7835149272444;
        boolean lb3 = false;
        if (ab1) {
            Thought lo4 = Thought46.getInstance();
            if (ab2) {
                Output.points[1][0] -= ld2;
if(ao1 != null){
                  fd0 = ao1.m3(ab3, ab4, fb0, fb1);
}
                fd1 = ld2 + fd0;
                lb3 = lb1 || ab1;
                ab2 = ab3 || ab4;
                boolean lb5 = true;
                ab4 = !fb0;
                Thought lo6 = Thought223.getInstance(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1, fb1, lb5, lb3, lb1);
if(ao1 != null){
                  fo1 = ao1.m4(ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
}}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 > ad3;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    if (ab1) {
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
        ad2 = ad3 - ad4;
        ab2 = !ab3;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        boolean lb0 = false;
        ad1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        ab3 = ad2 < ad3;
        ad4 = fd0 + fd1;
        ab4 = !fb0;
if(ao4 != null){
          ao3 = ao4.m4(fb1, lb0, ab1, ab2);
}
        ab3 = ad1 < ad2;
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
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought289.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought211.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    fd1 *= -1;
    boolean lb3 = true;
    Thought lo4 = Thought4.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[1][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb2);
}
    lb3 = fb0 && fb1;
    fd0 = fd1 - fd0;
    lb2 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb2);
}
    lb3 = fd1 > fd0;

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
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought101.getInstance(fd0, fd1, fd0, fd1);
    Thought lo2 = Thought271.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb3 = true;
    lb0 = !lb3;
    double ld4 = 985.4389634010865;
    double ld5 = 637.8667138174619;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, lb3);
}
    ld4 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld4, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld4, fb0, fb1, lb0, lb3);
}
if(fo0 != null){
      ld5 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb3);
}
    double ld6 = 110.19334117571508;

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
