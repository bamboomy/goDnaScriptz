package genetic;
import java.util.ArrayList;
class Thought29 extends Thought{
private static ArrayList<Thought29> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 933.718391509871;
private double fd1 = 644.2189474161888;
private Thought fo0 = null;
private Thought fo1 = null;
Thought29 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought29 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought29 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought29 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought29 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[0][0] += fd0;
    double ld0 = 739.1455520006998;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 - fd0;
    double ld1 = 525.579167132327;
    boolean lb2 = true;
    fd0 = fd1 + ld0;

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
    ab2 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Output.points[0][1] -= fd1;
    ab2 = ab3 && ab4;
    Thought lo1 = Thought298.getInstance();
    fb0 = fb1 || lb0;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || ab1;
        Output.points[0][2] += fd0;
        Thought lo2 = Thought57.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
        boolean lb3 = false;
        fd1 *= -1;
        Thought lo4 = Thought248.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb3, lb0);
        Thought lo5 = Thought28.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[0][3] -= ad3;
    fb0 = ad4 < fd0;
    fb1 = fd1 > ad1;
        fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = ad2 < ad3;
    ab3 = ad4 < fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ab4 = ad4 > fd0;
    fb0 = !fb1;
    Output.points[0][4] -= fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      ad3 = fo0.m3(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
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
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
    Output.points[0][5] += fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = fd0 < fd1;
    Output.points[0][6] += fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought45.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
if(ao1 != null){
      fd1 = ao1.m3(fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb0);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = ad2 > ad3;
    Output.points[0][7] -= ad4;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought46.getInstance(fd0, fd1, ad1, ad2);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    lb0 = ad4 < fd0;
    fb0 = fd1 > ad1;
if(ao1 != null){
      ad2 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    ad1 = ad2 - ad3;
    fb1 = lb0 || fb0;
if(ao3 != null){
      fb1 = ao3.m2(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    ad2 = ad3 - ad4;

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
    if (ab1) {
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        ab2 = !ab3;
        ab4 = fd1 > fd0;
        fb0 = !fb1;
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought83.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
        if (ab1) {
            boolean lb1 = true;
            fd0 *= -1;
            double ld2 = 510.83525142392;
            boolean lb3 = false;
if(ao1 != null){
              fo1 = ao1.m4();
}
if(ao3 != null){
              ao2 = ao3.m4(lb3, ab1, ab2, ab3);
}
            fd0 = fd1 - ld2;
            ab4 = fd0 > fd1;
            fb0 = fb1 && lb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(ao1 != null){
          ao1.m2(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        ad3 = ad4 - fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
        ab3 = ad1 > ad2;
        double ld0 = 772.12549942184;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ab4 = !fb0;
        fb1 = ab1 || ab2;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
        boolean lb1 = true;
        ab2 = fd1 < ld0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao3.m2();
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
    fd1 = fd0 - fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo0 = Thought383.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    if (fb1) {
        fd1 = fd0 - fd1;
        boolean lb1 = true;
        lb1 = fb0 && fb1;
        lb1 = fb0 && fb1;
        lb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
        double ld2 = 176.3919868658177;
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
    Thought lo0 = Thought380.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
        boolean lb1 = true;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ab4 = !fb0;
        fd0 = fd1 - fd0;
        boolean lb2 = true;
        fb0 = !fb1;
        lb1 = lb2 || ab1;
        Thought lo3 = Thought218.getInstance(fd1, fd0, fd1, fd0);
        boolean lb4 = false;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab1 = fd0 > fd1;
        Thought lo5 = Thought141.getInstance(ab2, ab3, ab4, fb0);
        boolean lb6 = false;
        fd0 = fd1 - fd0;
        boolean lb7 = true;
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 + ad2;
    double ld0 = 939.250395954849;
    ad2 *= -1;
    fb0 = ad3 > ad4;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld1 = 813.8490636494873;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought50.getInstance(fo0, fo1, fo0, fo1);

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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Output.points[0][8] -= ad3;
    ab2 = ad4 < fd0;
    double ld0 = 56.6397252130898;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
        fb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ld0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    Output.points[1][0] += ad1;
    ab1 = ad2 > ad3;
    ab2 = ad4 > fd0;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought249.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Thought lo1 = Thought272.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought329.getInstance(fo0, fo1, ao1, ao2);
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    Output.points[1][1] -= fd1;

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
    Output.points[1][2] -= ad1;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    boolean lb0 = true;
    fb0 = ad2 > ad3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = lb0 || fb0;
    fb1 = lb0 && fb0;
if(ao4 != null){
      ao4.m1(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 751.2519789044737;
    fd0 *= -1;

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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought40.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    Output.points[1][3] += fd0;
    fd1 *= -1;
    Thought lo1 = Thought217.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    ab3 = ab4 && fb0;
    boolean lb2 = true;
    Thought lo3 = Thought114.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fd0 > fd1;
        fb1 = lb2 || ab1;
        boolean lb4 = true;
        ab1 = fd0 < fd1;
        ab2 = ab3 && ab4;
        boolean lb5 = true;
        }
    boolean lb6 = false;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb2, lb6, ab1);
}
    double ld7 = 88.49975641424565;
    fd0 = fd1 - ld7;
        ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld7, fd0, ab4, fb0, fb1, lb2);
}
    for(int i1=0; i1<10; i1++){
}
Thought.STACK_COUNTER++;
return lb6;
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
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    Output.points[1][4] += fd0;
    ab3 = fd1 < ad1;
    ab4 = !fb0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    Output.points[1][5] -= ad3;
    ad4 = fd0 - fd1;
    ab1 = ad1 < ad2;
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    ab3 = ab4 && fb0;
    fb1 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, ab1, ab2);
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
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    double ld1 = 677.6621961634127;
    ld1 = fd0 + fd1;
    lb0 = fb0 && fb1;
    boolean lb2 = true;
    lb0 = lb2 && fb0;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, lb0, lb2, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[1][6] -= ld1;
    lb0 = lb2 || fb0;
    double ld3 = 560.1019558610699;
    fb1 = lb0 || lb2;
    fb0 = ld3 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld1, ld3, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;
    fb0 = ld1 > ld3;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought36.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fd0, fd1, ld1, ld3);
}
        Output.points[1][7] += fd0;
        fb1 = !lb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld3, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
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
    ab2 = fd0 < fd1;
    double ld0 = 543.8406146633664;
    ab3 = !ab4;
    double ld1 = 203.35340140032824;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    ld0 = ld1 - fd0;
    fb1 = fd1 > ld0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 < ld1;
    boolean lb2 = true;
    lb2 = fd0 < fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
    ad2 = ad3 - ad4;
    if (fb0) {
        fb1 = fb0 || fb1;
        boolean lb0 = false;
        double ld1 = 492.0479765453251;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb0 = ad4 < fd0;
if(fo1 != null){
          fd1 = fo1.m3(ld1, ad1, ad2, ad3);
}
        double ld2 = 427.6645620313549;
        fb0 = ad3 < ad4;
        boolean lb3 = true;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
        fb1 = ad1 < ad2;
        lb0 = lb3 && fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fb1 = fo1.m2(lb0, lb3, fb0, fb1);
}
        ad3 = ad4 + fd0;
        lb0 = lb3 && fb0;
        fd1 = ld1 + ld2;
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
    Thought lo0 = Thought142.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[1][8] -= fd1;
    double ld1 = 888.0082884674922;
    ld1 = ad1 - ad2;
    boolean lb2 = false;
    ab4 = ad3 > ad4;
    boolean lb3 = false;
    Thought lo4 = Thought93.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
    boolean lb5 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought184.getInstance(fd1, ld1, ad1, ad2);
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb3 = lb5 || ab1;
        ab2 = !ab3;
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, lb2);
}
        lb3 = lb5 || ab1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0, lb2, lb3, lb5, ab1);
}
    ab2 = ab3 && ab4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3();
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[2][0] += fd0;
    boolean lb1 = true;
    Thought lo2 = Thought359.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    fd1 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    fd1 = ad1 + ad2;
    lb0 = lb1 && lb2;
    fb0 = !fb1;
    boolean lb3 = true;
    ad3 = ad4 + fd0;
    lb0 = !lb1;
    boolean lb4 = true;
    lb2 = fd1 < ad1;

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
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 < fd0;
    fb1 = lb0 || lb1;
    Thought lo3 = Thought231.getInstance(lb2, ab1, ab2, ab3);
    boolean lb4 = true;
    ab3 = fd1 > fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    double ld5 = 323.4201454245135;
    double ld6 = 948.0293944139356;
    lb1 = ld6 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld5, ld6, fd0, fd1, lb2, lb4, ab1, ab2);
}
    ld5 = ld6 - fd0;
    double ld7 = 935.2739305545342;

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
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    Thought lo1 = Thought5.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
    if (lb0) {
        ab1 = ad4 < fd0;
if(fo0 != null){
          fo0.m2();
}
        double ld2 = 868.7897724844541;
        Output.points[2][1] += fd0;
        fd1 *= -1;
        ab2 = ab3 && ab4;
        ld2 = ad1 - ad2;
        Thought lo3 = Thought110.getInstance(fb0, fb1, lb0, ab1);
        ad3 = ad4 + fd0;
        boolean lb4 = false;
        fd1 *= -1;
        ld2 = ad1 - ad2;
        ab1 = ad3 > ad4;
        fd0 = fd1 - ld2;
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
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought212.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought323.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    double ld3 = 799.1259024042506;
    boolean lb4 = false;
    boolean lb5 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb6 = false;
    lb4 = lb5 || lb6;
    fb0 = fd1 < ld3;
    fb1 = lb1 || lb4;
    Thought lo7 = Thought232.getInstance(lb5, lb6, fb0, fb1);
    lb1 = fd0 > fd1;
    ld3 = fd0 + fd1;
    lb4 = ld3 < fd0;
    double ld8 = 161.63027175095604;
    lb5 = lb6 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld8, fb1, lb1, lb4, lb5);
}
    lb6 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld3, ld8, lb1, lb4, lb5, lb6);
}
    fb0 = fd0 < fd1;
    ld3 = ld8 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb4, lb5);
}
if(fo1 != null){
      lb6 = fo1.m2(fo0, fo1, fo0, fo1);
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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    Thought lo0 = Thought199.getInstance();
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fd1 = fd0 + fd1;
        fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought299.getInstance(fo0, fo1, fo0, fo1);

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
    Output.points[2][2] += ad1;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    double ld0 = 69.49363473640999;
    Thought lo1 = Thought61.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
if(fo0 != null){
      ad2 = fo0.m3();
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fb0 = fd1 < ld0;
    double ld2 = 56.85194354218364;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought284.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ld2 > ad1;
    boolean lb4 = false;

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
    ab1 = ab2 || ab3;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2);
}
    ab4 = ad3 < ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    ab4 = fd1 < ad1;
    ad2 = ad3 - ad4;
    Output.points[2][3] += fd0;
