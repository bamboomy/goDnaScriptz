package genetic;
import java.util.ArrayList;
class Thought213 extends Thought{
private static ArrayList<Thought213> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 44.47132464523247;
private double fd1 = 971.1899354818075;
private Thought fo0 = null;
private Thought fo1 = null;
Thought213 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought213 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought213 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought213 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought213 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought213 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought213 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought213 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought213 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought213 instance = new Thought213 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought213 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought213 instance = new Thought213 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought213 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought213 instance = new Thought213 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought213 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought213 instance = new Thought213 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought213 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought213 instance = new Thought213 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought213 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought213 instance = new Thought213 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought213 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought213 instance = new Thought213 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought213 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought213 instance = new Thought213 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Output.points[4][6] -= fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        fd1 *= -1;
        fd0 = fd1 - fd0;
        double ld0 = 482.5073032978537;
        double ld1 = 151.94990246502977;
        fb1 = ld1 < fd0;
        fd1 = ld0 + ld1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fb0 = fd1 > ld0;
        Thought lo2 = Thought340.getInstance(fo1, fo0, fo1, fo0);
        ld1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld1, fd0, fd1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    double ld0 = 897.8987973491841;
    Output.points[4][7] -= ld0;
    ab4 = fb0 || fb1;
    Thought lo1 = Thought244.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
if(fo1 != null){
      fo1.m3();
}
    ab1 = fd1 < ld0;
    double ld2 = 859.1880461798758;
    double ld3 = 435.7591242725757;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        lb0 = ad2 < ad3;
        boolean lb1 = false;
        boolean lb2 = true;
        Output.points[4][8] += ad4;
        lb2 = fd0 < fd1;
        boolean lb3 = false;
if(fo1 != null){
          fo1.m3();
}
        boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(lb3, lb4, lb0, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, lb2, lb3, lb4);
}
        Output.points[5][0] += fd0;
        lb0 = fd1 < ad1;
        fb0 = ad2 < ad3;
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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3);
}
    ab1 = ad4 < fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    Output.points[5][1] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ad1 = ad2 - ad3;
    lb0 = lb1 && ab1;
    Thought lo2 = Thought247.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    boolean lb3 = false;
    fb0 = !fb1;
    Thought lo4 = Thought395.getInstance(ad2, ad3, ad4, fd0, lb0, lb1, lb3, ab1);
    Thought lo5 = Thought164.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
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
    Thought lo0 = Thought83.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd0 *= -1;
        fb0 = fd1 < fd0;
        fb1 = !fb0;
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fd0 = fd1 + fd0;
        Output.points[5][2] += fd1;
        fd0 = fd1 - fd0;
        boolean lb1 = false;
        lb1 = fb0 && fb1;
        lb1 = fb0 && fb1;
        lb1 = fb0 || fb1;
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
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = ad1 + ad2;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    Output.points[5][3] -= ad3;
    fb1 = ad4 > fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    ad1 = ad2 + ad3;

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
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
        boolean lb0 = false;
    ab4 = fd1 < fd0;
    fd1 *= -1;
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        Output.points[5][4] -= fd0;
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
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
    fb1 = lb0 && ab1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb0 = ab1 && ab2;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    ab3 = ab4 || fb0;
    fb1 = lb0 && ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
    double ld1 = 259.6135543273888;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ld1 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ab2 = ao4.m2();
}
        ad3 *= -1;
        ab3 = !ab4;
        fb0 = ad4 > fd0;
        fb1 = lb0 && ab1;
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
    Output.points[5][5] -= fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    Output.points[5][6] += fd1;
    Output.points[5][7] += fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
        boolean lb1 = true;

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
    Thought lo0 = Thought0.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought384.getInstance(fo0, fo1, fo0, fo1);
    Output.points[5][8] += fd1;
        boolean lb2 = false;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        ab2 = fd0 < fd1;
