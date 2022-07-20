package genetic;
import java.util.ArrayList;
class Thought126 extends Thought{
private static ArrayList<Thought126> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 999.9433244150991;
private double fd1 = 791.9973891125272;
private Thought fo0 = null;
private Thought fo1 = null;
Thought126 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought126 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought126 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought126 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought126 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought126 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought126 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought126 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought126 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought126 instance = new Thought126 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought126 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought126 instance = new Thought126 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought126 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought126 instance = new Thought126 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought126 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought126 instance = new Thought126 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought126 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought126 instance = new Thought126 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought126 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought126 instance = new Thought126 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought126 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought126 instance = new Thought126 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought126 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought126 instance = new Thought126 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[6][1] -= fd0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought64.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = !fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[6][2] -= fd1;
    boolean lb1 = false;
    lb1 = ab1 || ab2;
    fd0 *= -1;
    ab3 = fd1 > fd0;
        fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    boolean lb2 = false;
    fb0 = fd1 < fd0;
    boolean lb3 = false;
    fd1 = fd0 + fd1;

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
    ad1 = ad2 - ad3;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
        fd1 = ad1 - ad2;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fb0 = ad1 < ad2;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fb0 = fo0.m2();
}
        fd0 = fd1 + ad1;
        fb1 = ad2 < ad3;
        for(int i1=0; i1<10; i1++){
            lb0 = fb0 || fb1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
    Thought lo0 = Thought79.getInstance(fo1, fo0, fo1, fo0);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        }
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    ab3 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
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
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 270.6149606827333;
    Thought lo1 = Thought362.getInstance(ao1, ao2, ao3, ao4);
    boolean lb2 = true;
    Thought lo3 = Thought149.getInstance(fd0, fd1, ld0, fd0);
    fb0 = fd1 < ld0;
    Output.points[6][3] -= fd0;
    double ld4 = 526.9233556050925;
    double ld5 = 822.5033012199482;
    fb1 = ld5 > fd0;
    fd1 = ld0 - ld4;
    lb2 = fb0 && fb1;
    Output.points[6][4] += ld5;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ld4, ld5);
}
    boolean lb6 = true;
    lb2 = lb6 && fb0;

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
      ad2 = ao2.m3();
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    boolean lb0 = false;
    Thought lo1 = Thought150.getInstance(fb0, fb1, lb0, fb0);
    ad3 *= -1;
    Thought lo2 = Thought340.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = ad1 + ad2;
    double ld3 = 789.4597770431909;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = ad2 > ad3;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[6][5] -= ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld3, ad1);
}
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    lb0 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
            ld3 = ad1 + ad2;
    fb1 = lb0 && fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = !lb0;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
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
    Thought lo0 = Thought397.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought186.getInstance(ao1, ao2, ao3, ao4);
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        Output.points[6][6] -= fd0;
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0);
}
        ab1 = ab2 && ab3;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fd0 = fo1.m3();
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
    double ld0 = 815.5402053030834;
    Output.points[6][7] -= ad1;
    ab2 = ad2 > ad3;
if(ao1 != null){
      ao1.m1(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    Output.points[6][8] += fd1;
    ab1 = ab2 || ab3;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought106.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 680.0633609893745;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ld1 > fd0;
    Output.points[7][0] += fd1;
    fb1 = ld1 < fd0;
    Thought lo2 = Thought55.getInstance(fb0, fb1, fb0, fb1);
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, lb3, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, lb3, lb4, fb0, fb1);
}
    fd0 *= -1;
    Output.points[7][1] -= fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 334.46660524503056;
    Thought lo1 = Thought303.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = ld0 > fd0;
    fd1 = ld0 + fd0;
    ab1 = !ab2;
    fd1 = ld0 + fd0;
    boolean lb2 = true;
    boolean lb3 = false;
    double ld4 = 732.7994594480489;
    Thought lo5 = Thought332.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ld0, ld4);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld0);
}
    ld4 = fd0 - fd1;
    boolean lb6 = true;
    Thought lo7 = Thought5.getInstance();
    ab1 = ld0 > ld4;
    double ld8 = 961.9460985387238;

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
    Thought lo0 = Thought393.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    Thought lo2 = Thought10.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > ad1;
    lb1 = fb0 || fb1;
    lb1 = !fb0;
    ad2 = ad3 + ad4;
    Thought lo3 = Thought177.getInstance(fd0, fd1, ad1, ad2);
    boolean lb4 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb5 = true;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb1;
    lb4 = lb5 && fb0;
    Output.points[7][2] -= ad4;

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
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ad1 > ad2;
    ab3 = ad3 > ad4;
    Thought lo0 = Thought377.getInstance(fd0, fd1, ad1, ad2);
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[7][3] += ad1;
    double ld2 = 626.2910627656181;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    Thought lo0 = Thought22.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
    boolean lb1 = true;
    lb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        double ld3 = 268.8935879572236;
        Thought lo4 = Thought109.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb2, lb1);
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
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    if (fb1) {
        ad3 = ad4 + fd0;
        double ld0 = 967.951986390667;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
}
        fb0 = ad2 > ad3;
        Thought lo1 = Thought345.getInstance();
        fb1 = fb0 || fb1;
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    Thought lo0 = Thought192.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    Thought lo1 = Thought340.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
    boolean lb2 = false;
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fd0 *= -1;

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
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    double ld1 = 77.10875524706859;
    fd0 *= -1;
    fd1 = ld1 + ad1;
    ab1 = ad2 > ad3;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
    ab3 = ab4 && fb0;
        boolean lb2 = false;
    ad1 = ad2 + ad3;
    double ld3 = 930.4867563452833;
    fb0 = !fb1;
    boolean lb4 = true;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ao2.m3(lb0, lb2, lb4, ab1);
}
    ab2 = ab3 && ab4;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    Thought lo1 = Thought201.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
