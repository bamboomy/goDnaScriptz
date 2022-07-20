package genetic;
import java.util.ArrayList;
class Thought185 extends Thought{
private static ArrayList<Thought185> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 200.66070702905685;
private double fd1 = 826.692824042237;
private Thought fo0 = null;
private Thought fo1 = null;
Thought185 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought185 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought185 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought185 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought185 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought185 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought185 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought185 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought185 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought185 instance = new Thought185 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought185 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought185 instance = new Thought185 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought185 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought185 instance = new Thought185 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought185 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought185 instance = new Thought185 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought185 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought185 instance = new Thought185 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought185 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought185 instance = new Thought185 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought185 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought185 instance = new Thought185 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought185 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought185 instance = new Thought185 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
        boolean lb1 = false;
        Thought lo2 = Thought156.getInstance(lb1, lb0, fb0, fb1);
        fd1 = fd0 - fd1;
        boolean lb3 = true;
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
    double ld0 = 255.37682103189292;
    ab1 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ld0;
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought30.getInstance(ld0, fd0, fd1, ld0);
    Thought lo2 = Thought182.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    boolean lb3 = true;
    ab2 = !ab3;
if(fo1 != null){
      fd1 = fo1.m3();
}
    ab4 = ld0 < fd0;

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
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
    double ld0 = 68.11768930941528;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ld0 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
        double ld1 = 608.3163528572263;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
if(fo1 != null){
      ad4 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    ab1 = fd1 < ad1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3();
}
    boolean lb0 = true;
    boolean lb1 = false;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;

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
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    Thought lo1 = Thought93.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && lb0;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Output.points[3][2] -= fd1;
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    boolean lb3 = true;
    lb2 = lb3 || fb0;
    double ld4 = 349.40035995884904;
    fb1 = ld4 < fd0;
    fd1 = ld4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld4, fd0, fd1);
}
    double ld5 = 155.2947147322944;
    lb0 = ld4 < ld5;
    lb2 = fd0 < fd1;
if(ao1 != null){
      lb3 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb2);
}
    lb3 = !fb0;
    boolean lb6 = true;

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
    boolean lb0 = true;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
    double ld2 = 523.3089242527358;
    fb1 = ad3 > ad4;
    boolean lb3 = false;
    Output.points[3][3] += fd0;
    boolean lb4 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    lb0 = fd1 < ld2;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ld2 + ad1;
    ad2 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 *= -1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ab4 = ao4.m2(fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    Output.points[3][4] -= fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ad1 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 || fb0;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb1 = ab1 && ab2;
    fd1 *= -1;
    ab3 = ad1 > ad2;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2();
}
    ad3 *= -1;
    ab3 = ab4 && fb0;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m1(fb0, fb1, lb0, lb1);
}
    double ld2 = 150.0013894245106;
    double ld3 = 365.2555047412694;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld2, ld3, ad1, fb0, fb1, lb0, lb1);
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
    Thought lo0 = Thought27.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
        fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Output.points[3][5] += fd1;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought382.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
    Thought lo2 = Thought45.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought91.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb1 = fb0 || fb1;
    boolean lb4 = false;
        fd1 = fd0 - fd1;
    Thought lo5 = Thought71.getInstance();
    lb4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb4, fb0);
}
    Output.points[3][6] -= fd0;
    Thought lo6 = Thought100.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb4, fb0, fb1);
    lb4 = fd1 < fd0;
    boolean lb7 = true;
    Thought lo8 = Thought155.getInstance(fd1, fd0, fd1, fd0, lb7, fb0, fb1, lb4);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb7, fb0, fb1, lb4);
}
    fd0 = fd1 + fd0;

Thought.STACK_COUNTER++;
return lb7;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[3][7] += fd1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld0 = 259.7785206882315;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = fd0 > fd1;
    ab1 = ld0 > fd0;
    ab2 = fd1 < ld0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    Output.points[3][8] -= ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    double ld1 = 622.3330431819186;
    Thought lo2 = Thought250.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
    fb1 = !lb0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
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
    double ld0 = 843.7917134996729;
    ld0 *= -1;
    Output.points[4][0] -= ad1;
        ab1 = !ab2;
    ab3 = ab4 || fb0;
    Output.points[4][1] += ad2;
    ad3 = ad4 + fd0;
    fd1 = ld0 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ad3 = ad4 - fd0;
    boolean lb1 = false;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab2 = ab3 && ab4;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[4][2] -= fd0;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    Output.points[4][3] += fd0;
    Thought lo1 = Thought108.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;

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
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        Output.points[4][4] -= ad1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad2 = ad3 + ad4;
        Thought lo1 = Thought24.getInstance(fd0, fd1, ad1, ad2);
        Output.points[4][5] += ad3;
        fb0 = !fb1;
        lb0 = fb0 && fb1;
        ad4 = fd0 + fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought262.getInstance(fb1, ab1, ab2, ab3);
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld1 = 800.3215005471507;
    fb1 = ld1 < fd0;

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
    ab2 = ad1 < ad2;
    Thought lo0 = Thought321.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao2.m2();
}
    ad2 *= -1;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    double ld1 = 898.5669516562383;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld1, ad1);
}
    boolean lb2 = false;
    boolean lb3 = false;
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, ad1, ad2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
        boolean lb0 = false;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    boolean lb2 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m3(lb3, lb4, lb5, fb0);
}
    double ld6 = 176.2125507606564;