if(fo0 != null){
      fo0.m1();
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
        Output.points[2][4] += fd1;
        ad1 = ad2 - ad3;
        Thought lo1 = Thought10.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
        ad2 = ad3 + ad4;
        boolean lb2 = true;
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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    Thought lo1 = Thought384.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    lb0 = fd1 > fd0;
    fd1 *= -1;
    boolean lb2 = true;
    lb2 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = lb0 && lb2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = !fb1;
    lb0 = lb2 || fb0;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    lb0 = !lb2;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
}
    fb1 = fd1 > fd0;
    lb0 = lb2 || fb0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
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
    Output.points[2][5] += ad2;
    boolean lb0 = false;
    Output.points[2][6] += ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought239.getInstance(ao1, ao2, ao3, ao4);
    Thought lo3 = Thought152.getInstance(fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    if (fb0) {
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo4 = Thought308.getInstance(fb1, lb0, lb1, fb0);
        ad4 = fd0 - fd1;
        boolean lb5 = false;
        fb0 = ad1 < ad2;
        boolean lb6 = true;
        Thought lo7 = Thought40.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, lb5, lb6);
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, lb5, lb6, lb0, lb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 858.0984129735067;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ld0 = fd0 - fd1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    double ld1 = 1000.9816968334466;
    ab2 = ld0 > ld1;
    ab3 = !ab4;
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ld0, ld1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        ab3 = ab4 || fb0;
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
    Output.points[2][7] += ad1;
    Thought lo0 = Thought322.getInstance(ao1, ao2, ao3, ao4);
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    fb1 = ab1 || ab2;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
        boolean lb2 = true;
        fd0 *= -1;
        ab1 = fd1 > ad1;
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
    fb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    double ld1 = 301.3775931228495;
if(fo1 != null){
      fo1.m2(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    boolean lb2 = false;
    fd0 = fd1 + ld1;
    Thought lo3 = Thought136.getInstance(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb0);
        lb2 = fb0 || fb1;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, lb4, fb0);
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 225.86985438137916;
    double ld1 = 340.56018682082646;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < ld1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
    double ld2 = 34.51143196823079;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
        Thought lo3 = Thought104.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo4 = Thought258.getInstance(ld0, ld1, ld2, fd0, fb1, fb0, fb1, fb0);
        Output.points[2][8] -= fd1;
    double ld5 = 679.2957707955582;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo6 = Thought118.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fb0 && fb1;
    Output.points[3][0] -= ld0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, ld5, fd0);
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
