package genetic;
import java.util.ArrayList;
class Thought273 extends Thought{
private static ArrayList<Thought273> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 0.019560090925605178;
private double fd1 = 767.2337302893292;
private Thought fo0 = null;
private Thought fo1 = null;
Thought273 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought273 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought273 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought273 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought273 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought273 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought273 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought273 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought273 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought273 instance = new Thought273 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought273 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought273 instance = new Thought273 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought273 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought273 instance = new Thought273 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought273 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought273 instance = new Thought273 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought273 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought273 instance = new Thought273 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought273 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought273 instance = new Thought273 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought273 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought273 instance = new Thought273 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought273 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought273 instance = new Thought273 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fb1 = !fb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought93.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);

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
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought315.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    double ld1 = 206.2057346564282;
    double ld2 = 720.3854671809761;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
}
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
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
    ad2 = ad3 + ad4;
    fb0 = fb1 || fb0;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ad1;
    boolean lb0 = true;
    double ld1 = 334.15232824371697;
    boolean lb2 = false;
    lb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, lb2, fb0, fb1, lb0);
}
    Thought lo3 = Thought38.getInstance(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
    lb2 = fb0 || fb1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ad2 > ad3;
    ab3 = ad4 < fd0;
    Output.points[3][0] -= fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Output.points[3][1] -= fd1;
    ad1 = ad2 + ad3;
    Output.points[3][2] -= ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    double ld0 = 174.28821041176005;
    boolean lb1 = false;
    Output.points[3][3] += ad4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
        boolean lb0 = true;
if(ao3 != null){
      ao3.m2();
}
    Thought lo1 = Thought57.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    fb0 = fd0 < fd1;
    fb1 = lb0 || fb0;

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
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fb0 = ad1 < ad2;
    Output.points[3][4] -= ad3;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    double ld1 = 417.1435703899035;
if(ao3 != null){
      ao3.m3();
}
    fd0 *= -1;
    fb0 = fb1 || lb0;
    Thought lo2 = Thought141.getInstance(fb0, fb1, lb0, fb0);
    boolean lb3 = false;
    fb0 = fb1 || lb0;
    lb3 = !fb0;
    double ld4 = 395.6324497736131;
    fd0 = fd1 - ld1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld4, ad1, ad2, ad3, fb1, lb0, lb3, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld1, fb1, lb0, lb3, fb0);
}
    Output.points[3][5] += ld4;
    fb1 = lb0 || lb3;
    Thought lo5 = Thought104.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb3);
    double ld6 = 910.1334597761783;
    fb0 = fb1 || lb0;
    Thought lo7 = Thought212.getInstance(ao3, ao4, fo0, fo1);
    boolean lb8 = true;
    Thought lo9 = Thought178.getInstance(ld6, ad1, ad2, ad3);
    boolean lb10 = true;
    double ld11 = 787.0012181915852;
    boolean lb12 = false;

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
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    boolean lb0 = false;
    Thought lo1 = Thought31.getInstance();
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought64.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    Thought lo3 = Thought30.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    Thought lo4 = Thought53.getInstance(fo1, ao1, ao2, ao3);
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    if (lb0) {
        double ld5 = 165.09276898882302;
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
    ab2 = ad1 > ad2;
    double ld0 = 197.6646155002924;
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = ad2 < ad3;
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
    ab4 = ad4 < fd0;
    boolean lb1 = false;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fd1, ld0, ad1, ad2, lb1, ab1, ab2, ab3);
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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        double ld0 = 85.50341076901087;
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[3][6] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    double ld0 = 288.24255280866635;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    ld0 = fd0 + fd1;
    double ld2 = 990.5739120817295;
    ld0 = ld2 - fd0;
    fd1 = ld0 + ld2;
    ab3 = !ab4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
    fd1 *= -1;
    if (ab2) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld2, fd0, fd1);
}
        ld0 *= -1;
if(fo1 != null){
          ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
        Output.points[3][7] += fd0;
        Output.points[3][8] += fd1;
        ld0 = ld2 + fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    boolean lb0 = false;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fb0 = fb1 || lb0;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
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
    boolean lb0 = true;
    Output.points[4][0] -= ad1;
    lb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    double ld1 = 534.4183331739482;
    double ld2 = 264.8624826412358;
    boolean lb3 = true;
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, ld2, ad1, ad2, fb0, fb1, lb0, lb3);
}
    boolean lb4 = false;
