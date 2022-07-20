package genetic;
import java.util.ArrayList;
class Thought37 extends Thought{
private static ArrayList<Thought37> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 53.14834983324749;
private double fd1 = 925.1759824390198;
private Thought fo0 = null;
private Thought fo1 = null;
Thought37 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought37 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought37 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought37 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought37 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[0][7] -= fd1;
if(fo0 != null){
      fo0.m1();
}
    Output.points[0][8] += fd0;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    Output.points[1][0] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought256.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought237.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    Output.points[1][1] += fd0;
    Thought lo2 = Thought35.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 < fd0;
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
    double ld0 = 550.0987029181553;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        boolean lb1 = false;
        lb1 = fd1 < ld0;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Output.points[1][2] -= fd1;
if(fo0 != null){
          fb1 = fo0.m2(ld0, fd0, fd1, ld0);
}
        fd0 *= -1;
        fd1 = ld0 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    lb0 = ad2 > ad3;
    lb1 = !fb0;
    ad4 *= -1;
    boolean lb2 = true;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    lb2 = fb0 || fb1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, lb1, lb2, fb0);
}
    fb1 = lb0 || lb1;
    fd0 = fd1 + ad1;
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    double ld3 = 836.6836972100858;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
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
    ab2 = ad2 > ad3;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    boolean lb1 = true;
    ab1 = ab2 && ab3;
    ab4 = ad3 < ad4;
    fb0 = fd0 > fd1;
    boolean lb2 = true;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    boolean lb3 = false;
    Thought lo4 = Thought90.getInstance();
    lb1 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(lb2, lb3, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Output.points[1][3] -= fd1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, lb1, lb2);
}
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb3, lb5, ab1, ab2);
}
    ad1 = ad2 + ad3;
    ab3 = ad4 < fd0;
    ab4 = fb0 || fb1;
    boolean lb6 = false;
    fd1 = ad1 - ad2;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        fb1 = !lb0;
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
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
    fb0 = ad3 < ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    double ld2 = 400.64043802608916;
    fb0 = ld2 > ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, lb1, fb0);
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
    fd0 *= -1;
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought332.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao1 != null){
      fd0 = ao1.m3(fb1, ab1, ab2, ab3);
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
    ab2 = ab3 && ab4;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought246.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    fb1 = ad3 > ad4;
    ab1 = !ab2;
    fd0 = fd1 + ad1;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought332.getInstance(ao2, ao3, ao4, fo0);
        double ld2 = 375.0743098328773;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, ad1);
}
    Output.points[1][4] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ab1 = ld2 < ad1;
        double ld3 = 927.0499178155313;
    double ld4 = 460.4820030852736;
if(ao2 != null){
      ab2 = ao2.m2();
}
    ab3 = !ab4;

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
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
    Thought lo1 = Thought344.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;

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
    fd0 *= -1;
    boolean lb0 = false;
    double ld1 = 236.74933539603697;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    boolean lb2 = true;
    lb2 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    lb2 = !ab1;
    ab2 = ab3 && ab4;
    boolean lb3 = true;
    fd1 *= -1;
    boolean lb4 = false;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    double ld5 = 422.89715231178604;
if(fo0 != null){
      fo1 = fo0.m4(ld5, fd0, fd1, ld1, lb2, lb3, lb4, ab1);
}
    ld5 *= -1;
        ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[1][5] -= ad2;
    fb1 = !fb0;
    double ld0 = 305.561549162826;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    fb0 = !fb1;
    fb0 = ad4 > fd0;
    Output.points[1][6] -= fd1;
