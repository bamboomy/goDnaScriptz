package genetic;
import java.util.ArrayList;
class Thought296 extends Thought{
private static ArrayList<Thought296> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 685.2215261295935;
private double fd1 = 897.2682872040863;
private Thought fo0 = null;
private Thought fo1 = null;
Thought296 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought296 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought296 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought296 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought296 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought296 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought296 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought296 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought296 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought296 instance = new Thought296 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought296 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought296 instance = new Thought296 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought296 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought296 instance = new Thought296 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought296 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought296 instance = new Thought296 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought296 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought296 instance = new Thought296 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought296 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought296 instance = new Thought296 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought296 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought296 instance = new Thought296 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought296 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought296 instance = new Thought296 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 735.269969029263;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    fd0 *= -1;
    boolean lb0 = false;
    double ld1 = 148.96060882836062;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1);
}
    Output.points[6][3] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought326.getInstance();
    boolean lb3 = false;
    Thought lo4 = Thought279.getInstance(lb3, ab1, ab2, ab3);
    fd0 = fd1 - ld1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb3);
}
    boolean lb5 = true;
    boolean lb6 = false;
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1, lb5, lb6, ab1, ab2);
}
    Thought lo7 = Thought299.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    lb3 = ld1 > fd0;
    for(int i0=0; i0<10; i0++){
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
      fo1.m3();
}
    double ld0 = 764.5841762451214;
    fb0 = fb1 && fb0;
    boolean lb1 = true;
    ld0 = ad1 - ad2;
    double ld2 = 184.4075070972501;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
        Thought lo3 = Thought393.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
    lb1 = fb0 || fb1;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld2, ad1, ad2, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
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
    ab1 = ad1 > ad2;
    ad3 = ad4 - fd0;
    double ld0 = 458.1675975495608;
    fd0 = fd1 - ld0;
    double ld1 = 352.6065111145968;
    double ld2 = 506.2381330991574;
    boolean lb3 = true;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab2 = ld1 > ld2;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Thought lo4 = Thought122.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
    if (ab3) {
if(fo1 != null){
          ab4 = fo1.m2();
}
if(fo0 != null){
          fo0.m1(fb0, fb1, lb3, ab1);
}
        ld2 = ad1 - ad2;
        Output.points[6][4] -= ad3;
        Thought lo5 = Thought307.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo1 = fo0.m4(ld1, ld2, ad1, ad2, fb1, lb3, ab1, ab2);
}
        ab3 = ad3 < ad4;
        double ld6 = 724.6379668781386;
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
    fb0 = fb1 && fb0;
    double ld0 = 544.7268177644402;
    fd0 = fd1 - ld0;
    fb1 = fd0 < fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = ld0 < fd0;
        fd1 *= -1;
    double ld1 = 259.36207394707833;
    Thought lo2 = Thought337.getInstance(ld0, ld1, fd0, fd1);
    boolean lb3 = true;
    ld0 = ld1 - fd0;
    lb3 = fb0 && fb1;
    lb3 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0);
}
    lb3 = fb0 || fb1;
    lb3 = fd1 > ld0;
    double ld4 = 125.11048729581648;
    Output.points[6][5] -= ld1;
    fb0 = !fb1;
if(ao1 != null){
      ld4 = ao1.m3();
}
    boolean lb5 = true;
    lb3 = fd0 < fd1;

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
        fb1 = ad1 < ad2;
    Thought lo0 = Thought264.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    double ld1 = 811.1211562209954;
    Thought lo2 = Thought312.getInstance(ao3, ao4, fo0, fo1);
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ad4 = ao1.m3(fd0, fd1, ld1, ad1);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fb0 = !fb1;
if(ao1 != null){
          fb0 = ao1.m2();
}
        fd1 = ld1 + ad1;
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
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = ab1 && ab2;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 *= -1;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3);
}
    double ld0 = 116.73783624109844;
