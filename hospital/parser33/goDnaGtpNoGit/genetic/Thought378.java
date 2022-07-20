package genetic;
import java.util.ArrayList;
class Thought378 extends Thought{
private static ArrayList<Thought378> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 884.8988395404879;
private double fd1 = 571.3309135249682;
private Thought fo0 = null;
private Thought fo1 = null;
Thought378 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought378 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought378 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought378 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought378 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought378 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought378 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought378 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought378 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought378 instance = new Thought378 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought378 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought378 instance = new Thought378 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought378 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought378 instance = new Thought378 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought378 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought378 instance = new Thought378 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought378 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought378 instance = new Thought378 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought378 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought378 instance = new Thought378 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought378 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought378 instance = new Thought378 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought378 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought378 instance = new Thought378 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 - fd1;
    Thought lo0 = Thought307.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought222.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb2, fb0);
}
    fd1 = fd0 - fd1;
    Thought lo3 = Thought272.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb2, fb0, fb1);

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
    Thought lo0 = Thought319.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought27.getInstance(fo1, fo0, fo1, fo0);
    if (ab3) {
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        ab3 = ab4 && fb0;
        Output.points[2][3] -= fd1;
        fb1 = lb2 || ab1;
if(fo1 != null){
          ab2 = fo1.m2();
}
        ab3 = fd0 < fd1;
if(fo0 != null){
          fd0 = fo0.m3(ab4, fb0, fb1, lb2);
}
        double ld3 = 631.5314953986061;
        fd0 = fd1 - ld3;
        double ld4 = 327.3136165200275;
        boolean lb5 = false;
        lb5 = ld4 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, ld4, fd0, ab1, ab2, ab3, ab4);
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
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = ad2 > ad3;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = fd0 < fd1;
    lb2 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    lb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    lb1 = !lb2;
if(fo1 != null){
          fo1.m1();
}
    fb0 = ad1 < ad2;
        fb1 = ad3 > ad4;
    lb0 = fd0 > fd1;

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
    Thought lo0 = Thought213.getInstance(ab2, ab3, ab4, fb0);
    ad1 = ad2 - ad3;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ab1 = ad2 > ad3;
    Thought lo1 = Thought235.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    double ld2 = 691.5829036592789;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab4 = !fb0;
    Output.points[2][4] -= fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    double ld0 = 644.0206024178659;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      ao1.m1();
}
    double ld1 = 857.1749698032696;
    ld1 *= -1;
    double ld2 = 854.8652935837536;
    fb1 = ld2 < fd0;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = ld0 > ld1;
    double ld3 = 285.8995293254837;
    Thought lo4 = Thought361.getInstance(ao3, ao4, fo0, fo1, ld2, ld3, fd0, fd1, fb0, fb1, fb0, fb1);
    ld0 = ld1 - ld2;
