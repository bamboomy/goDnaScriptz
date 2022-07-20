package genetic;
import java.util.ArrayList;
class Thought266 extends Thought{
private static ArrayList<Thought266> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 575.4117892883193;
private double fd1 = 794.7503325214365;
private Thought fo0 = null;
private Thought fo1 = null;
Thought266 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought266 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought266 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought266 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought266 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought266 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought266 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought266 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought266 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought266 instance = new Thought266 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought266 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought266 instance = new Thought266 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought266 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought266 instance = new Thought266 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought266 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought266 instance = new Thought266 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought266 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought266 instance = new Thought266 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought266 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought266 instance = new Thought266 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought266 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought266 instance = new Thought266 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought266 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought266 instance = new Thought266 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought113.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought370.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
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
    fd1 = fd0 - fd1;
    Output.points[6][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    double ld0 = 691.9789833112485;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 372.6841300718634;
    boolean lb2 = false;
if(fo1 != null){
          ld1 = fo1.m3(fd0, fd1, ld0, ld1);
}
    boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    fd0 = fd1 - ld0;
    lb3 = ld1 < fd0;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld0;
    lb2 = ld1 < fd0;
    lb3 = ab1 || ab2;
    Thought lo4 = Thought77.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0, ab3, ab4, fb0, fb1);
    double ld5 = 203.47932039835203;

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
    Thought lo0 = Thought276.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Output.points[6][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    lb1 = !fb0;
    boolean lb2 = false;
    double ld3 = 649.7073843949403;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
}
    fb0 = !fb1;
    lb1 = lb2 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld3, ad1, ad2, ad3, fb1, lb1, lb2, fb0);
}
    fb1 = ad4 > fd0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    if (fb0) {
        boolean lb0 = true;
        boolean lb1 = true;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          ad3 = fo1.m3();
}
        ab4 = fb0 || fb1;
        boolean lb2 = false;
        lb0 = lb1 || lb2;
        ab1 = !ab2;
        boolean lb3 = true;
        ad4 = fd0 - fd1;
        ab2 = ad1 < ad2;
if(fo0 != null){
          fo0.m1(ab3, ab4, fb0, fb1);
}
        ad3 *= -1;
        boolean lb4 = true;
        ad4 *= -1;
        lb0 = lb1 && lb2;
        boolean lb5 = true;
        Thought lo6 = Thought110.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb3, lb4, lb5, ab1);
        boolean lb7 = false;
        boolean lb8 = false;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb8, ab1, ab2, ab3);
}
        ad1 = ad2 + ad3;
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
    Thought lo0 = Thought355.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought398.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    Output.points[6][5] += fd1;
    fb1 = !fb0;

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
    Thought lo0 = Thought95.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;
    Thought lo1 = Thought154.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    ad3 = ad4 - fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    double ld2 = 277.39066384069304;

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
    fd1 = fd0 - fd1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
        fd0 *= -1;
    Output.points[6][6] -= fd1;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
    Output.points[6][7] += fd0;
    boolean lb0 = false;
    Thought lo1 = Thought124.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);

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
      ao2.m1();
}
    ad2 = ad3 + ad4;
    double ld0 = 543.4497356582323;
    boolean lb1 = false;
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    ld0 = ad1 - ad2;
    Output.points[6][8] -= ad3;
        boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
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
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought15.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fb0 && fb1;
    Output.points[7][0] -= fd0;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    Output.points[7][1] -= fd1;
        Thought lo1 = Thought22.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb2 = true;
    Thought lo3 = Thought98.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb4);
}
    fb0 = !fb1;
    lb2 = fd0 < fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    Output.points[7][2] += fd0;
    fd1 = fd0 - fd1;
    Output.points[7][3] += fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab3 = !ab4;
    double ld1 = 890.8801070960826;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought167.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
        fd0 = fd1 + ld1;
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
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought176.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    Thought lo1 = Thought358.getInstance(fd1, ad1, ad2, ad3);
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        boolean lb2 = false;
        lb2 = ad2 < ad3;
        Output.points[7][4] += ad4;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[7][5] += fd0;
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
}
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
    ab2 = ad2 > ad3;