if(fo0 != null){
          ab3 = fo0.m2(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
              fo1.m1();
}
            boolean lb4 = true;
if(fo1 != null){
              fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb4, lb2, lb3, ab1);
}
if(fo0 != null){
              fo0.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
            if (fb1) {
                fd1 = fd0 - fd1;
                boolean lb5 = false;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, lb4, lb2, lb3);
}
                double ld6 = 623.9635537714297;
                ld6 = fd0 - fd1;
                ld6 *= -1;
                double ld7 = 388.1750347781254;
                double ld8 = 175.93193554309929;
                ld7 *= -1;
                ld8 = fd0 - fd1;
}}}
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
    fb1 = ad1 > ad2;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    Output.points[6][0] += fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    lb0 = ad1 < ad2;
    lb1 = !lb2;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 684.5090334697613;
    if (ab1) {
        boolean lb1 = false;
        boolean lb2 = true;
        lb2 = ab1 && ab2;
        boolean lb3 = false;
        ab2 = ab3 || ab4;
        fb0 = ld0 < ad1;
        double ld4 = 977.3893676403139;
        double ld5 = 219.41424981544347;
        if (fb1) {
            lb1 = !lb2;
            lb3 = ab1 || ab2;
            boolean lb6 = true;
            ld0 *= -1;
            ad1 = ad2 + ad3;
            ad4 = fd0 - fd1;
if(fo1 != null){
              fo0 = fo1.m4(ld4, ld5, ld0, ad1);
}
            ab2 = ad2 > ad3;
            ad4 = fd0 - fd1;
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
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought112.getInstance(fb1, fb0, fb1, fb0);
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 > fd0;
    double ld2 = 105.02872130418592;
    Thought lo3 = Thought155.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 757.005525418699;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    Output.points[6][1] += ad3;
    ad4 = fd0 - fd1;
    double ld1 = 98.32340433941111;
if(ao3 != null){
      ld0 = ao3.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Output.points[6][2] -= ld1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld0);
}
    ld1 = ad1 - ad2;

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
    fd1 = fd0 + fd1;
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = !lb1;
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m1(lb2, lb3, lb4, ab1);
}
    ab2 = !ab3;
    fd1 = fd0 - fd1;
    double ld5 = 231.44843854779475;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld5, fd0, fd1, ld5, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      lb1 = ao3.m2(fd0, fd1, ld5, fd0, lb2, lb3, lb4, ab1);
}
    boolean lb6 = true;
    fd1 = ld5 - fd0;
    fd1 = ld5 - fd0;
    fd1 = ld5 - fd0;
    ab1 = !ab2;

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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld1 = 973.0836162078413;
    ab1 = !ab2;
    boolean lb2 = false;
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ld1 = ad1 + ad2;
    ab4 = fb0 || fb1;
    ad3 = ad4 - fd0;
    fd1 = ld1 + ad1;
    lb0 = lb2 && ab1;
    ad2 *= -1;
    double ld3 = 879.17324821591;
if(ao4 != null){
      ab2 = ao4.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, lb0, lb2, ab1, ab2);
}
    ab3 = ld1 < ld3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab4 = fb0 && fb1;
    lb0 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    if (fb1) {
        Thought lo0 = Thought29.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m2();
}
        fd1 *= -1;
        fd0 *= -1;
        boolean lb1 = false;
        fb0 = fb1 || lb1;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m2(fb0, fb1, lb1, fb0);
}
        fb1 = !lb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought184.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    Output.points[6][3] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3();
}
    ab2 = fd1 < fd0;

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
    ad1 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought319.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    lb1 = lb2 && fb0;
    ad3 = ad4 - fd0;

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
    ad1 *= -1;
    ab2 = ad2 < ad3;
    ad4 = fd0 + fd1;
    Thought lo0 = Thought323.getInstance(ad1, ad2, ad3, ad4);
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld1 = 916.6755928892034;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
        ad4 = fd0 + fd1;
    ld1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    fd1 = ld1 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb2, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, ab1);
}
    boolean lb3 = false;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;

Thought.STACK_COUNTER++;
return ld1;
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
          ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || fb0;
    Output.points[6][4] -= fd1;
    fb1 = fd0 > fd1;
    Thought lo0 = Thought185.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
        boolean lb1 = true;
        fd1 *= -1;
        lb1 = fd0 > fd1;
        fb0 = !fb1;
        lb1 = fd0 < fd1;
        Output.points[6][5] += fd0;
        fd1 = fd0 - fd1;
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
    double ld0 = 368.5172196788901;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        double ld2 = 93.6937875399874;
        boolean lb3 = true;
        double ld4 = 907.6965947139532;
        Thought lo5 = Thought96.getInstance(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb3);
        lb1 = !fb0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb3, lb1, fb0);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
        ld2 *= -1;
        ld4 *= -1;
        Thought lo6 = Thought118.getInstance(ld0, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2);
}
        double ld7 = 273.53978868256246;
        Output.points[6][6] += ld4;
        Thought lo8 = Thought323.getInstance();