if(fo1 != null){
      lb4 = fo1.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld1 < ld2;
    boolean lb5 = false;
        fb0 = fb1 && lb0;
    double ld6 = 922.2630363209116;
    ld6 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb4, lb5, ab1);
}
    ab2 = ad3 > ad4;

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
    fb1 = !fb0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    double ld1 = 665.3354197654745;
    fb0 = !fb1;
    double ld2 = 568.4010964664453;
    lb0 = !fb0;
    fb1 = ld1 > ld2;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ld2);
}
    fd0 = fd1 + ld1;
    fb0 = fb1 || lb0;
    boolean lb3 = true;
    ld2 = fd0 + fd1;
    Thought lo4 = Thought35.getInstance();

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought84.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    boolean lb2 = true;
    fb0 = fb1 || lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    lb2 = ad1 < ad2;
if(ao3 != null){
      ad3 = ao3.m3();
}
if(ao4 != null){
      ad4 = ao4.m3(fb0, fb1, lb1, lb2);
}
    Output.points[4][1] -= fd0;
    Thought lo3 = Thought389.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, lb1, lb2);
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb2);
}
    fb0 = ad3 > ad4;

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
    Thought lo0 = Thought241.getInstance(ao2, ao3, ao4, fo0);
    ab1 = !ab2;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 964.3534661008343;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ld1;
    ab3 = fd0 < fd1;
    ab4 = ld1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ld1 = fd0 + fd1;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
        ld1 = fd0 + fd1;
    Thought lo2 = Thought45.getInstance(fo0, fo1, ao1, ao2);
    ld1 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    double ld0 = 541.2512935562881;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
    Output.points[4][2] += ad4;