if(fo1 != null){
      fo1.m2();
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
if(fo0 != null){
      ad1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    Output.points[1][7] -= ad2;
    fb0 = ad3 < ad4;
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 191.19139965961142;
    ad4 = fd0 + fd1;
    ld2 = ad1 - ad2;
    Thought lo3 = Thought221.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(ld2, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
    Output.points[1][8] += fd0;
    ab2 = ab3 && ab4;
    fd1 = ld2 + ad1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
        fd0 = fd1 + fd0;
    double ld0 = 1000.9099450838305;
    Thought lo1 = Thought333.getInstance(ao2, ao3, ao4, fo0);
    boolean lb2 = false;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    lb2 = !fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb2 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb2, fb0);
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
    boolean lb0 = true;
        double ld1 = 17.567474320416675;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + ld1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
    Thought lo2 = Thought25.getInstance();
    Thought lo3 = Thought180.getInstance(lb0, fb0, fb1, lb0);
    ad1 *= -1;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    boolean lb4 = false;
    lb4 = ad2 > ad3;

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
    ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
    double ld0 = 303.75719967711865;
    Output.points[2][0] += ld0;
    Thought lo1 = Thought291.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ld0 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[2][1] -= fd1;
    ld0 = fd0 - fd1;
    ab1 = ld0 > fd0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, fd0, fd1);
}
        boolean lb2 = false;
        ab1 = !ab2;
        ld0 = fd0 - fd1;
        ld0 = fd0 + fd1;
        Thought lo3 = Thought344.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
        ab3 = fd0 < fd1;
        ld0 *= -1;
        Thought lo4 = Thought174.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(ab4, fb0, fb1, lb2);
}
        double ld5 = 742.8294656793861;
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld5, ab2, ab3, ab4, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought382.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 + ad3;
    ab3 = ad4 < fd0;
    if (ab4) {
if(ao1 != null){
          fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
        fb1 = ad2 < ad3;
        boolean lb2 = false;
        lb2 = ad4 < fd0;
        lb1 = !ab1;
if(ao1 != null){
          fd1 = ao1.m3();
}
if(ao2 != null){
          ao2.m2(ab2, ab3, ab4, fb0);
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = !fb0;
    fd0 = fd1 - fd0;
    fb1 = lb0 || fb0;
    fb1 = fd1 < fd0;
    double ld1 = 407.35510261274186;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = !fb1;
    lb0 = !fb0;
    fd1 *= -1;
    fb1 = ld1 > fd0;
    double ld2 = 693.3274291234264;
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, ld1, ld2, fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 505.7958586963792;
    Thought lo1 = Thought271.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    double ld2 = 165.5345772355697;
    fb0 = ld2 > fd0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    Thought lo3 = Thought285.getInstance(ld0, ld2, fd0, fd1);
    ld0 = ld2 - fd0;
    double ld4 = 242.96184579293998;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought292.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    lb1 = ad2 < ad3;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb2, fb0, fb1, lb1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb1);
}
    lb2 = ad4 > fd0;
    if (fb0) {
        double ld3 = 186.4116182238946;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld3, ad1, ad2);
}
        double ld4 = 950.861697180409;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
        fd1 = ld3 - ld4;
if(fo1 != null){
          fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
        } else {
        ad3 = ad4 + fd0;
        lb1 = fd1 > ad1;
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
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    Thought lo0 = Thought311.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    lb1 = !ab1;
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, ab1, ab2, ab3);
}
    double ld2 = 83.54249561785478;
    double ld3 = 771.1511629431054;
    ld3 *= -1;
    ab4 = fb0 && fb1;
    lb1 = ab1 && ab2;

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
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld0 = 666.6215339908042;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao3.m3();
}
    Thought lo2 = Thought332.getInstance(fb1, lb1, fb0, fb1);
    ld0 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
        Output.points[2][2] += ld0;
        fd0 *= -1;
        fd1 = ld0 + fd0;
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
    boolean lb0 = true;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought326.getInstance(ao1, ao2, ao3, ao4);
    double ld2 = 740.9420733427213;
    ld2 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
    boolean lb4 = true;
    if (lb3) {
        lb4 = !fb0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1);
}
        ad2 = ad3 + ad4;
if(fo1 != null){
          fd0 = fo1.m3();
}
if(ao1 != null){
          fb1 = ao1.m2(lb0, lb3, lb4, fb0);
}
        fd1 = ld2 - ad1;
        ad2 = ad3 - ad4;
        Thought lo5 = Thought123.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1, fb1, lb0, lb3, lb4);
        fb0 = fb1 || lb0;
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought345.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Output.points[2][3] += fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    fd1 *= -1;
    ab3 = ab4 && fb0;
    fb1 = !lb1;
if(ao2 != null){
      ab1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb2 = false;

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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 || fb0;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
        ab4 = ad4 < fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m1(fd1, ad1, ad2, ad3);
}
        fb0 = ad4 < fd0;
        fb1 = ab1 && ab2;
        if (ab3) {
if(ao2 != null){
              ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
            boolean lb0 = true;
if(ao1 != null){
              ad4 = ao1.m3();
}
            boolean lb1 = true;
if(ao2 != null){
              fd0 = ao2.m3(ab3, ab4, fb0, fb1);
}
            fd1 = ad1 + ad2;
}}
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    double ld0 = 652.55758180138;
    fd0 *= -1;
        fb1 = fd1 > ld0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
    Output.points[2][4] -= fd0;
    Thought lo1 = Thought183.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;

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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought147.getInstance();
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    ab4 = fb0 && fb1;
    lb1 = fd1 < fd0;
    Output.points[2][5] -= fd1;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    lb1 = !ab1;
        ab2 = ab3 && ab4;
    fd0 *= -1;
    Thought lo2 = Thought181.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
    double ld3 = 985.9001278237151;
    fd0 = fd1 + ld3;
    boolean lb4 = false;
    ab1 = fd0 > fd1;
    double ld5 = 402.0057655776206;
    ld3 = ld5 + fd0;
    ab2 = fd1 > ld3;
