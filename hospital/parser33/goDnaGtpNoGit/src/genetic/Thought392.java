package genetic;
import java.util.ArrayList;
class Thought392 extends Thought{
private static ArrayList<Thought392> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 644.2116316777581;
private double fd1 = 132.01343088406824;
private Thought fo0 = null;
private Thought fo1 = null;
Thought392 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought392 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought392 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought392 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought392 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought392 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought392 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought392 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought392 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought392 instance = new Thought392 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought392 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought392 instance = new Thought392 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought392 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought392 instance = new Thought392 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought392 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought392 instance = new Thought392 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought392 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought392 instance = new Thought392 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought392 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought392 instance = new Thought392 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought392 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought392 instance = new Thought392 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought392 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought392 instance = new Thought392 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo1 = Thought350.getInstance(fb0, fb1, lb0, fb0);
    double ld2 = 454.49373975735773;
    Output.points[6][6] -= fd0;
    fb1 = !lb0;
    fb0 = fb1 || lb0;
        fb0 = fb1 || lb0;
    boolean lb3 = false;
    boolean lb4 = false;
    double ld5 = 321.9538724438533;
    Output.points[6][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ld5, fd0, lb3, lb4, fb0, fb1);
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
    ab1 = !ab2;
    double ld0 = 130.85470183176736;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld0;
    ab1 = fd0 > fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ld0 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb1;
    ab1 = fd0 > fd1;
    ab2 = ld0 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3();
}
    Thought lo2 = Thought65.getInstance(ab3, ab4, fb0, fb1);
    double ld3 = 383.66889819275417;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, lb1, ab1, ab2, ab3);
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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fb0 = fd1 > ad1;
    fb1 = ad2 < ad3;
    boolean lb0 = false;
    Output.points[6][8] -= ad4;
    double ld1 = 173.02449436834587;
    lb0 = fb0 || fb1;

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
    ab1 = !ab2;
    ab3 = !ab4;
    ad1 *= -1;
    Thought lo0 = Thought388.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    Thought lo1 = Thought36.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > ad1;
    Thought lo2 = Thought126.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
        Thought lo3 = Thought205.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad1 = ad2 - ad3;
        Output.points[7][0] += ad4;
        } else if (ab3) {
        ab4 = fd0 < fd1;
if(fo1 != null){
          fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4();
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
    Output.points[7][1] += fd0;
    double ld0 = 257.605925730961;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    double ld1 = 80.54869784317482;
    fb1 = ld1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[7][2] -= fd1;
    ld0 = ld1 - fd0;
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1);
}
        if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = !lb0;
    Thought lo1 = Thought384.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    fd0 *= -1;
    ab4 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 191.41922411655193;
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb1 = false;
    Thought lo2 = Thought68.getInstance(ab4, fb0, fb1, lb1);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[7][3] += ld0;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ld0, fd0, fb1, lb1, ab1, ab2);
}
    fd1 = ld0 + fd0;
    boolean lb3 = false;

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
    ad1 *= -1;
    ab2 = ab3 && ab4;
    ad2 = ad3 - ad4;
    double ld0 = 365.473658373197;
    Output.points[7][4] -= ad4;
    fb0 = !fb1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld0;
    fb1 = ab1 && ab2;
    ad1 *= -1;
    double ld1 = 302.8657131731973;
    Output.points[7][5] += ad1;
    Output.points[7][6] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ab3 = ab4 && fb0;
    fb1 = ld0 > ld1;
    ab1 = ad1 > ad2;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[7][7] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    fd0 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fd1, fd0, fd1, fd0);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = !ab1;
    boolean lb0 = true;
    double ld1 = 23.911148054978757;
    ab1 = !ab2;
    double ld2 = 781.1409525055248;
    double ld3 = 443.4308883273421;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = ld1 > ld2;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    boolean lb4 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    boolean lb5 = true;