if(ao4 != null){
      fb0 = ao4.m2(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
if(ao4 != null){
      fb1 = ao4.m2();
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    Output.points[6][6] -= fd1;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ab1 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Output.points[6][7] += ad2;
    fb1 = ab1 && ab2;
    boolean lb0 = false;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    double ld1 = 348.8857129543767;

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
    double ld0 = 155.9721156171843;
    Output.points[6][8] -= fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = ld0 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fd1 > ld0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
        boolean lb1 = true;
        if (fb0) {
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
            if (fb1) {
if(fo1 != null){
                  fo0 = fo1.m4();
}
if(fo0 != null){
                  fo0.m2(lb1, fb0, fb1, lb1);
}
                fd0 = fd1 - ld0;
                fb0 = fb1 || lb1;
                boolean lb2 = true;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb2);
}
                boolean lb3 = true;
                lb3 = fd1 < ld0;
}}}
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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought379.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought339.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab4 = !fb0;
    fb1 = !ab1;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    if (ab1) {
        boolean lb3 = false;
        fd1 = fd0 + fd1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Thought lo4 = Thought313.getInstance();
        boolean lb5 = false;
if(fo0 != null){
          fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
        Thought lo6 = Thought174.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb3, lb5);
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
          lb5 = fo1.m2(fo0, fo1, fo0, fo1);
}
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
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fd0 < fd1;
        ad1 = ad2 - ad3;
    boolean lb1 = true;
    Thought lo2 = Thought173.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, lb1, fb0);
}
    fb1 = fd1 > ad1;
    double ld3 = 239.5261787919362;
    boolean lb4 = false;

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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Output.points[7][0] += ad4;
    ab3 = !ab4;
            fd0 = fd1 + ad1;
    Output.points[7][1] -= ad2;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;
    ad3 = ad4 + fd0;
    Output.points[7][2] += fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || ab1;
    Thought lo0 = Thought21.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    double ld1 = 686.1543562294968;
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
        Thought lo4 = Thought19.getInstance(fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb3);
        for(int i1=0; i1<10; i1++){
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought59.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought337.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld2 = 362.7277250351107;
    Thought lo3 = Thought170.getInstance(ld2, fd0, fd1, ld2);
    fd0 = fd1 - ld2;
    fb0 = !fb1;
    double ld4 = 814.6963391622652;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld4, fd0, fd1, ld2);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = ld4 > fd0;
    double ld5 = 868.2957571345298;
    Thought lo6 = Thought107.getInstance();

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
    fb0 = fb1 && fb0;
    double ld0 = 557.8559887311923;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb1 = true;
    double ld2 = 238.18851282813594;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld2, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    ad1 *= -1;
    fb1 = lb1 || fb0;
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
    Thought lo3 = Thought361.getInstance(ld0, ld2, ad1, ad2, lb1, fb0, fb1, lb1);

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
    fd0 *= -1;
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    ab4 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || ab1;
    Thought lo0 = Thought67.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    Thought lo2 = Thought362.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fb1 = lb1 || ab1;
        boolean lb3 = false;
    fd0 = fd1 + fd0;

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
    ab2 = !ab3;