if(fo1 != null){
      ab3 = fo1.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ab2 = ad2 > ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
        ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 > fd1;
        ad1 = ad2 - ad3;
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
if(ao1 != null){
      ao1.m2();
}
    boolean lb0 = false;
    double ld1 = 954.7028379015674;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(ao2 != null){
      ld1 = ao2.m3(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb0);
}
    boolean lb3 = false;
    Output.points[7][6] -= fd1;
    Output.points[7][7] -= ld1;
    lb2 = !lb3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb3 = fb0 && fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
    double ld0 = 257.5977484129799;
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
    boolean lb1 = true;
    double ld2 = 957.7470190397377;
    for(int i0=0; i0<10; i0++){
        fb0 = ad1 < ad2;
        ad3 *= -1;
        ad4 = fd0 + fd1;
        ld0 = ld2 + ad1;
        fb1 = lb1 || fb0;
        fb1 = !lb1;
        fb0 = fb1 || lb1;
        Output.points[7][8] += ad2;
        boolean lb3 = false;
if(ao3 != null){
          ad3 = ao3.m3();
}
        }
    fb0 = ad4 < fd0;
    fb1 = fd1 < ld0;
    lb1 = ld2 < ad1;
    ad2 = ad3 + ad4;
    boolean lb4 = false;
    fd0 = fd1 + ld0;
if(fo0 != null){
      ao4 = fo0.m4(lb4, fb0, fb1, lb1);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 2.157249521687956;
    fd0 *= -1;
    Thought lo1 = Thought23.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = ld0 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    Thought lo2 = Thought29.getInstance(ao2, ao3, ao4, fo0);
    double ld3 = 481.7507655683476;
    ld0 = ld3 - fd0;
    ab1 = fd1 < ld0;
    Thought lo4 = Thought48.getInstance(ld3, fd0, fd1, ld0);
    boolean lb5 = false;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m1();
}
    Thought lo6 = Thought177.getInstance(ab1, ab2, ab3, ab4);
    ld3 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld3, fd0, fd1, fb0, fb1, lb5, ab1);
}
    ab2 = ab3 && ab4;
    Output.points[8][0] += ld0;
    Thought lo7 = Thought304.getInstance(ld3, fd0, fd1, ld0, fb0, fb1, lb5, ab1);
    ab2 = !ab3;
    boolean lb8 = true;
    Thought lo9 = Thought60.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
    boolean lb10 = true;

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
    boolean lb0 = false;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    Thought lo1 = Thought202.getInstance(fd0, fd1, ad1, ad2);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
        lb0 = ab1 || ab2;
if(ao3 != null){
      ad1 = ao3.m3(ab3, ab4, fb0, fb1);
}
    lb0 = ad2 < ad3;
    boolean lb2 = false;
    Output.points[8][1] -= ad4;
    double ld3 = 596.2423947229297;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld3, lb2, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + ld3;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[8][2] += fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 893.5674607980222;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    Output.points[8][3] += fd0;
    fb1 = !fb0;
    boolean lb1 = false;
    Output.points[8][4] -= fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    if (fb0) {
        fb1 = !lb1;
        Thought lo2 = Thought213.getInstance();
        fb0 = fb1 || lb1;
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
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    double ld0 = 361.5694263461241;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ld0 + fd0;
    ab4 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    if (ab1) {
        fd1 = ld0 + fd0;
        ab2 = fd1 < ld0;
        fd0 = fd1 + ld0;
        Thought lo1 = Thought240.getInstance(fd0, fd1, ld0, fd0);
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        ab4 = ld0 > fd0;
        fd1 = ld0 + fd0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = !fb1;
        ab1 = ld0 > fd0;
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
        double ld2 = 851.2739473551258;
        fd0 *= -1;
        Output.points[8][5] -= fd1;
        ab1 = ab2 && ab3;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = ad2 > ad3;
    Thought lo0 = Thought215.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
        boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
    double ld2 = 331.02447609814607;
    ad2 *= -1;
    fb0 = ad3 > ad4;
    double ld3 = 854.6956631417374;
    fb1 = lb1 || fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    if (lb1) {
        boolean lb4 = true;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd0 *= -1;
        double ld5 = 895.8355762880922;
        boolean lb6 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld5, ld2);
}
        lb6 = lb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3);
}
        Thought lo7 = Thought181.getInstance();
        fb1 = !lb4;
        boolean lb8 = false;
        double ld9 = 264.8973557840095;
        double ld10 = 671.0793829314123;
if(fo0 != null){
          fo1 = fo0.m4(lb6, lb8, lb1, fb0);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      ab2 = fo0.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    if (ab1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
        double ld0 = 490.1200371423127;
        boolean lb1 = false;
        Thought lo2 = Thought254.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
        ld0 *= -1;
if(fo1 != null){
          fo1.m1();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, ab1);
}
        ad1 *= -1;
        ab2 = ab3 && ab4;
        fb0 = ad2 > ad3;
        ad4 = fd0 + fd1;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        boolean lb0 = false;
        fb0 = fd1 > fd0;
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 + fd0;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
        boolean lb1 = true;
        fd1 *= -1;
        Thought lo2 = Thought132.getInstance(fd0, fd1, fd0, fd1);
        fd0 *= -1;
        double ld3 = 838.836102222883;
        boolean lb4 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        lb1 = fd1 > ld3;
if(ao2 != null){
          fd0 = ao2.m3(lb4, fb0, fb1, lb0);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, ld3, fd0, fd1, lb1, lb4, fb0, fb1);
}
        Output.points[8][6] += ld3;
        double ld5 = 854.8758407601745;
