package genetic;
import java.util.ArrayList;
class Thought174 extends Thought{
private static ArrayList<Thought174> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 294.0666875606903;
private double fd1 = 877.1835190952635;
private Thought fo0 = null;
private Thought fo1 = null;
Thought174 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought174 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought174 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought174 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought174 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought174 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought174 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought174 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought174 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought174 instance = new Thought174 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought174 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought174 instance = new Thought174 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought174 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought174 instance = new Thought174 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought174 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought174 instance = new Thought174 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought174 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought174 instance = new Thought174 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought174 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought174 instance = new Thought174 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought174 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought174 instance = new Thought174 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought174 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought174 instance = new Thought174 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 637.0151732003542;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought190.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = true;
    double ld3 = 520.9693343386986;
if(fo1 != null){
      fb0 = fo1.m2(ld3, fd0, fd1, ld0);
}
    ld3 = fd0 - fd1;
    fb1 = ld0 > ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3);
}
    Thought lo4 = Thought71.getInstance();
    double ld5 = 890.0345939313764;
if(fo0 != null){
      lb2 = fo0.m2(fb0, fb1, lb2, fb0);
}
    Output.points[6][1] += ld5;
    fd0 = fd1 + ld0;
    Output.points[6][2] += ld3;
    ld5 = fd0 + fd1;
        fb1 = lb2 && fb0;
    boolean lb6 = false;
    ld0 *= -1;

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
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    double ld0 = 193.32788220710063;
    boolean lb1 = false;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;

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
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 *= -1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = fd1 > ad1;
if(fo0 != null){
      ab4 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought137.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    boolean lb2 = false;
    double ld3 = 486.86619950644024;
    ab2 = fd0 > fd1;
    ld3 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought138.getInstance(ad3, ad4, fd0, fd1);
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab3 = !ab4;
    Output.points[6][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld5 = 797.8001507135809;
    boolean lb6 = true;
    ab4 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
    Output.points[6][4] += ld3;

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
    double ld0 = 935.7654603304615;
    fd0 *= -1;
    fd1 *= -1;
    ld0 = fd0 - fd1;
    Output.points[6][5] += ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought283.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m2(ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    boolean lb2 = true;
    fd1 = ld0 + fd0;
    lb2 = fb0 && fb1;
    fd1 = ld0 - fd0;
    lb2 = fb0 || fb1;
if(ao1 != null){
      lb2 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb2, fb0);
}
    fd1 = ld0 - fd0;
    fb1 = fd1 < ld0;

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
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    lb0 = ad1 < ad2;
        ad3 = ad4 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought5.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
    double ld2 = 579.2612403312801;
if(ao2 != null){
      ao2.m3();
}
    Output.points[6][6] -= ad2;

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
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fd1 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[6][7] -= fd1;
    ab2 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    Thought lo0 = Thought131.getInstance(ab3, ab4, fb0, fb1);
    fd0 = fd1 - fd0;
        ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
    double ld0 = 378.17974906137624;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        fb0 = ad4 > fd0;
        fb1 = !ab1;
        double ld1 = 290.1889074316967;
        fd0 = fd1 - ld1;
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
        boolean lb2 = true;
        boolean lb3 = false;
if(ao1 != null){
          fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
        boolean lb4 = false;
        boolean lb5 = false;
if(ao2 != null){
          ao1 = ao2.m4();
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Output.points[6][8] -= fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        Thought lo0 = Thought149.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    if (ab4) {
        fd1 = fd0 - fd1;
        fd0 *= -1;
        fb0 = fd1 > fd0;
        fb1 = !lb0;
        Thought lo2 = Thought267.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
        Thought lo3 = Thought122.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
        fd1 = fd0 + fd1;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought40.getInstance(ad4, fd0, fd1, ad1);
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    boolean lb2 = false;
    boolean lb3 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        Thought lo1 = Thought378.getInstance();
    ab1 = ab2 || ab3;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fd1 > ad1;
    ad2 *= -1;
    fb1 = ad3 < ad4;
    lb0 = fd0 < fd1;
if(fo1 != null){
      ab1 = fo1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
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
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb0 = fo1.m2();
}
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, fb0);
}
    double ld1 = 519.9569941833902;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    fd0 = fd1 - ld1;
    fd0 *= -1;
    lb0 = !lb2;
    double ld3 = 866.9087426948684;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, ld3, fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb0, lb2, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb4 = false;

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
      ao2.m2(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought255.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
    boolean lb1 = true;
    double ld2 = 296.17529543285707;
    Thought lo3 = Thought372.getInstance();
    fb0 = ad2 < ad3;
    Thought lo4 = Thought185.getInstance(fb1, lb1, fb0, fb1);
    ad4 = fd0 - fd1;
    double ld5 = 134.94791823797658;
    lb1 = fb0 || fb1;
    double ld6 = 438.580886557036;
    Thought lo7 = Thought205.getInstance(ao1, ao2, ao3, ao4, ld2, ld5, ld6, ad1, lb1, fb0, fb1, lb1);
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld2, ld5, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ld6, ad1, ad2, ad3);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
    Thought lo8 = Thought182.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld5, ld6, ad1, ad2, lb1, fb0, fb1, lb1);
}
    fb0 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, ld5, fb1, lb1, fb0, fb1);
}
    Output.points[7][0] -= ld6;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
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
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    double ld0 = 877.7011730576357;
    ab4 = ld0 < fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    ld0 *= -1;
    fb0 = fb1 && ab1;
    double ld1 = 558.7422933036153;
    ab2 = ab3 || ab4;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb2 = true;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb2, ab1);
}
        double ld3 = 916.930376888914;
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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    double ld1 = 405.32676924938886;
    boolean lb2 = true;
    boolean lb3 = false;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld1, ad1, ad2, lb0, lb2, lb3, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = ad3 > ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb2, lb3);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, ld1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab1 = fd1 < ld1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && lb0;
    fd0 = fd1 - ld1;