if(fo0 != null){
          fo0.m2(fb1, lb3, lb1, fb0);
}
        ld7 = ld0 + ad1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought252.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
    fd1 *= -1;
    fd0 *= -1;
    ab3 = ab4 && fb0;
    Thought lo1 = Thought166.getInstance(ao1, ao2, ao3, ao4);
    fb1 = ab1 && ab2;
    fd1 = fd0 - fd1;
    ab3 = ab4 || fb0;
    boolean lb2 = false;
        fb0 = fb1 || lb2;
    fd0 *= -1;
    ab1 = !ab2;

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
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought343.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    Output.points[6][7] += ad3;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb1 = true;
if(ao2 != null){
      lb1 = ao2.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    Output.points[6][8] += ad1;
    ab2 = ab3 && ab4;
    boolean lb2 = true;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad4 = fd0 - fd1;
    ab3 = ad1 > ad2;
    Thought lo4 = Thought20.getInstance(ab4, fb0, fb1, lb1);
    if (lb2) {
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = !fb0;
    double ld1 = 655.4279501954605;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Output.points[7][0] -= ld1;
    fd0 = fd1 + ld1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > ld1;
    if (fb1) {
if(fo1 != null){
          fo1.m1(fd0, fd1, ld1, fd0);
}
        lb0 = fd1 < ld1;
        Thought lo2 = Thought385.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m1(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 || fb1;
        double ld3 = 722.8708198971738;
if(fo1 != null){
          ld3 = fo1.m3(ld1, fd0, fd1, ld3, lb0, fb0, fb1, lb0);
}
        ld1 *= -1;
        fd0 *= -1;
        fb0 = fd1 > ld3;
        boolean lb4 = true;
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
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    double ld0 = 145.6814242842646;
if(fo1 != null){
      ab2 = fo1.m2(ld0, fd0, fd1, ld0);
}
    Output.points[7][1] -= fd0;
    Thought lo1 = Thought30.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        ab2 = ld0 > fd0;
if(fo0 != null){
          fo0.m2();
}
        ab3 = fd1 > ld0;
        Thought lo3 = Thought165.getInstance(ab4, fb0, fb1, lb2);
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb2, ab1, ab2, ab3);
}
        double ld5 = 374.2232438699373;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld5, ld0, ab4, fb0, fb1, lb4);
}
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb4 = fd0 > fd1;
        ld5 = ld0 - fd0;
        fd1 = ld5 - ld0;
        Output.points[7][2] += fd0;
        fd1 *= -1;
if(fo0 != null){
          ld5 = fo0.m3(ld0, fd0, fd1, ld5);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ad1 < ad2;
    fb0 = !fb1;
    if (fb0) {
        fb1 = !fb0;
        fb1 = fb0 && fb1;
        Output.points[7][3] += ad3;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
        ad1 *= -1;
        ad2 = ad3 + ad4;
        fd0 *= -1;
        fd1 *= -1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3();
}
    ad3 = ad4 - fd0;
    boolean lb1 = false;
    ab2 = !ab3;
    fd1 *= -1;
    double ld2 = 959.5610270144033;
    ab4 = fb0 || fb1;

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
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought110.getInstance();
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        fb0 = fd0 < fd1;
        fb1 = lb2 || lb0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb2 = false;
    boolean lb3 = true;
    ad1 *= -1;
    double ld4 = 19.600024492363474;
    Thought lo5 = Thought350.getInstance(ad1, ad2, ad3, ad4);
    fd0 *= -1;
    lb1 = !lb2;

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
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m3();
}
    Thought lo0 = Thought101.getInstance(fb0, fb1, ab1, ab2);
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    Thought lo1 = Thought111.getInstance(ao3, ao4, fo0, fo1);
    fb0 = !fb1;
    ab1 = fd1 > fd0;
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        Output.points[7][4] -= fd1;
if(ao2 != null){
          ao2.m3();
}
        Thought lo3 = Thought24.getInstance(ab4, fb0, fb1, lb2);
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = ad2 < ad3;
    ad4 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
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
        Thought lo0 = Thought178.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought276.getInstance();
    boolean lb2 = false;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2(lb3, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb2);
}
    Thought lo4 = Thought338.getInstance(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb2);
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
}
    boolean lb5 = false;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo6 = Thought239.getInstance(fo0, fo1, fo0, fo1);
    lb5 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 - fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought326.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
    double ld1 = 974.4939306843675;
    fd0 = fd1 - ld1;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    boolean lb0 = true;
    fd1 *= -1;
    Thought lo1 = Thought242.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    Thought lo2 = Thought254.getInstance(lb0, fb0, fb1, lb0);
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
}
    lb3 = fb0 || fb1;
    boolean lb4 = false;
    Output.points[7][5] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb0, lb3, lb4, fb0);
}
    fb1 = lb0 || lb3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb0);
}
    lb3 = !lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    Thought lo5 = Thought300.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb3, lb4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb3, lb4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb0, lb3, lb4, fb0);
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