if(ao2 != null){
      ao1 = ao2.m4(ld3, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Output.points[2][5] -= ld1;
    ld2 = ld3 + fd0;
    fb0 = fd1 < ld0;
    Thought lo5 = Thought383.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld1, ld2, ld3, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ld2);
}
    ld3 = fd0 - fd1;
    Output.points[2][6] += ld0;

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
if(ao1 != null){
      ao1.m3();
}
    boolean lb0 = true;
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    double ld2 = 430.4665497590102;
    fb0 = !fb1;
    lb0 = lb1 && fb0;
    fb1 = ad2 < ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld2);
}
    Output.points[2][7] += ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo3 = Thought150.getInstance(lb0, lb1, fb0, fb1);
    lb0 = lb1 || fb0;
    fd1 *= -1;
    ld2 = ad1 - ad2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;

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
      ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 || fb0;
    if (fb1) {
        boolean lb1 = true;
        } else {
        boolean lb2 = true;
        Output.points[2][8] += fd0;
        lb2 = lb0 && ab1;
if(ao1 != null){
          ao1.m3(fd1, fd0, fd1, fd0);
}
        Output.points[3][0] -= fd1;
        double ld3 = 344.7234724295961;
        ab2 = ld3 < fd0;
        ab3 = ab4 && fb0;
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
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought116.getInstance();
    Output.points[3][1] -= ad2;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought315.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
    ab2 = !ab3;
    ab4 = ad4 < fd0;
    if (fb0) {
        fb1 = fd1 < ad1;
        ab1 = ab2 && ab3;
        Output.points[3][2] += ad2;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
        ab4 = ad1 < ad2;
        double ld2 = 343.88819813670995;
        Output.points[3][3] += ad2;
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
    boolean lb0 = false;
    Output.points[3][4] -= fd1;
    Thought lo1 = Thought172.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    lb0 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought368.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    Thought lo3 = Thought58.getInstance(fo1, fo0, fo1, fo0);
    Thought lo4 = Thought169.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || fb0;
    boolean lb5 = false;

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
    Thought lo0 = Thought364.getInstance();
    double ld1 = 684.3495314302987;
    Thought lo2 = Thought324.getInstance(ab2, ab3, ab4, fb0);
    fd0 *= -1;
    fd1 = ld1 - fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = ld1 + fd0;
        double ld3 = 253.71619595097124;
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld3, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        boolean lb4 = false;
        ab4 = ld3 < ld1;
        double ld5 = 898.1516174380758;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld3, fb0, fb1, lb4, ab1);
}
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
}}
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
    fb1 = ad2 < ad3;
    Output.points[3][5] -= ad4;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    Thought lo1 = Thought167.getInstance(fd1, ad1, ad2, ad3);
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb0;
        ad4 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        Thought lo2 = Thought297.getInstance();
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
    double ld1 = 725.4170818483028;
    Thought lo2 = Thought116.getInstance(lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    Output.points[3][6] += ad4;
    fd0 = fd1 + ld1;
    Output.points[3][7] -= ad1;
    if (ab1) {
        boolean lb3 = false;
        Output.points[3][8] += ad2;
        ab1 = ad3 < ad4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb3, lb0, ab1);
}
        double ld4 = 861.400290457691;
        boolean lb5 = false;
        Thought lo6 = Thought97.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
        ab1 = ld4 < ld1;
        ab2 = ab3 && ab4;
        fb0 = fb1 || lb3;
        Output.points[4][0] += ad1;
        ad2 *= -1;
        lb5 = ad3 < ad4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld1);
}
        ad1 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought26.getInstance();
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    lb1 = !fb0;
if(ao1 != null){
      fd1 = ao1.m3(fb1, lb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
    double ld2 = 545.9901724493676;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    lb1 = fb0 && fb1;
        lb1 = fb0 || fb1;
    lb1 = fd1 > ld2;
    Thought lo3 = Thought118.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld4 = 28.793888532590984;
    Output.points[4][1] -= ld4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, ld4);
}
    fd0 = fd1 - ld2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 641.6284027063506;
    ld0 = ad1 - ad2;
    fb1 = !fb0;
    Thought lo1 = Thought137.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 = ad1 + ad2;
    Thought lo2 = Thought319.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ad3 *= -1;
    double ld3 = 716.6462946981093;
    ad3 = ad4 + fd0;

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
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    fd0 = fd1 - fd0;
            fd1 = fd0 + fd1;
    Output.points[4][2] += fd0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][3] += ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ab2 = !ab3;
    ad1 *= -1;
    Thought lo0 = Thought69.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    ab4 = fb0 && fb1;
    fd1 = ad1 - ad2;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ab2 = ad1 > ad2;
    ab3 = ab4 && fb0;
    Thought lo1 = Thought16.getInstance();
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, ab1, ab2);
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
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        } else if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        fb1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb0 = true;
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
        fb0 = fd0 > fd1;
        fb1 = fd0 > fd1;
        double ld1 = 491.0644476392819;
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[4][4] += fd1;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[4][5] += fd1;
    double ld0 = 625.659418845304;
    Thought lo1 = Thought53.getInstance(fo1, fo0, fo1, fo0);
    ab1 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab2 = fd0 > fd1;
    Thought lo2 = Thought50.getInstance();
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb3 && ab1;
    ld0 *= -1;
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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 564.9713398931584;
    boolean lb1 = false;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought27.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
    boolean lb3 = true;
    ld0 *= -1;
    ad1 = ad2 + ad3;
    boolean lb4 = false;
    ad4 *= -1;
    boolean lb5 = true;
    lb1 = !lb3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    Thought lo6 = Thought386.getInstance();
    Thought lo7 = Thought343.getInstance(lb4, lb5, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, lb3, lb4, lb5);
}
    fd1 = ld0 - ad1;

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
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ab4 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb0 = true;
    ab4 = !fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 930.9162812205109;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    ld0 *= -1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(lb1, fb0, fb1, lb1);
}
    Output.points[4][6] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    if (lb1) {
if(ao3 != null){
          ao2 = ao3.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
        Thought lo2 = Thought182.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
        } else if (lb1) {
        fb0 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ld0, fd0, fd1, ld0);
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
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    Output.points[4][7] += ad2;
    ad3 = ad4 - fd0;
    fb1 = fd1 > ad1;
if(ao1 != null){
      ao1.m1();
}
    fb0 = fb1 || fb0;
    ad2 *= -1;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    double ld1 = 756.8091429294158;

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
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ab4 = ao4.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[4][8] -= fd0;
    boolean lb0 = true;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought52.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought96.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    double ld3 = 207.67687111644378;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld3;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld3, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ld3 = fd0 + fd1;
    ab4 = ld3 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = ld3 + fd0;
if(fo1 != null){
      ab2 = fo1.m2(fd1, ld3, fd0, fd1);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    Output.points[5][0] -= fd0;
    fd1 = ad1 + ad2;
    ab1 = ad3 < ad4;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought324.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
    ad3 *= -1;
    ad4 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo2 = Thought308.getInstance(lb0, ab1, ab2, ab3);
    ad1 = ad2 - ad3;
    ab4 = ad4 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ab3 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought144.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[5][1] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    Thought lo1 = Thought362.getInstance(fd1, fd0, fd1, fd0);
        fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought199.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, fb0, fb1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought117.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fb1 = fd1 < fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[5][2] -= fd1;
    ab3 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab4 = fb0 || fb1;
    fd1 *= -1;
    Output.points[5][3] += fd0;
    Thought lo1 = Thought332.getInstance(fd1, fd0, fd1, fd0);
    ab1 = ab2 && ab3;
    Thought lo2 = Thought98.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Output.points[5][4] += fd1;
if(fo0 != null){
      fo0.m3();
}
    fd0 = fd1 + fd0;
    double ld3 = 204.93572784808154;
    Output.points[5][5] -= fd0;

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
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought13.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
        boolean lb1 = true;
        fb0 = fb1 && lb1;
        fb0 = fd0 > fd1;
        Output.points[5][6] -= ad1;
        ad2 = ad3 - ad4;
if(fo0 != null){
          fo0.m1(fd0, fd1, ad1, ad2, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        ad3 = ad4 + fd0;
        fd1 = ad1 - ad2;
        fb1 = lb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        if (fb1) {
if(fo0 != null){
              fo0.m3();
}
if(fo1 != null){
              fd0 = fo1.m3(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought344.getInstance(fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo0.m3();
}
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo1.m2(fb1, ab1, ab2, ab3);
}
    ad3 *= -1;
    double ld1 = 139.2483952893463;
    double ld2 = 547.3363881397423;
    double ld3 = 386.1454779059322;
    boolean lb4 = true;
    ad1 *= -1;
    ab3 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld1, ld2, ld3, ad1, ab4, fb0, fb1, lb4);
}
    Thought lo5 = Thought371.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb4, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ld2 > ld3;

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
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[5][7] -= fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      lb0 = ao4.m2(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought259.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fb1 = !lb0;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;

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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3();
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
    ad1 *= -1;
    double ld0 = 16.581530537084724;
    Thought lo1 = Thought183.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 = fd1 + ld0;
if(ao3 != null){
      ao3.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, fb0);
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
    ab1 = !ab2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought121.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[5][8] -= fd0;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;

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
    ab1 = ad2 > ad3;
    Thought lo0 = Thought76.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3();
}
    fd1 *= -1;
    double ld1 = 521.3607672833493;
    boolean lb2 = true;
    boolean lb3 = false;
    ld1 = ad1 - ad2;
    lb3 = !ab1;
    ad3 *= -1;
    boolean lb4 = true;
if(ao1 != null){
      ad4 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, lb2, lb3);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb4, ab1, ab2, ab3);
}
    fd1 = ld1 - ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 = ld1 + ad1;
    Output.points[6][0] -= ad2;
    ab4 = ad3 < ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, lb3);
}
    fd0 = fd1 + ld1;

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
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought63.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    Thought lo2 = Thought63.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Thought lo3 = Thought94.getInstance();
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    lb1 = fd1 > fd0;
    boolean lb4 = true;
    lb4 = fb0 && fb1;
    fd1 = fd0 + fd1;
    lb1 = fd0 > fd1;
if(fo0 != null){
      lb4 = fo0.m2(fb0, fb1, lb1, lb4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb4);
}
    fb0 = fd0 > fd1;

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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
    lb0 = !lb1;

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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[6][1] += fd0;
    boolean lb1 = true;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    lb0 = fd0 > fd1;
    lb1 = fd0 > fd1;
    fb0 = fb1 || lb0;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    lb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = !lb0;

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
