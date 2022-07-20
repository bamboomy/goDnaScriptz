package genetic;
import java.util.ArrayList;
class Thought275 extends Thought{
private static ArrayList<Thought275> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 500.68141654816213;
private double fd1 = 6.062121130011883;
private Thought fo0 = null;
private Thought fo1 = null;
Thought275 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought275 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought275 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought275 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought275 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought275 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought275 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought275 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought275 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought275 instance = new Thought275 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought275 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought275 instance = new Thought275 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought275 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought275 instance = new Thought275 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought275 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought275 instance = new Thought275 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought275 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought275 instance = new Thought275 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought275 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought275 instance = new Thought275 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought275 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought275 instance = new Thought275 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought275 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought275 instance = new Thought275 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    Output.points[1][4] -= fd1;
    fb0 = fd0 > fd1;
    boolean lb0 = false;
    Thought lo1 = Thought68.getInstance(fb0, fb1, lb0, fb0);
    Thought lo2 = Thought155.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    double ld3 = 57.47952333246038;
    lb0 = !fb0;
    ld3 *= -1;
    fd0 *= -1;
    fd1 *= -1;
    ld3 = fd0 + fd1;
    ld3 = fd0 - fd1;
    Thought lo4 = Thought350.getInstance(ld3, fd0, fd1, ld3, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, ld3, fd0);
}
        Output.points[1][5] += fd1;
        boolean lb5 = true;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld6 = 898.0552460928453;
        fb0 = !fb1;
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
      fo0.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought276.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    Output.points[1][6] -= fd0;
    ab3 = ab4 && fb0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[1][7] += fd0;
if(fo1 != null){
      ab3 = fo1.m2(fd1, fd0, fd1, fd0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[1][8] += ad1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = ad2 > ad3;
    Output.points[2][0] += ad4;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
    fb0 = !fb1;
    double ld1 = 990.8146625872577;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought119.getInstance(ld1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    double ld3 = 546.0797955553853;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld3, ad1, ad2);
}
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3();
}
    fd0 *= -1;
    Output.points[2][1] -= fd1;

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
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Output.points[2][2] -= fd1;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        ab1 = ad4 < fd0;
        ab2 = !ab3;
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
      ao1.m3();
}
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    lb0 = fd0 > fd1;
    boolean lb1 = true;
    lb1 = fd0 > fd1;
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought267.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
    fb1 = fd0 > fd1;