if(fo0 != null){
          fo0.m3(lb0, fb0, fb1, lb0);
}
    Output.points[7][4] += fd1;
    Thought lo2 = Thought36.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    boolean lb3 = true;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
    Thought lo0 = Thought91.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought208.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
    Thought lo2 = Thought325.getInstance(fd1, fd0, fd1, fd0);
    fb1 = ab1 || ab2;
    Thought lo3 = Thought147.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    ab3 = ab4 || fb0;
    boolean lb4 = false;

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
if(fo0 != null){
      fo0.m2();
}
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad3 < ad4;
    fd0 *= -1;
    fb0 = fb1 && fb0;

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
    boolean lb0 = true;
    double ld1 = 438.9671363678894;
    boolean lb2 = false;
    double ld3 = 55.438206526130955;
if(fo0 != null){
      lb2 = fo0.m2(ld1, ld3, ad1, ad2);
}
    ab1 = ad3 < ad4;
    fd0 = fd1 + ld1;
    ld3 = ad1 - ad2;
    Thought lo4 = Thought108.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    ab2 = ld1 < ld3;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo5 = Thought154.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb2, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld3, ad1, fb1, lb0, lb2, ab1);
}
    Thought lo6 = Thought165.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    Thought lo7 = Thought367.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ad2 < ad3;
    Thought lo8 = Thought369.getInstance(ad4, fd0, fd1, ld1);
    ld3 = ad1 - ad2;
    if (lb0) {
        lb2 = ab1 && ab2;
        Thought lo9 = Thought195.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
        ab3 = ld1 < ld3;
        Thought lo10 = Thought117.getInstance();
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
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    if (fb1) {
        boolean lb0 = true;
        lb0 = fb0 && fb1;
        fd1 = fd0 + fd1;
        lb0 = fd0 > fd1;
        boolean lb1 = false;
        fd0 = fd1 - fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
        lb1 = fd1 < fd0;
        fb0 = fb1 || lb0;
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
              lb1 = ao4.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
            fd1 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought155.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    Output.points[7][5] += ad2;
    Output.points[7][6] -= ad3;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ad1 = ad2 - ad3;
    Output.points[7][7] -= ad4;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought21.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 > ad3;
if(ao3 != null){
          ad4 = ao3.m3();
}
        fb1 = fd0 < fd1;
        ad1 = ad2 - ad3;
        fb0 = !fb1;
        ad4 = fd0 - fd1;
if(ao4 != null){
          ao4.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        Output.points[7][8] -= fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought367.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
    Output.points[8][0] -= fd1;
    Thought lo1 = Thought312.getInstance(fo1, ao1, ao2, ao3);
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
        double ld3 = 134.90861323900523;
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
    ab2 = ad2 < ad3;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought381.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
if(ao4 != null){
          ao4.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought367.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = !lb0;
    ad2 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    Thought lo3 = Thought224.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
if(ao1 != null){
      ab2 = ao1.m2();
}
    ad2 = ad3 - ad4;

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
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo0 = Thought19.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        double ld1 = 803.2899617212934;
        double ld2 = 559.4984532948107;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld2, fd0, fd1, ld1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1);
}
        ld2 = fd0 - fd1;
        fb1 = ld1 < ld2;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd0 *= -1;
if(fo0 != null){
          fo0.m2(fb0, fb1, fb0, fb1);
}
        Thought lo3 = Thought276.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld1, ld2, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        Output.points[8][1] -= fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld1, ld2, fd0, fd1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 516.2767947406043;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
    Thought lo1 = Thought208.getInstance();
    fb0 = fb1 && ab1;
    double ld2 = 202.3489680714622;
    ld0 = ld2 + fd0;
    Output.points[8][2] -= fd1;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb3 = true;
    ld0 = ld2 - fd0;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, ld2, fd0, lb4, ab1, ab2, ab3);
}
    Thought lo5 = Thought365.getInstance(fd1, ld0, ld2, fd0, ab4, fb0, fb1, lb3);
    lb4 = ab1 && ab2;
    boolean lb6 = true;
    double ld7 = 783.479921772033;
    ab2 = fd0 > fd1;
    double ld8 = 519.5328801945637;
    ab3 = ld0 < ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb4 = ld7 < ld8;
    fd0 *= -1;
    Output.points[8][3] += fd1;

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
    Thought lo0 = Thought138.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3();
}
    double ld1 = 868.2547208721527;
    Thought lo2 = Thought48.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld3 = 92.625364313619;
    boolean lb4 = true;
    Thought lo5 = Thought81.getInstance(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb4);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ld1 = ld3 + ad1;
    lb6 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb4, lb6);
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
    Thought lo0 = Thought289.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fd1 *= -1;
    Thought lo1 = Thought390.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    ad4 *= -1;

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
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[8][4] += fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought162.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    double ld1 = 536.5863233066209;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    ld1 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
    lb3 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought319.getInstance(ad1, ad2, ad3, ad4);
    double ld2 = 487.99100029079784;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2);
}
    ad1 *= -1;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld3 = 783.1068687295701;
    boolean lb4 = true;
    Output.points[8][5] -= ad2;
    lb0 = ad3 > ad4;
    fd0 *= -1;