Thought.STACK_COUNTER++;
return ld6;
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
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 || ab1;
    ab2 = ab3 || ab4;
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        ab1 = !ab2;
        fd1 = fd0 - fd1;
        Output.points[4][6] -= fd0;
        Output.points[4][7] += fd1;
        ab3 = !ab4;
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
    Output.points[4][8] += ad2;
    Thought lo0 = Thought61.getInstance();
        ad3 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = fd1 > ad1;
    Output.points[5][0] += ad2;
    fb1 = ad3 > ad4;
    lb1 = !fb0;
    fb1 = !lb1;
    fb0 = fb1 || lb1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought307.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb1);
        ad3 = ad4 - fd0;
        lb2 = fd1 < ad1;
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb2);
}
        }
    fb0 = fb1 && lb1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;
    lb4 = ad4 < fd0;

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
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        fb0 = ad4 > fd0;
if(fo0 != null){
          fb1 = fo0.m2();
}
if(fo1 != null){
          fo1.m2(ab1, ab2, ab3, ab4);
}
        boolean lb0 = true;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
        }
    ab2 = ad4 > fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      ab3 = fo1.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought19.getInstance(fo1, fo0, fo1, fo0);
    Output.points[5][1] += ad1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought101.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    fb0 = !fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought159.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    double ld1 = 24.15012368197598;
    fd0 *= -1;
        fd1 = ld1 + fd0;
if(fo1 != null){
      fo1.m3();
}
    fb1 = !fb0;
    Thought lo2 = Thought176.getInstance(fb1, fb0, fb1, fb0);
    double ld3 = 839.8561532839669;

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
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = ad4 < fd0;
    lb0 = fd1 > ad1;
    fb0 = ad2 > ad3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 - fd1;
    if (fb1) {
        lb0 = ad1 < ad2;
if(fo1 != null){
          fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
        if (fb1) {
            Thought lo1 = Thought200.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
            Output.points[5][2] += fd0;
if(fo0 != null){
              fo0.m1();
}
            Thought lo2 = Thought364.getInstance(lb0, fb0, fb1, lb0);
            fd1 = ad1 - ad2;
            fb0 = !fb1;
            lb0 = ad3 > ad4;
            fd0 = fd1 + ad1;
            fb0 = !fb1;
}}
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
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ab1 = ab2 && ab3;
    Output.points[5][3] -= fd0;
    ab4 = fb0 || fb1;
    if (ab1) {
        ab2 = fd1 > fd0;
        if (ab3) {
            double ld0 = 445.2958711207543;
            ab4 = fd0 > fd1;
            fb0 = ld0 < fd0;
            Output.points[5][4] += fd1;
}}
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
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    fd1 *= -1;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    ab1 = ab2 || ab3;
    Thought lo2 = Thought364.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    Output.points[5][5] += ad1;
    double ld3 = 38.009468723783684;
    Thought lo4 = Thought15.getInstance();
    ab4 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Output.points[5][6] += fd0;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
        boolean lb1 = false;
        fd0 = fd1 + fd0;
        lb0 = fd1 < fd0;
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
    Thought lo0 = Thought285.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = fd0 > fd1;
    double ld1 = 41.496297960841574;
    Output.points[5][7] -= ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    fd0 *= -1;
    fd1 = ld1 + fd0;
    boolean lb3 = false;
    fd1 *= -1;
    boolean lb4 = false;
    boolean lb5 = true;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, fd0);
}
    boolean lb6 = false;
    boolean lb7 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
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
    if (fb0) {
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m3();
}
        ad1 = ad2 - ad3;
        Output.points[5][8] += ad4;
        Thought lo0 = Thought366.getInstance(fb0, fb1, fb0, fb1);
        Output.points[6][0] += fd0;
        fb0 = fd1 > ad1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
        } else if (fb1) {
        fd0 = fd1 + ad1;
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
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought227.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab4 = fo1.m2(ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought289.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        Thought lo3 = Thought349.getInstance();
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb0, ab1, ab2);
}
        Thought lo4 = Thought119.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
        lb0 = !ab1;
        boolean lb5 = false;
        boolean lb6 = true;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, lb5, lb6, lb0, ab1);
}
        ad2 = ad3 - ad4;
        ab2 = ab3 || ab4;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        ad1 = ad2 + ad3;
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
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = lb0 || fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = fd1 > ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
if(ao1 != null){
      ao1.m1(lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    Output.points[6][1] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought40.getInstance(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);

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
    fd0 = fd1 + fd0;
        boolean lb0 = false;
    Thought lo1 = Thought335.getInstance(ao1, ao2, ao3, ao4);
    double ld2 = 85.1184722772984;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    fd1 = ld2 - fd0;
    Thought lo4 = Thought7.getInstance(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1);
    lb3 = !ab1;
    boolean lb5 = false;
    ld2 = fd0 - fd1;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ld2 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ld2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, lb0, lb3, lb5, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
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
    ad1 *= -1;
    Output.points[6][2] -= ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought51.getInstance(ao1, ao2, ao3, ao4);
    ad4 = fd0 - fd1;
    fb0 = ad1 > ad2;
    Thought lo1 = Thought48.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2();
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
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
        double ld2 = 887.0962406306564;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
    Output.points[6][3] += fd1;
    ld2 = fd0 - fd1;
    lb0 = ld2 < fd0;
    fd1 = ld2 - fd0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought381.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    Thought lo2 = Thought1.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
    fd0 *= -1;
    boolean lb3 = true;
    double ld4 = 42.70231579933431;
    boolean lb5 = true;
    lb5 = !fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, lb3, lb5, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo6 = Thought67.getInstance(fd0, fd1, ld4, fd0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1);
}
    ld4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb3);
}
    lb5 = lb7 && fb0;
    fb1 = lb1 || lb3;

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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
    double ld1 = 381.75759703851344;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought267.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
            fd0 *= -1;
    Output.points[6][4] += fd1;
    double ld3 = 326.1006755584139;
    Output.points[6][5] += ld1;

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