if(fo0 != null){
      fo0.m2(ld2, ld3, fd0, fd1, lb0, lb4, lb5, ab1);
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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    ad2 *= -1;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    double ld0 = 61.56504221785097;
    fb1 = ad2 < ad3;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 - fd0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2();
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    Thought lo0 = Thought170.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    double ld1 = 60.38428209013398;
    Output.points[7][8] -= ad4;
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 && ab2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
        double ld0 = 342.8032963758637;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao2 != null){
      fd1 = ao2.m3();
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
    double ld0 = 44.381352982552265;
if(ao1 != null){
          ld0 = ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought60.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    double ld2 = 946.8780585347876;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought143.getInstance(ao1, ao2, ao3, ao4);
    ad4 = fd0 - fd1;
    fb1 = fb0 || fb1;
    double ld4 = 413.86919809643365;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ld4, ad1);
}
    boolean lb5 = false;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    lb5 = ld0 < ld2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      fd1 = ao3.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    ab3 = fd0 < fd1;
    fd0 *= -1;
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Thought lo0 = Thought309.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd1 = ao4.m3(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && ab1;
    ab2 = fd0 > fd1;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    double ld1 = 487.3337745141659;
if(ao4 != null){
      ao4.m3();
}
    boolean lb2 = false;
    Output.points[8][0] += ld1;
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought68.getInstance(fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb2);
    ad2 = ad3 - ad4;
    if (ab1) {
        ab2 = fd0 > fd1;
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
    Thought lo0 = Thought326.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought252.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = true;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb1 = lb2 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = lb2 || fb0;
    Thought lo3 = Thought184.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb2, fb0, fb1);
}
    double ld4 = 662.4617973116635;
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    fd0 = fd1 + ld4;
    fb0 = fb1 || lb2;
    fd0 = fd1 + ld4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld4, fd0, fb0, fb1, lb2, fb0);
}
    Thought lo5 = Thought288.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    if (ab1) {
        ab2 = ab3 || ab4;
        Output.points[8][1] -= fd1;
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        for(int i0=0; i0<10; i0++){
            fb0 = fd0 < fd1;
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
            }
        ab1 = ab2 && ab3;
if(fo1 != null){
          ab4 = fo1.m2();
}
        Thought lo0 = Thought232.getInstance(fb0, fb1, ab1, ab2);
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
        Thought lo2 = Thought398.getInstance(fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
        Output.points[8][2] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          lb1 = fo0.m2(fd1, fd0, fd1, fd0);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
        ad1 = ad2 + ad3;
        Output.points[8][3] += ad4;
        fb1 = fd0 < fd1;
        Output.points[8][4] -= ad1;
        ad2 = ad3 - ad4;
        Thought lo0 = Thought256.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
        double ld1 = 427.2826680746501;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        ad1 = ad2 - ad3;
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
    ad2 *= -1;
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    ab3 = ad4 > fd0;
    Output.points[8][5] -= fd1;
    ab4 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought144.getInstance(fb0, fb1, lb0, ab1);
    ab2 = ab3 && ab4;
    boolean lb2 = true;
    ab4 = fd1 > ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought69.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    Thought lo4 = Thought388.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
    Output.points[8][6] -= ad4;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld5 = 351.11179024903873;
    ab3 = ad4 > fd0;
    fd1 = ld5 - ad1;
    ad2 = ad3 + ad4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
        double ld0 = 277.657228616155;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought288.getInstance();
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought28.getInstance(fb0, fb1, fb0, fb1);

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
    ad1 *= -1;
    fb0 = ad2 < ad3;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    Output.points[8][7] += ad3;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought12.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          ad2 = fo1.m3(fb0, fb1, fb0, fb1);
}
        }
    fb0 = fb1 && fb0;
    boolean lb1 = true;
    ad3 = ad4 + fd0;
    Thought lo2 = Thought122.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
    ad4 *= -1;
    Output.points[8][8] += fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    boolean lb0 = false;
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    double ld1 = 606.7266646037835;
    ab4 = !fb0;
    fb1 = lb0 || ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab2 = fd0 > fd1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
    ab2 = fd1 < ld1;
    Output.points[0][0] += fd0;