if(ao1 != null){
      ab4 = ao1.m2();
}
    Output.points[7][3] -= ad2;
    Output.points[7][4] += ad3;
    boolean lb0 = false;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
    if (lb0) {
        Thought lo2 = Thought80.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
        ab4 = ad3 < ad4;
        boolean lb3 = true;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
        fd1 *= -1;
        Output.points[7][5] -= ad1;
        boolean lb4 = true;
        ab3 = ab4 && fb0;
        fb1 = lb3 || lb4;
        ad2 = ad3 + ad4;
if(ao3 != null){
          ao3.m1(fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
        lb0 = ad4 < fd0;
        double ld5 = 48.92224230448216;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[7][6] -= fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought319.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 + fd1;
        fb1 = lb0 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;

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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought70.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    double ld1 = 193.69419488395812;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    fd1 = ld1 + fd0;
if(fo0 != null){
      ab3 = fo0.m2(fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ab1 && ab2;
    ab3 = ld1 > fd0;
    ab4 = fd1 < ld1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fb0 = fd0 > fd1;
    ld1 *= -1;
    fb1 = ab1 || ab2;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    Thought lo0 = Thought142.getInstance();
    fb0 = !fb1;
    ad1 *= -1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought362.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    fb1 = fb0 || fb1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab2 = ab3 && ab4;
    double ld0 = 733.5190411939449;
    boolean lb1 = true;
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(lb1, ab1, ab2, ab3);
}
    double ld2 = 386.1521551650101;
    boolean lb3 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    Thought lo4 = Thought58.getInstance(ld0, ld2, ad1, ad2, lb1, lb3, ab1, ab2);
    ab3 = !ab4;
    fb0 = fb1 || lb1;
    ad3 *= -1;
    lb3 = ad4 > fd0;
    ab1 = ab2 || ab3;
    Thought lo5 = Thought385.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
    Output.points[7][7] -= fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought134.getInstance(ld0, ld2, ad1, ad2);

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
    Thought lo0 = Thought140.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fb1 = fd1 > fd0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    fd1 *= -1;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(lb1, lb2, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    lb1 = fd1 > fd0;
    lb2 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    boolean lb3 = true;
    lb3 = fb0 || fb1;

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    ad2 *= -1;
        fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Output.points[7][8] -= ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m1();
}
    boolean lb0 = false;

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
          ao2.m3(ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    if (ab1) {
        ab2 = !ab3;
        fd0 = fd1 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
        ab2 = fd1 > fd0;
        fd1 = fd0 + fd1;
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
    Thought lo0 = Thought196.getInstance(ao1, ao2, ao3, ao4);
    ab1 = ab2 && ab3;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab4 = fd1 > ad1;
    ad2 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought296.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
    ad1 *= -1;
    boolean lb2 = false;
    ab1 = ad2 < ad3;
    boolean lb3 = false;
    ab1 = ab2 || ab3;
    Thought lo4 = Thought352.getInstance(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb2);
    ad2 = ad3 + ad4;
    lb3 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought296.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        if (fb1) {
            boolean lb1 = true;
            lb1 = fd0 > fd1;
            fb0 = fd0 > fd1;
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
              fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
              lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
            Thought lo2 = Thought244.getInstance(fd1, fd0, fd1, fd0);
            fb0 = fb1 || lb1;
            Output.points[8][0] += fd1;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 450.9375444239175;
if(fo1 != null){
      ld0 = fo1.m3();
}
    fd0 = fd1 + ld0;
    ab2 = !ab3;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    double ld1 = 203.62927925522266;
    ld1 *= -1;
    Thought lo2 = Thought113.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);

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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    fb0 = fd1 > ad1;
    Thought lo0 = Thought111.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought50.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2);
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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = fd1 < ad1;
    Output.points[8][1] -= ad2;
    ad3 *= -1;
    if (ab3) {
        ab4 = fb0 && fb1;
        ab1 = ab2 || ab3;
        Output.points[8][2] -= ad4;
        Thought lo0 = Thought226.getInstance(ab4, fb0, fb1, ab1);
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        boolean lb1 = false;
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Thought lo0 = Thought327.getInstance(fd1, fd0, fd1, fd0);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = fd1 > fd0;

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
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 = ad3 + ad4;
        fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 676.5255646444881;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought76.getInstance(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 565.2166334093098;
    boolean lb1 = true;
    double ld2 = 173.92588439447096;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld2, fd0, fd1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld0, ld2, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ld0 = ld2 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ld2, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = ld0 + ld2;
if(ao1 != null){
      ao1.m1(fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought0.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb1, ab1);
    fd0 = fd1 + ld0;
    ld2 *= -1;
    double ld4 = 473.0178548461286;
    ab2 = ab3 && ab4;
    double ld5 = 918.4069952707766;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    double ld6 = 999.1727166772627;
    ld4 = ld5 - ld6;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld4, ld5, ld6, fd0);
}
    fd1 = ld0 + ld2;
    fb0 = ld4 < ld5;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3();
}
    ab1 = ab2 && ab3;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought20.getInstance(ab4, fb0, fb1, ab1);
    ab2 = fd0 > fd1;
    boolean lb1 = true;
    Thought lo2 = Thought164.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fd0 = fd1 - ad1;
    Thought lo3 = Thought396.getInstance(ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
    fd1 = ad1 + ad2;
    Thought lo4 = Thought251.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    lb1 = ab1 && ab2;

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
    double ld0 = 316.92273393816424;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 + fd1;
    Output.points[8][3] += ld0;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    boolean lb1 = true;
    Output.points[8][4] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    Output.points[8][5] += fd0;
    boolean lb2 = false;
    fd1 = ld0 - fd0;
    Output.points[8][6] -= fd1;
    ld0 = fd0 - fd1;
    lb1 = ld0 < fd0;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(lb2, fb0, fb1, lb1);
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
    boolean lb0 = true;
    Output.points[8][7] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought63.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    boolean lb2 = false;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb3 = true;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    lb0 = fd0 < fd1;
    Thought lo2 = Thought48.getInstance();
    lb1 = fb0 && fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(lb1, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    Output.points[8][8] -= fd1;
    lb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
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