if(ao2 != null){
      fd0 = ao2.m3();
}
    fd1 = ld0 + ad1;
    ab1 = ab2 && ab3;
    ab4 = ad2 < ad3;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    double ld1 = 657.8844338471714;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought323.getInstance(ld0, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
    ad3 *= -1;
    boolean lb3 = true;
    Thought lo4 = Thought361.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb3);
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo5 = Thought191.getInstance(ld1, ad1, ad2, ad3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ld1 = ad1 + ad2;
    ad3 *= -1;
if(ao1 != null){
      ao1.m1();
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
    double ld0 = 873.6023895737684;
    Output.points[4][3] += fd0;
    fb0 = fd1 < ld0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    boolean lb2 = false;
    double ld3 = 105.56441253443907;
    Thought lo4 = Thought167.getInstance(lb2, fb0, fb1, lb1);
    lb2 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0, fb1, lb1, lb2, fb0);
}
        fb1 = lb1 || lb2;
    fb0 = !fb1;
    boolean lb5 = true;
    lb1 = ld3 > fd0;
    fd1 = ld0 - ld3;
    lb2 = lb5 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld3, fd0, fb1, lb1, lb2, lb5);
}
    if (fb0) {
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought353.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought288.getInstance(fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    ab1 = ab2 || ab3;
    Thought lo2 = Thought140.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Thought lo3 = Thought347.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    Thought lo4 = Thought83.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    double ld5 = 258.15625165434477;
    double ld6 = 335.1947375639643;
    double ld7 = 821.815250203058;
if(fo1 != null){
      fo1.m3(ld5, ld6, ld7, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fd1 < ld5;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ab1 && ab2;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought291.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    fb0 = fb1 || fb0;
    Thought lo1 = Thought364.getInstance();
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
    Output.points[4][4] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
    lb2 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    boolean lb4 = true;

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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[4][5] -= ad1;
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    boolean lb0 = false;
    Thought lo1 = Thought297.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = !lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    fb0 = fd1 < fd0;
    if (fb1) {
        double ld2 = 592.8712889133324;
        fd0 = fd1 - ld2;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        boolean lb3 = true;
if(ao1 != null){
          lb3 = ao1.m2(fd1, ld2, fd0, fd1);
}
        boolean lb4 = true;
        lb4 = lb0 || lb1;
        ld2 = fd0 - fd1;
        double ld5 = 621.9868662502771;
        boolean lb6 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][6] += ad2;
    ad3 = ad4 + fd0;
    double ld0 = 689.3010004815994;
    boolean lb1 = true;
    lb1 = !fb0;
    fb1 = lb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 - ad4;
    fb1 = lb1 && fb0;
    boolean lb2 = false;
    Thought lo3 = Thought47.getInstance();
    boolean lb4 = false;
    lb4 = fb0 && fb1;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab3 = ab4 || fb0;
    fb1 = lb0 || ab1;
    ab2 = fd1 < fd0;
    fd1 = fd0 + fd1;
    ab3 = fd0 < fd1;
    boolean lb1 = true;
    ab3 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        if (ab4) {
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
            fb0 = fb1 || lb0;
            lb1 = fd0 > fd1;
if(ao1 != null){
              fd0 = ao1.m3();
}
            Thought lo2 = Thought275.getInstance(ab1, ab2, ab3, ab4);
            fb0 = fb1 || lb0;
            fd1 = fd0 - fd1;
            for(int i1=0; i1<10; i1++){
                boolean lb3 = true;
                }
            boolean lb4 = false;
            lb0 = fd0 < fd1;
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
    ad2 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb0 = lb1 && ab1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    double ld2 = 956.9760971705757;
    boolean lb3 = true;
        ad4 = fd0 - fd1;
    Thought lo4 = Thought301.getInstance(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3);
if(ao2 != null){
      ab3 = ao2.m2();
}
    Thought lo5 = Thought30.getInstance(ab4, fb0, fb1, lb0);
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2, lb3, ab1, ab2, ab3);
}
    boolean lb6 = false;
    ab3 = ab4 || fb0;
    fb1 = lb0 || lb1;
    lb3 = lb6 || ab1;
    ab2 = ad1 < ad2;
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb3);
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[4][7] += fd1;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought145.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    Output.points[4][8] += fd0;
    double ld2 = 95.97054286033577;
    fb1 = !lb0;
    double ld3 = 699.888463809466;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld2);
}
    boolean lb4 = true;
    double ld5 = 227.15742846249154;
    lb4 = !fb0;
    fb1 = ld3 > ld5;
    lb0 = lb4 || fb0;

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
    ab2 = !ab3;
    boolean lb0 = true;
    double ld1 = 781.1890809721831;
    boolean lb2 = false;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    fd1 = ld1 - fd0;
    double ld3 = 284.7751809373287;
    boolean lb4 = true;
    boolean lb5 = true;
    boolean lb6 = false;
    ab3 = fd0 > fd1;
    ld1 = ld3 - fd0;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, lb2);
}
    lb4 = !lb5;
    lb6 = !ab1;
    ab2 = fd1 < ld1;
    ld3 *= -1;
    ab3 = ab4 || fb0;
    fd0 = fd1 + ld1;
    fb1 = ld3 < fd0;
    double ld7 = 238.6116032563967;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = ad2 > ad3;
    ad4 *= -1;
    double ld0 = 559.5073341769106;
    boolean lb1 = true;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    lb1 = ad1 < ad2;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
}
    fb1 = ad2 < ad3;
    Thought lo2 = Thought107.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb1;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
    fb0 = !fb1;
    boolean lb3 = true;
    lb1 = ad2 < ad3;
    lb3 = !fb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
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
    ab2 = !ab3;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = !fb0;
    Thought lo0 = Thought70.getInstance(fb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ad1 > ad2;
    if (ab2) {
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
        ad1 = ad2 - ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        lb1 = ab1 && ab2;
        ad4 = fd0 + fd1;
        ab3 = !ab4;
        fb0 = ad1 > ad2;
        boolean lb2 = true;
        Thought lo3 = Thought66.getInstance(fo1, fo0, fo1, fo0);
        double ld4 = 838.532414712371;
if(fo1 != null){
          fo1.m3(ad2, ad3, ad4, fd0);
}
        fb0 = fd1 > ld4;
        boolean lb5 = true;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        fb0 = fb1 && lb1;
        fd0 = fd1 + ld4;
if(fo1 != null){
          lb2 = fo1.m2();
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
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Output.points[5][0] += fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;

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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    Thought lo0 = Thought225.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb1 = false;
    Thought lo2 = Thought283.getInstance();
    ad1 = ad2 + ad3;
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
    Output.points[5][1] -= ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[5][2] -= ad4;
    lb1 = fd0 < fd1;
    fb0 = ad1 > ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
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
    ab1 = fd1 > fd0;
    fd1 *= -1;
    ab2 = fd0 > fd1;
    ab3 = fd0 > fd1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        fd1 = fd0 - fd1;
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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ad2 *= -1;
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    ab3 = ad3 < ad4;
    ab4 = !fb0;
    double ld1 = 14.476162829285636;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
    Output.points[5][3] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fb1 = ao1.m2();
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
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = fb0 || fb1;

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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    Thought lo0 = Thought19.getInstance();
    Output.points[5][4] -= fd1;
if(fo1 != null){
          fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
}
    boolean lb3 = true;
    Output.points[5][5] += fd1;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    lb1 = !lb2;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = fb1 || lb0;
    lb1 = fd0 > fd1;
    boolean lb3 = true;
if(fo0 != null){
      lb2 = fo0.m2(lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, lb3, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
    fd0 *= -1;
    lb3 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought122.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
    double ld5 = 793.0621319066641;

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