if(ao3 != null){
          ao3.m3();
}
    boolean lb3 = false;
    if (ab2) {
        fd1 = ld1 - fd0;
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
    ab2 = ad1 < ad2;
    ad3 = ad4 - fd0;
    ab3 = fd1 > ad1;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    boolean lb0 = false;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = ad1 > ad2;
if(ao3 != null){
      ao3.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
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
    Thought lo0 = Thought27.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought85.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[0][1] -= fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld2 = 32.59278788554257;
    boolean lb3 = true;
    ld2 = fd0 + fd1;
    boolean lb4 = true;
    lb3 = ld2 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1, lb4, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb3);
}
    lb4 = !fb0;
    fb1 = lb3 && lb4;
    fb0 = ld2 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[0][2] += fd1;

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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !ab1;
    ab2 = !ab3;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = fd0 > fd1;
    double ld0 = 818.4182630951511;
    Thought lo1 = Thought216.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
    Thought lo2 = Thought43.getInstance(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
    Thought lo3 = Thought159.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fd1 = ld0 - fd0;
    fb0 = fd1 > ld0;
    fb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
    double ld4 = 695.1387419211045;
    ab4 = fb0 || fb1;
    ab1 = !ab2;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld0);
}
    ab3 = ab4 || fb0;
    boolean lb5 = true;
    fb0 = fb1 && lb5;

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
    Output.points[0][3] += ad2;
    Output.points[0][4] += ad3;
    ad4 = fd0 + fd1;
    Output.points[0][5] -= ad1;
    boolean lb0 = false;
    fb0 = !fb1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
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
    ab1 = ad2 < ad3;
    Thought lo0 = Thought312.getInstance(ad4, fd0, fd1, ad1);
    ab2 = !ab3;
    ad2 *= -1;
    ab4 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought354.getInstance(fb0, fb1, ab1, ab2);
    double ld2 = 384.1725301429645;
    boolean lb3 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld2;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
    fb1 = ld2 < ad1;
    double ld4 = 372.98927225849116;
    double ld5 = 636.9227684904516;
    ld5 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      ld4 = fo1.m3(ld5, ad1, ad2, ad3, ab4, fb0, fb1, lb3);
}
    boolean lb6 = true;
        boolean lb7 = false;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 395.51996735943527;
if(ao1 != null){
      fb1 = ao1.m2();
}
    ld0 *= -1;
        Thought lo1 = Thought196.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    lb2 = fb0 && fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
}
    if (fb0) {
        boolean lb3 = true;
        fb0 = !fb1;
        lb3 = ld0 < fd0;
        lb2 = fd1 > ld0;
        fd0 = fd1 + ld0;
        fb0 = fd0 > fd1;
        fb1 = ld0 < fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, fd0, fd1, lb3, lb2, fb0, fb1);
}
        ld0 *= -1;
        lb3 = lb2 || fb0;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb3, lb2, fb0, fb1);
}
        Thought lo4 = Thought370.getInstance(ao2, ao3, ao4, fo0);
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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    double ld0 = 994.4394066465782;
    Thought lo1 = Thought92.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        Thought lo2 = Thought215.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        ad2 = ad3 + ad4;
        fd0 = fd1 + ld0;
        for(int i1=0; i1<10; i1++){
            boolean lb3 = true;
            ad1 *= -1;
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb3, fb0);
}
if(ao2 != null){
              fd1 = ao2.m3(ld0, ad1, ad2, ad3, fb1, lb3, fb0, fb1);
}
            }
        ad4 *= -1;
        }
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb4 = true;
    lb4 = fd0 < fd1;
    if (fb0) {
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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ab2 = ao1.m2();
}
    fd1 = fd0 - fd1;
    ab3 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    double ld0 = 255.96535581670537;
    Thought lo1 = Thought153.getInstance(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    Thought lo2 = Thought350.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
    Output.points[0][6] -= fd0;
    Output.points[0][7] -= fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
        ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab4 = fb0 && fb1;
    Thought lo3 = Thought216.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 + ld0;
    Output.points[0][8] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ld0 = ao3.m3(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
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
    Output.points[1][0] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    fb1 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought140.getInstance();
    ab1 = ad1 < ad2;
    boolean lb1 = true;
    ad3 *= -1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, lb1, ab1);
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
    Output.points[1][1] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[1][2] += fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
        fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
    double ld0 = 96.46491653625337;
    fb1 = !fb0;
    ld0 = fd0 - fd1;
    fb1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && fb0;
    ld0 = fd0 + fd1;
    fb1 = !fb0;
    fb1 = ld0 < fd0;
    fd1 = ld0 + fd0;
    Thought lo1 = Thought310.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    ld0 = fd0 - fd1;
    fb0 = fb1 && fb0;
    ld0 = fd0 + fd1;
    fb1 = ld0 < fd0;
        double ld2 = 452.4194151766742;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, fb1, fb0, fb1, fb0);
}
        boolean lb3 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, ld2, fb1, lb3, fb0, fb1);
}
    fd0 = fd1 + ld0;
    lb3 = !fb0;
    Thought lo4 = Thought399.getInstance(fo1, fo0, fo1, fo0, fb1, lb3, fb0, fb1);

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
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    double ld0 = 275.395791582988;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    fb0 = ld0 < fd0;
    double ld1 = 290.0538217461262;
    boolean lb2 = true;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld0;
    fb0 = fb1 && lb2;
if(fo1 != null){
      ld1 = fo1.m3(fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought112.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, lb2, fb0, fb1);
    lb2 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld1, fd0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    fb1 = lb2 || fb0;
    ld0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
        fb1 = lb2 && fb0;

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