if(ao2 != null){
          lb0 = ao2.m2(ld5, fd0, fd1, ld3, lb1, lb4, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && fb0;
    Output.points[8][7] -= ad3;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    if (fb0) {
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
    fd0 *= -1;
    ab2 = ab3 || ab4;
    double ld0 = 148.55530047577201;
    fb0 = fd0 > fd1;
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    ld0 = fd0 + fd1;
if(ao2 != null){
      ld0 = ao2.m3(fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought369.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
    double ld2 = 167.39761091569898;
    ab2 = fd0 < fd1;
    ld0 = ld2 - fd0;
if(ao1 != null){
      ao1.m1(fd1, ld0, ld2, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[8][8] += fd1;
    boolean lb3 = true;
    ab4 = !fb0;
if(ao1 != null){
      ao1.m3(ld0, ld2, fd0, fd1);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, ld2, fd0, fd1);
}
    lb3 = ld0 > ld2;
    double ld4 = 529.0574201061385;

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
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[0][0] += ad2;
if(ao3 != null){
      ad3 = ao3.m3(fb0, fb1, ab1, ab2);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    double ld0 = 409.15139667862104;
        ad4 = fd0 + fd1;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(ld0, ad1, ad2, ad3, lb1, lb2, ab1, ab2);
}
    boolean lb3 = true;
    ad4 *= -1;
    ab2 = fd0 < fd1;
    ab3 = ld0 < ad1;
    boolean lb4 = false;
    ab3 = ad2 > ad3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb2);
}
    lb3 = !lb4;
    ab1 = !ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(ad4, fd0, fd1, ld0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    fd0 *= -1;
    double ld0 = 201.47117368288258;
    Thought lo1 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    Thought lo2 = Thought160.getInstance();
    Output.points[0][1] -= fd1;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    double ld3 = 478.4323821410105;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 = ld3 + fd0;
    Thought lo4 = Thought212.getInstance(fd1, ld0, ld3, fd0, fb1, fb0, fb1, fb0);
    fd1 = ld0 + ld3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    ld0 = ld3 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 + ld3;

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
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    lb0 = ab1 && ab2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought164.getInstance(ab3, ab4, fb0, fb1);
    double ld2 = 561.5348063471735;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb0, ab1, ab2, ab3);
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
    ad2 = ad3 - ad4;
    double ld0 = 847.9178921528762;
    fb0 = ad4 < fd0;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    fb0 = fd1 < ld0;
    fb1 = lb1 && fb0;
    fb1 = lb1 || fb0;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fb1 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    fd1 = ld0 + ad1;
    fb0 = fb1 || lb1;
    fb0 = !fb1;
    lb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
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
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    ad2 = ad3 - ad4;
    Output.points[0][2] -= fd0;
    ab3 = ab4 && fb0;
    Output.points[0][3] += fd1;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    ad4 = fd0 + fd1;
    ab2 = ad1 < ad2;
    ab3 = !ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        boolean lb1 = true;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb0);
}
        fd0 = fd1 + fd0;
        double ld2 = 525.9628635837215;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
        fb0 = ld2 > fd0;
        Output.points[0][4] += fd1;
        fb1 = ld2 < fd0;
        fd1 *= -1;
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
    Thought lo0 = Thought25.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    Output.points[0][5] += fd0;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought111.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    ad2 = ad3 + ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld2 = 580.9281566204828;
    fb1 = ad2 < ad3;

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
    ab1 = fd0 < fd1;
    fd0 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    ab2 = !ab3;
    ab4 = fd1 < fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 483.49222562822473;
    fd0 = fd1 + ld1;
if(ao1 != null){
      ao1.m3();
}
    fb1 = !lb0;
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought221.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, ab1);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
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
    double ld0 = 146.83668778916862;
    ld0 *= -1;
    Output.points[0][6] -= ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought13.getInstance(ao1, ao2, ao3, ao4);
    fb0 = fb1 && ab1;
    Thought lo2 = Thought89.getInstance(ad3, ad4, fd0, fd1);
    Thought lo3 = Thought273.getInstance(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
if(ao3 != null){
          ao3.m3();
}
if(ao4 != null){
      ao4.m2(ab2, ab3, ab4, fb0);
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
        fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    lb0 = !fb0;
    Thought lo1 = Thought89.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);

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
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 < fd1;
    Thought lo0 = Thought254.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Output.points[0][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    lb1 = lb2 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = lb0 && lb1;
    double ld3 = 645.8604395721264;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
    lb1 = lb2 && fb0;
    boolean lb4 = true;
    fb0 = !fb1;
    ld3 = fd0 + fd1;
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb0, lb1, lb2, lb4);
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