if(fo0 != null){
      fo0.m1(ld5, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
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
    Thought lo0 = Thought369.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[2][6] += ad2;
    double ld1 = 4.27880701949794;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought352.getInstance(fo0, fo1, fo0, fo1);
    fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
    if (fb0) {
        } else {
        Thought lo3 = Thought212.getInstance(fd0, fd1, ld1, ad1);
        fb1 = ad2 < ad3;
        fb0 = ad4 > fd0;
        fb1 = fd1 < ld1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[2][7] -= ld1;
if(fo0 != null){
          fo0.m1(fb1, fb0, fb1, fb0);
}
        ad1 = ad2 + ad3;
        boolean lb4 = true;
        boolean lb5 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, lb5, fb0, fb1, lb4);
}
        Thought lo6 = Thought178.getInstance(ad1, ad2, ad3, ad4, lb5, fb0, fb1, lb4);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb4);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    if (ab1) {
if(fo1 != null){
          ad4 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fb1 = fd0 < fd1;
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
if(fo0 != null){
          fo0.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        fb1 = !ab1;
        if (ab2) {
            ab3 = fd0 < fd1;
            ad1 = ad2 + ad3;
            boolean lb0 = true;
if(fo0 != null){
              fo1 = fo0.m4();
}
if(fo1 != null){
              fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
              ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
            ad3 *= -1;
            Thought lo1 = Thought277.getInstance(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
if(fo1 != null){
              ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
            fb0 = fb1 || lb0;
            ab1 = ad3 > ad4;
}}
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
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd0 = fd1 - fd0;
if(ao4 != null){
          fd1 = ao4.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        double ld0 = 664.5080136239214;
        fb1 = ld0 < fd0;
        fb0 = fd1 < ld0;
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = ld0 - fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        }
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    lb1 = fd0 > fd1;
    boolean lb2 = false;
    boolean lb3 = false;

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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb1 = !fb0;
    fb1 = ad2 < ad3;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      ad2 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
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
    Thought lo0 = Thought58.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    ab1 = fd1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
    boolean lb2 = false;
    double ld3 = 92.85207673488681;
    boolean lb4 = false;
    double ld5 = 647.6312291272019;
if(ao1 != null){
      fo1 = ao1.m4(ld5, fd0, fd1, ld3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld5, fd0, fd1, ld3);
}
    double ld6 = 272.8643613108787;
    if (lb2) {
        lb4 = ld5 > ld6;
if(ao3 != null){
          ao2 = ao3.m4();
}
        } else if (ab1) {
        boolean lb7 = true;
if(ao4 != null){
          ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld3, ld5, fb1, lb7, lb1, lb2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought339.getInstance(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
    ab4 = fd0 > fd1;
    Thought lo1 = Thought397.getInstance(ao2, ao3, ao4, fo0);
    ad1 *= -1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
        ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    boolean lb2 = false;
        if (fb0) {
        fb1 = lb2 || ab1;
        fd1 *= -1;
        Output.points[2][8] += ad1;
        ab2 = ad2 > ad3;
        ad4 *= -1;
        fd0 = fd1 + ad1;
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
    double ld0 = 325.7735640417443;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > fd0;
    fd1 = ld0 - fd0;
    boolean lb1 = true;
    Output.points[3][0] -= fd1;
    fb0 = !fb1;
    Output.points[3][1] -= ld0;

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
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
    fb1 = !lb0;
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
    lb1 = lb2 || lb3;
    Thought lo4 = Thought104.getInstance(fo1, fo0, fo1, fo0);
    double ld5 = 7.590302221476952;
    fd0 = fd1 - ld5;
    fb0 = fd0 < fd1;
    ld5 *= -1;
    fb1 = lb0 || lb1;
    fd0 *= -1;
    lb2 = lb3 && fb0;

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
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought254.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld1 = 353.4535998943272;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[3][2] += fd0;
    Thought lo2 = Thought366.getInstance(fd1, ld1, fd0, fd1);
    ld1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = ld1 > fd0;
    Thought lo3 = Thought202.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
if(fo1 != null){
      ld1 = fo1.m3();
}
    boolean lb4 = true;

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