if(ao3 != null){
          lb0 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(lb1, fb0, fb1, lb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad2 *= -1;
    ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought340.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Output.points[2][3] += ad1;
    Output.points[2][4] -= ad2;
    ad3 *= -1;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought58.getInstance(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
    double ld3 = 383.4971078547892;
    double ld4 = 647.4837774148077;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(ao1 != null){
          ao1.m2(fd0, fd1, fd0, fd1);
}
    double ld1 = 831.9089134677442;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    ab3 = fd1 < ld1;
if(ao1 != null){
          ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
    ab1 = fd0 > fd1;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(fd1, ld1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = ld1 > fd0;
    fb0 = fd1 > ld1;

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
    Thought lo0 = Thought270.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb1 = ad2 < ad3;
if(fo0 != null){
          fo0.m3(ad4, fd0, fd1, ad1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought58.getInstance();
    double ld2 = 219.6439589034379;
    ab4 = fb0 && fb1;
    ld2 *= -1;
    ab1 = ad1 < ad2;
    ab2 = !ab3;
if(fo0 != null){
          fo0.m3(ab4, fb0, fb1, ab1);
}
    ad3 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;

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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 379.5337269196395;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb1 = fd1 > ld0;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought113.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        boolean lb2 = true;
        lb2 = fd1 < ld0;
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 && lb2;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
            fd0 *= -1;
            Thought lo3 = Thought151.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
              fo0.m1(fd1, ld0, fd0, fd1);
}
}}
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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    Thought lo1 = Thought17.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m3();
}
    ab1 = fd1 < fd0;
    double ld2 = 41.71470233767595;
    fd0 = fd1 + ld2;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    boolean lb3 = true;
    ab1 = !ab2;
    fd0 = fd1 + ld2;
    ab3 = ab4 || fb0;
    fd0 *= -1;
    Thought lo4 = Thought111.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb1, lb0, lb3, ab1);
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    boolean lb1 = true;
    Thought lo2 = Thought11.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    lb0 = lb1 && fb0;
    fb1 = !lb0;
    lb1 = ad2 > ad3;
    fb0 = fb1 && lb0;
    double ld3 = 906.6071889666949;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || lb0;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    fd0 = fd1 - ld3;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ab1 = !ab2;
        }
    ab3 = ad2 < ad3;
    ab4 = fb0 && fb1;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    for(int i1=0; i1<10; i1++){
        ab1 = ad4 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
        Thought lo0 = Thought161.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
        Output.points[2][5] -= ad2;
        ab2 = !ab3;
        ab4 = ad3 > ad4;
        fb0 = fb1 && ab1;
        ab2 = !ab3;
        fd0 *= -1;
        ab4 = fd1 < ad1;
        double ld1 = 649.874198297057;
        double ld2 = 813.7934707875762;
        fb0 = !fb1;
if(fo0 != null){
          ld2 = fo0.m3();
}
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
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    Output.points[2][6] -= fd0;
    lb1 = fb0 || fb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb2 = false;
    lb0 = lb1 || lb2;
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 = ad2 + ad3;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ad4 = ao3.m3(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    boolean lb2 = false;
    fd0 = fd1 + ad1;

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
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fd0 *= -1;
if(ao4 != null){
      ab1 = ao4.m2();
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
    double ld3 = 529.8728310385271;
    lb2 = ab1 && ab2;
    boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld3, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought354.getInstance(fd1, ld3, fd0, fd1, fb1, lb0, lb1, lb2);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb4, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo6 = Thought179.getInstance(fo1, ao1, ao2, ao3);

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
    double ld0 = 64.19389561112047;
    ab2 = !ab3;
    double ld1 = 103.625259631407;
    ab4 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ld0, ld1, ad1, ad2);
}
    Thought lo2 = Thought136.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    ab1 = !ab2;
    boolean lb3 = true;
if(ao1 != null){
      ab2 = ao1.m2();
}
    double ld4 = 477.2714512813734;
    ab3 = ld0 < ld1;
    Thought lo5 = Thought110.getInstance(ab4, fb0, fb1, lb3);
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ld4, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 - fd1;
    boolean lb6 = false;
    fb0 = !fb1;
if(ao1 != null){
      ld0 = ao1.m3(ld1, ld4, ad1, ad2, lb3, lb6, ab1, ab2);
}
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb3, lb6);
}
    boolean lb7 = false;
    lb7 = ad3 < ad4;
    double ld8 = 425.6462594705922;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab1 = ao2.m2(ad4, fd0, fd1, ld0);
}
    ld1 = ld4 + ld8;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fd1 > fd0;
    fb1 = lb0 || lb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    lb2 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
            double ld3 = 5.107150016251569;
    boolean lb4 = false;
    lb2 = !lb4;
    ld3 = fd0 + fd1;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    lb2 = fd0 < fd1;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    double ld1 = 790.0367724720155;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    Output.points[2][7] -= fd1;
    ab4 = !fb0;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ld1 = fo0.m3(fb1, lb0, ab1, ab2);
}
    fd0 = fd1 + ld1;
    fd0 = fd1 - ld1;

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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 479.5705771602465;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
    Output.points[2][8] -= ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
    fb1 = fb0 && fb1;

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
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = lb2 || lb3;
    boolean lb4 = true;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    double ld5 = 773.1935338428308;
    lb4 = ld5 > ad1;
    ad2 = ad3 - ad4;
    boolean lb6 = false;

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
    fb1 = fd0 > fd1;
    Thought lo0 = Thought250.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = fd0 - fd1;
    Output.points[3][0] += fd0;
    Output.points[3][1] += fd1;
    Output.points[3][2] -= fd0;
    fb1 = !fb0;