if(ao4 != null){
      ao4.m3(lb2, lb3, ab1, ab2);
}
    ab3 = ab4 && fb0;
    ad1 = ad2 - ad3;

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
    fb0 = !fb1;
    double ld0 = 975.4217921939147;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 || fb0;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1, fb1, lb1, lb2, fb0);
}
    fb1 = ld0 < fd0;
        lb1 = !lb2;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb2, fb0);
}
        Thought lo3 = Thought90.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fb1 = fo0.m2(fd1, ld0, fd0, fd1);
}
        double ld4 = 357.1811554151495;
if(fo1 != null){
          ld4 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld4);
}
        ld0 = fd0 - fd1;
        } else if (lb1) {
        lb2 = fb0 || fb1;
        lb1 = lb2 && fb0;
        fb1 = ld0 > fd0;
        fd1 = ld0 - fd0;
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
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld0 = 364.08209331619094;
    Thought lo1 = Thought172.getInstance();
    ld0 = fd0 + fd1;
    ab1 = ld0 > fd0;
    Thought lo2 = Thought230.getInstance(ab2, ab3, ab4, fb0);
    fd1 = ld0 - fd0;
    fb1 = fd1 < ld0;
    ab1 = !ab2;
    boolean lb3 = true;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - fd0;
    fb1 = lb3 && ab1;
        Output.points[7][1] -= fd1;
    Output.points[7][2] -= ld0;
    Thought lo4 = Thought332.getInstance(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 < ld0;
    Thought lo5 = Thought231.getInstance(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
    Thought lo0 = Thought329.getInstance(ad1, ad2, ad3, ad4);
    Thought lo1 = Thought361.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 814.1196484443379;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
    fb0 = !fb1;
    lb3 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb3, fb0, fb1);
}
    fd1 = ld2 + ad1;
    lb3 = fb0 && fb1;

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
    boolean lb0 = true;
    Thought lo1 = Thought233.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
    boolean lb2 = false;
    ab3 = !ab4;
    fb0 = fb1 && lb0;
    Output.points[7][3] -= fd1;
    lb2 = ab1 || ab2;
    double ld3 = 907.8309041641052;
    ld3 = ad1 + ad2;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
    boolean lb0 = true;
    double ld1 = 476.1853178719548;
    Output.points[7][4] += ld1;
    fd0 = fd1 + ld1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;

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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        ad2 = ad3 + ad4;
        double ld0 = 841.549677159036;
        fb1 = !fb0;
        } else {
        Thought lo1 = Thought327.getInstance(ao3, ao4, fo0, fo1);
                boolean lb2 = false;
        fb0 = !fb1;
if(ao1 != null){
          lb2 = ao1.m2(fd0, fd1, ad1, ad2);
}
        boolean lb3 = true;
        boolean lb4 = true;
        lb3 = lb4 && fb0;
        Output.points[7][5] += ad3;
        double ld5 = 917.779020831964;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        ld5 = ad1 + ad2;
        boolean lb6 = true;
        fb0 = fb1 && lb2;
}
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
      fd0 = ao2.m3();
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    double ld2 = 982.5826198717076;
    boolean lb3 = true;
    Output.points[7][6] -= ld2;
        ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0, fb1, lb0, lb1, lb3);
}
    ab1 = !ab2;
    double ld4 = 59.8057398610729;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb5 = true;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    lb1 = lb3 && lb5;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, ld4, fd0);
}
    fd1 = ld2 + ld4;
    lb6 = ab1 || ab2;
    Thought lo7 = Thought224.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ld4);
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    if (ab4) {
        fb0 = ad2 < ad3;
        ad4 *= -1;
        Thought lo0 = Thought287.getInstance(fb1, ab1, ab2, ab3);
        Output.points[7][7] += fd0;
        ab4 = !fb0;
        fd1 *= -1;
        fb1 = !ab1;
        boolean lb1 = true;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
}
        double ld2 = 622.2060265319463;
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        lb1 = ad3 > ad4;
        boolean lb3 = true;
        lb3 = ab1 && ab2;
        Thought lo4 = Thought197.getInstance(fd0, fd1, ld2, ad1);
        ab3 = ab4 || fb0;
        Output.points[7][8] += ad2;
        boolean lb5 = true;
        for(int i0=0; i0<10; i0++){
            fb0 = !fb1;
            ad3 = ad4 + fd0;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2);
}
            ad3 *= -1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought297.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    double ld2 = 584.8139789915956;
    fd0 = fd1 - ld2;
    lb1 = !fb0;
    fb1 = lb1 || fb0;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
          lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
    Output.points[8][0] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld3 = 61.81611737819996;

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
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    double ld0 = 492.3936510477979;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = ld0 - ad1;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, lb2, fb0, fb1);
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
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    double ld1 = 173.22373187780732;
    double ld2 = 498.6512240119666;
    double ld3 = 760.7314355947473;
    ab1 = ab2 || ab3;
    ad2 = ad3 + ad4;
    boolean lb4 = false;
    Thought lo5 = Thought123.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    lb0 = lb4 && ab1;
    boolean lb6 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ld2, ld3);
}
    ab1 = !ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld1;
    ld2 *= -1;
    ld3 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, lb4, lb6, ab1, ab2);
}
    ab3 = ab4 || fb0;
    ld2 *= -1;
    fb1 = !lb0;
    Thought lo7 = Thought177.getInstance(ld3, ad1, ad2, ad3, lb4, lb6, ab1, ab2);

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
    fb1 = fd0 > fd1;
    double ld0 = 985.0657824441158;
    fb0 = ld0 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    double ld1 = 324.7245202857019;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fb0 = fb1 || fb0;
        double ld2 = 404.36539009361616;
        boolean lb3 = true;
        for(int i1=0; i1<10; i1++){
            fb0 = !fb1;
            boolean lb4 = true;
}}
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
    fb0 = ad2 > ad3;
    fb1 = ad4 < fd0;
    Output.points[8][1] += fd1;
    double ld0 = 430.04727319312406;
    fb0 = ld0 > ad1;
    fb1 = !fb0;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought256.getInstance(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
if(ao2 != null){
      ad4 = ao2.m3();
}
    fb0 = fb1 || fb0;
if(ao3 != null){
      fd0 = ao3.m3(fb1, fb0, fb1, fb0);
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
    fd0 *= -1;
    fd1 *= -1;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;
if(ao2 != null){
      ao2.m3();
}
    Output.points[8][2] += fd0;
    fd1 *= -1;
    fd0 *= -1;
    ab4 = fd1 > fd0;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, ab1);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[8][3] += fd0;
    Thought lo1 = Thought43.getInstance(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
    fd1 *= -1;
    boolean lb2 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 > fd1;

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
        ab2 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 && fb0;
    double ld0 = 316.4907478549922;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(ao3 != null){
      ao3.m3();
}
    if (lb1) {
        ab1 = fd0 < fd1;
if(ao4 != null){
          ld0 = ao4.m3(ab2, ab3, ab4, fb0);
}
        Thought lo2 = Thought56.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb1, ab1, ab2);
        ab3 = !ab4;
if(ao3 != null){
          fd0 = ao3.m3(fd1, ld0, ad1, ad2, fb0, fb1, lb1, ab1);
}
        Output.points[8][4] -= ad3;
        double ld3 = 454.1334119267943;
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    fd0 *= -1;
        fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld0 = 435.09702451673587;
    double ld1 = 468.67953136161975;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(ld0, ld1, fd0, fd1);
}
    double ld2 = 944.5590321498315;
    double ld3 = 236.8682067358548;
    double ld4 = 907.3712376522404;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld1, ld2, ld3);
}
    fb1 = !fb0;
    ld4 = fd0 - fd1;
    Thought lo5 = Thought175.getInstance();
    ld0 = ld1 - ld2;
    fb1 = fb0 && fb1;
    ld3 = ld4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    ld0 = ld1 - ld2;
    Output.points[8][5] += ld3;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fd0 *= -1;
    fd1 *= -1;
    double ld1 = 899.153106768766;
    Output.points[8][6] += ld1;
    fb0 = !fb1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, lb2, fb0, fb1);
}
        lb0 = lb2 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, fb1, lb0, lb2, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
    lb0 = ld1 < fd0;
    double ld3 = 809.0890573691534;

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
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought131.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb2 = true;
    Thought lo3 = Thought135.getInstance();
        lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
    Thought lo4 = Thought218.getInstance(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    Thought lo5 = Thought380.getInstance(fo0, fo1, fo0, fo1);
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo6 = Thought258.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Thought lo7 = Thought320.getInstance();
if(fo0 != null){
      lb1 = fo0.m2(lb2, fb0, fb1, lb1);
}
    Output.points[8][7] -= fd1;

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