if(ao4 != null){
      ao4.m3(lb4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld2, ld3, ad1, lb4, fb0, fb1, lb0);
}
    lb4 = ad2 < ad3;
    ad4 = fd0 + fd1;
    Output.points[8][6] += ld2;
    Thought lo5 = Thought314.getInstance(ld3, ad1, ad2, ad3, fb0, fb1, lb0, lb4);
    double ld6 = 415.61911346860177;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, lb4, fb0);
}
    fb1 = lb0 || lb4;
    boolean lb7 = false;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      lb7 = ao3.m2(ad4, fd0, fd1, ld2);
}
    double ld8 = 360.50691457055575;
    boolean lb9 = false;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld3, ld6, ld8, ad1);
}
    lb9 = ad2 < ad3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
    double ld0 = 252.1499495762815;
if(ao2 != null){
      ld0 = ao2.m3();
}
    boolean lb1 = false;
if(ao3 != null){
      ao3.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = ld0 < fd0;
        boolean lb2 = false;
    lb1 = lb2 || ab1;

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
      ao1.m2(ad1, ad2, ad3, ad4);
}
        ab2 = ab3 || ab4;
    fd0 = fd1 - ad1;
    Thought lo0 = Thought318.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    double ld1 = 921.9003716162488;
    fb0 = fd0 > fd1;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo3 = Thought302.getInstance(fb0, fb1, lb2, ab1);
        ab2 = !ab3;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb2);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 = ld1 - ad1;

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
    Thought lo0 = Thought240.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    Output.points[8][7] -= fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
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
    Output.points[8][8] += fd0;
    fb1 = !fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
    double ld3 = 455.73598206391074;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3, lb1, lb2, fb0, fb1);
}
    boolean lb4 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb4);
}
    boolean lb5 = true;
    lb5 = fd1 > ld3;
    double ld6 = 816.9083321810517;
    fb0 = fb1 || lb0;
    lb1 = lb2 && lb4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld6 = fd0 + fd1;
    ld3 = ld6 - fd0;
    lb5 = fb0 && fb1;
    double ld7 = 529.1365377675379;
    Output.points[0][0] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld3, ld6, ld7, fd0);
}
    lb0 = lb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, ld6, ld7);
}
    boolean lb8 = false;

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
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    double ld0 = 296.37652756292977;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 *= -1;
    ld0 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 *= -1;
    boolean lb1 = true;
    lb1 = !fb0;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    double ld2 = 419.88411220995926;

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