if(ao2 != null){
      fd1 = ao2.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought212.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[3][3] += fd0;
    if (fb1) {
        Thought lo2 = Thought396.getInstance(fd1, fd0, fd1, fd0);
        fb0 = fd1 < fd0;
        boolean lb3 = false;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        fb1 = fd1 < fd0;
        lb3 = fd1 < fd0;
        fd1 = fd0 - fd1;
if(ao3 != null){
          fb0 = ao3.m2(fb1, lb3, fb0, fb1);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
        Output.points[3][4] -= fd0;
if(ao1 != null){
      ao1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 > fd0;
    fd1 = ad1 + ad2;
    lb0 = ad3 > ad4;
    fb0 = fd0 > fd1;
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = lb0 && fb0;
    ad3 = ad4 - fd0;
    fb1 = lb0 && fb0;
    fb1 = fd1 < ad1;
    Thought lo1 = Thought286.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb0 = !fb0;
    fd0 *= -1;
    fb1 = fd1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 411.01685136880695;
    Output.points[3][5] += fd0;
if(ao1 != null){
      fd1 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    Output.points[3][6] -= fd0;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao2.m2(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    ab1 = ld0 < fd0;
    Output.points[3][7] += fd1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    double ld1 = 691.103719515515;
    ab1 = ld0 < ld1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = !ab2;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ab3 = ab4 || fb0;
    fb1 = lb0 || ab1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ab2 = ad4 > fd0;
    fd1 = ad1 - ad2;
    ab3 = ad3 > ad4;
    Thought lo1 = Thought331.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
    fd0 = fd1 + ad1;
    lb2 = ab1 && ab2;

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
    double ld0 = 562.4236640419053;
    Thought lo1 = Thought215.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ld0 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought275.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    Thought lo5 = Thought78.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ld0 < fd0;

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
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = fd1 > fd0;

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
    fb1 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    fb0 = fb1 || fb0;
    double ld0 = 200.6087731981507;
if(fo1 != null){
      ad4 = fo1.m3();
}
    boolean lb1 = false;
    Output.points[3][8] += fd0;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
        fb0 = ld0 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    Output.points[4][0] -= ad4;

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
    ad2 = ad3 - ad4;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought381.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    Thought lo2 = Thought128.getInstance();
    fb1 = lb0 && ab1;
if(fo1 != null){
      ad1 = fo1.m3(ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    boolean lb3 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, lb3, ab1);
}
    ad3 *= -1;
    ad4 *= -1;
    ab2 = fd0 > fd1;
    ad1 = ad2 + ad3;

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
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
        double ld0 = 413.2817866556371;
        Thought lo1 = Thought163.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
        fd1 = ld0 + fd0;
        fd1 = ld0 + fd0;
        fb0 = fd1 < ld0;
if(ao1 != null){
          fd0 = ao1.m3();
}
        fb1 = fd1 < ld0;
        boolean lb2 = false;
        lb2 = fd0 < fd1;
        fb0 = !fb1;
        ld0 = fd0 - fd1;
        }
    boolean lb3 = false;
if(ao2 != null){
      ao2.m2(lb3, fb0, fb1, lb3);
}
    double ld4 = 80.44737551520012;
    Output.points[4][1] += ld4;
    boolean lb5 = false;
    Output.points[4][2] += fd0;
    lb5 = fd1 > ld4;
    Thought lo6 = Thought310.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld4, fd0, fb0, fb1, lb3, lb5);
if(ao1 != null){
      fd1 = ao1.m3(ld4, fd0, fd1, ld4, fb0, fb1, lb3, lb5);
}
    double ld7 = 561.6869802214032;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
    fd1 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
    ad3 = ad4 + fd0;
if(fo1 != null){
      lb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = true;
    boolean lb5 = true;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m1();
}
    fd0 *= -1;
    lb1 = fd1 > ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    boolean lb6 = false;

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
    ab1 = ab2 && ab3;
    double ld0 = 297.8727752427149;
    double ld1 = 995.9837532875038;
    Output.points[4][3] -= ld1;
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
if(ao1 != null){
      ao1.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ld0 *= -1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    lb2 = ld1 < fd0;
    ab1 = ab2 || ab3;
    Output.points[4][4] -= fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb2);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld0);
}
    boolean lb3 = false;

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
    Output.points[4][5] -= ad2;
    ab2 = !ab3;
    boolean lb0 = true;
    Output.points[4][6] -= ad3;
    ad4 = fd0 + fd1;
    ab3 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    ab4 = !fb0;
    Output.points[4][7] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb1 = ao3.m2(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    Thought lo1 = Thought186.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m2(ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
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
    boolean lb0 = false;
        Thought lo1 = Thought60.getInstance();
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    double ld2 = 618.0071462743997;
    Thought lo3 = Thought176.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
    Output.points[4][8] += fd0;
    fd1 *= -1;
    fb0 = fb1 && lb0;
    ld2 = fd0 + fd1;
    boolean lb4 = false;
    ld2 = fd0 - fd1;
    boolean lb5 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    double ld1 = 855.958585380759;

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
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
    fd1 *= -1;
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    boolean lb1 = true;
    Thought lo2 = Thought125.getInstance(fo1, fo0, fo1, fo0);
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
}
