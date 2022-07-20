package genetic;
import java.util.ArrayList;
class Thought138 extends Thought{
private static ArrayList<Thought138> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 142.46161531610105;
private double fd1 = 79.53533844693379;
private Thought fo0 = null;
private Thought fo1 = null;
Thought138 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought138 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought138 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought138 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought138 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought138 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought138 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought138 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought138 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought138 instance = new Thought138 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought138 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought138 instance = new Thought138 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought138 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought138 instance = new Thought138 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought138 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought138 instance = new Thought138 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought138 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought138 instance = new Thought138 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought138 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought138 instance = new Thought138 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought138 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought138 instance = new Thought138 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought138 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought138 instance = new Thought138 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    Output.points[5][4] += fd1;
        for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        lb0 = fd0 > fd1;
        fb0 = fb1 && lb0;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        Output.points[5][5] -= fd1;
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        double ld1 = 55.175945335638445;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m3(fb0, fb1, lb0, fb0);
}
        fd0 = fd1 - ld1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
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
    ab1 = fd0 > fd1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        fd0 = fd1 + fd0;
        ab2 = ab3 || ab4;
        fd1 *= -1;
        Output.points[5][6] -= fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
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
    fb0 = fd1 < ad1;
if(fo1 != null){
      fo1.m3();
}
    Thought lo0 = Thought355.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought3.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Output.points[5][7] -= ad4;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo2 = Thought294.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        double ld3 = 498.90099411963126;
    boolean lb4 = false;
    lb4 = fb0 || fb1;
    lb4 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, lb4, fb0, fb1, lb4);
}
    fd1 = ld3 + ad1;
    fb0 = fb1 || lb4;
    fb0 = fb1 && lb4;
        Thought lo5 = Thought50.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb4, fb0);
    fb1 = !lb4;

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
    ab2 = ad1 < ad2;
    ab3 = ad3 < ad4;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought121.getInstance(fd0, fd1, ad1, ad2);
    Thought lo1 = Thought38.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m2();
}
    ab1 = ab2 && ab3;
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
    double ld2 = 196.9706707042147;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld2 + ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, ad1, ab1, ab2, ab3, ab4);
}
    double ld3 = 769.9477586705661;
    ad1 = ad2 + ad3;
    boolean lb4 = true;
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb4, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m2(ld2, ld3, ad1, ad2);
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
    fb0 = fb1 || fb0;
    Output.points[5][8] -= fd0;
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    boolean lb0 = false;
    Output.points[6][0] -= fd0;
    Output.points[6][1] += fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    lb0 = fd0 > fd1;
    double ld1 = 34.55736692872199;
    fb0 = fb1 || lb0;
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        ld1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
        Thought lo2 = Thought249.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          lb0 = ao3.m2(fd1, ld1, fd0, fd1);
}
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
        fd0 = fd1 - ld1;
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
    ad2 = ad3 - ad4;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 336.25662817557634;
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    for(int i0=0; i0<10; i0++){
        lb1 = !fb0;
        fd0 *= -1;
if(ao4 != null){
          ao4.m1(fd1, ld0, ad1, ad2);
}
        boolean lb2 = true;
if(fo0 != null){
          ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
}
if(ao4 != null){
          fb0 = ao4.m2();
}
        boolean lb3 = false;
        fb0 = ad1 > ad2;
        double ld4 = 578.7716350118121;
        ad2 = ad3 - ad4;
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
    fd0 *= -1;
    Thought lo0 = Thought25.getInstance(ab2, ab3, ab4, fb0);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Output.points[6][2] += fd0;
    ab1 = !ab2;
    ab3 = fd1 > fd0;
    ab4 = fd1 > fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = fd1 < fd0;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        fd1 = ad1 + ad2;
        ad3 = ad4 - fd0;
        lb0 = ab1 && ab2;
        ab3 = fd1 < ad1;
        ad2 = ad3 - ad4;
        fd0 *= -1;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          fd0 = ao2.m3();
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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    Output.points[6][3] += fd1;
    double ld2 = 302.97054825644733;
    ld2 = fd0 - fd1;
    ld2 = fd0 - fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][4] += fd0;
    ab1 = fd1 < fd0;
    double ld0 = 877.970550800679;
    double ld1 = 533.3122217375881;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld0, ld1);
}
    boolean lb2 = false;
    ab1 = !ab2;
    ab3 = fd0 < fd1;
    Thought lo3 = Thought173.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
    Thought lo4 = Thought203.getInstance();
    double ld5 = 451.24706129427545;
    Output.points[6][5] -= ld0;
    boolean lb6 = false;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld5, fd0, fd1, lb6, ab1, ab2, ab3);
}
    ld0 = ld1 - ld5;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ld1, ab4, fb0, fb1, lb2);
}
    ld5 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb6, ab1, ab2, ab3);
}
    boolean lb7 = true;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;
    fb0 = fb1 && fb0;
    fb1 = ad4 < fd0;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Output.points[6][6] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fb1 = !fb0;
    Thought lo0 = Thought30.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);

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
    ad2 = ad3 + ad4;
    fd0 *= -1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = ad4 < fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 - ad2;
        Output.points[6][7] -= ad3;
        fb1 = ad4 > fd0;
        double ld1 = 170.10955521223758;
        double ld2 = 333.4773816826387;
        boolean lb3 = true;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
        }
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb4, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Thought lo5 = Thought396.getInstance(ad1, ad2, ad3, ad4, lb4, ab1, ab2, ab3);
        fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    double ld0 = 402.01090657216736;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought33.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
    double ld2 = 102.69262619492181;
    for(int i0=0; i0<10; i0++){
        ld0 = ld2 - fd0;
        fb0 = fd1 > ld0;
        fb1 = ld2 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 519.9060913124316;
    Output.points[6][8] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ld0 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
        ad3 *= -1;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    lb1 = fd1 > fd0;
    boolean lb2 = true;
    Thought lo3 = Thought369.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb2, lb4, ab1, ab2);
}
    ab3 = fd1 < fd0;
    ab4 = fb0 || fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought179.getInstance(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought135.getInstance();
    double ld2 = 972.3388023715044;
    Thought lo3 = Thought223.getInstance(ab4, fb0, fb1, ab1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, ad1, ab3, ab4, fb0, fb1);
}
        boolean lb4 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ad2 = ad3 + ad4;
    boolean lb5 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    lb4 = fd0 < fd1;

Thought.STACK_COUNTER++;
return lb5;
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
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    double ld0 = 427.26177001042487;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    double ld1 = 11.008828166688174;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[7][0] += ld1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - ld1;
    boolean lb2 = false;
    fd0 = fd1 - ld0;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
    ab4 = fd1 > fd0;
    fb0 = !fb1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo0 = Thought106.getInstance(ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    double ld1 = 218.16049089491392;
    double ld2 = 521.6801590392771;
    ab3 = ld2 > fd0;
    ab4 = fd1 < ld1;
    Output.points[7][1] += ld2;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ld1 = ld2 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
        double ld0 = 321.45537304575754;
    double ld1 = 459.30013530794486;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld0;
    fb0 = ld1 > ad1;
    fb1 = ad2 > ad3;
    fb0 = fb1 || fb0;
    double ld2 = 468.2538105843476;
    double ld3 = 315.3256605664355;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
    fb0 = fb1 && fb0;
    fb1 = ld0 > ld1;
    fb0 = ld2 < ld3;
    double ld4 = 977.5789323912952;
if(fo0 != null){
      fb1 = fo0.m2(ld4, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2();
}
    boolean lb5 = true;
        lb5 = fb0 && fb1;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb5, fb0, fb1, lb5);
}
    ld2 = ld3 - ld4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb5, fb0, fb1);
}
    Thought lo6 = Thought219.getInstance(fd0, fd1, ld0, ld1, lb5, fb0, fb1, lb5);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][2] += ad2;
    Output.points[7][3] += ad3;
    ab2 = ad4 > fd0;
    ab3 = fd1 < ad1;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            ad3 *= -1;
            ab2 = ab3 || ab4;
            fb0 = !fb1;
if(fo0 != null){
              ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
            boolean lb0 = true;
            lb0 = fd0 < fd1;
            Output.points[7][4] -= ad1;
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
            }
        ab2 = !ab3;
        ab4 = fb0 || fb1;
        fd1 *= -1;
        boolean lb1 = false;
        double ld2 = 596.2020410175426;
        Output.points[7][5] -= ld2;
        boolean lb3 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought188.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(ao2 != null){
      lb1 = ao2.m2(fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    Output.points[7][6] -= fd1;
    boolean lb2 = false;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    double ld3 = 788.1457070878071;
    lb1 = lb2 && fb0;
    Thought lo4 = Thought59.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, lb2, fb0);
    ld3 = fd0 - fd1;
    double ld5 = 719.6908504566693;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ld3 = ao3.m3(ld5, fd0, fd1, ld3);
}
if(ao4 != null){
      ld5 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ld5);
}
    for(int i0=0; i0<10; i0++){
        fb1 = lb1 && lb2;
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
    fb0 = ad2 < ad3;
    double ld0 = 955.0693925082062;
if(ao1 != null){
      ao1.m3();
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ld0 = ad1 - ad2;
    boolean lb1 = true;
    fb0 = ad3 < ad4;
    fb1 = lb1 || fb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(ao2 != null){
      lb0 = ao2.m2(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        double ld2 = 239.26976228504125;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld2, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
        ab1 = fd1 < ld2;
        ab2 = ab3 || ab4;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        fb0 = fd0 < fd1;
if(ao3 != null){
          ao3.m2(ld2, fd0, fd1, ld2);
}
        fd0 *= -1;
        Thought lo3 = Thought232.getInstance(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          fb1 = ao4.m2(lb0, lb1, ab1, ab2);
}
        Thought lo4 = Thought107.getInstance(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
        Output.points[7][7] += fd0;
        lb0 = fd1 < ld2;
        fd0 = fd1 + ld2;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld2, fd0, lb1, ab1, ab2, ab3);
}
        Thought lo5 = Thought207.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
        Thought lo6 = Thought218.getInstance(ao3, ao4, fo0, fo1);
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
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    Thought lo0 = Thought154.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      ab2 = fo1.m2();
}
    Thought lo1 = Thought24.getInstance(ab3, ab4, fb0, fb1);
    boolean lb2 = false;
    ad2 *= -1;
    Thought lo3 = Thought372.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
    if (ab1) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought260.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    double ld2 = 753.8008640626572;
    boolean lb3 = false;
    ld2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb3, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, lb0, lb3, fb0, fb1);
}
    lb0 = lb3 && fb0;
    for(int i0=0; i0<10; i0++){
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
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
            fb1 = !ab1;
            boolean lb0 = true;
            fd1 = fd0 - fd1;
            }
        fd0 = fd1 + fd0;
        boolean lb1 = false;
        boolean lb2 = false;
        fd1 *= -1;
        Thought lo3 = Thought269.getInstance(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
        fd0 = fd1 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
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
      fo0.m3(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 > fd1;
        fb0 = !fb1;
        Thought lo0 = Thought160.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
        if (fb0) {
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
            ad2 = ad3 - ad4;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
            fd0 = fd1 + ad1;
            double ld1 = 728.5443560403354;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            fb1 = ad1 > ad2;
if(fo1 != null){
              ad3 = fo1.m3(ad4, fd0, fd1, ld1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
    ab1 = ad2 < ad3;
    boolean lb0 = true;
    Thought lo1 = Thought149.getInstance();
    Thought lo2 = Thought157.getInstance(ab1, ab2, ab3, ab4);
    boolean lb3 = true;
    if (ab4) {
        fb0 = ad4 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, lb3, ab1);
}
        if (ab2) {
            ad4 = fd0 + fd1;
if(fo0 != null){
              fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
            fd0 *= -1;
            for(int i0=0; i0<10; i0++){
                fd1 = ad1 - ad2;
                ad3 = ad4 - fd0;
                fd1 = ad1 - ad2;
                boolean lb4 = false;
                boolean lb5 = false;
if(fo1 != null){
                  fo1.m2(fo0, fo1, fo0, fo1, lb4, lb5, lb0, lb3);
}
if(fo0 != null){
                  ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
                  fo1.m3(ad4, fd0, fd1, ad1);
}
                Thought lo6 = Thought122.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
                ab1 = fd1 > ad1;
                double ld7 = 25.466019728294803;
if(fo1 != null){
                  fo0 = fo1.m4();
}
if(fo1 != null){
                  fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
}}}
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
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought183.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    fb0 = fd1 > fd0;
    Output.points[7][8] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb1 = true;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
        double ld3 = 733.6032110332279;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld3, fd0);
}
        lb2 = fb0 || fb1;
        lb1 = fd1 < ld3;
        fd0 *= -1;
if(fo0 != null){
          lb2 = fo0.m2();
}
        boolean lb4 = false;
if(fo1 != null){
          fd1 = fo1.m3(lb2, fb0, fb1, lb4);
}
        ld3 = fd0 + fd1;
        double ld5 = 990.1116012354498;
        double ld6 = 78.20390312695129;
        ld3 = ld5 - ld6;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld3, ld5, ld6, lb1, lb2, fb0, fb1);
}
        double ld7 = 606.4647225857393;
        Thought lo8 = Thought383.getInstance(ld7, fd0, fd1, ld3, lb4, lb1, lb2, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 98.476870791412;
if(ao1 != null){
      ao1.m2(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 + ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld1 = 267.2399871223733;
    fb1 = ld0 > ld1;
if(ao1 != null){
      ao1.m1();
}
    Thought lo2 = Thought103.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;

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
    Thought lo0 = Thought357.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought325.getInstance(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    Output.points[8][0] += fd1;
    fd0 = fd1 - fd0;
    boolean lb2 = true;

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
    Thought lo0 = Thought273.getInstance();
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        ad2 = ad3 + ad4;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fd0 *= -1;
if(ao4 != null){
          ao4.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = lb1 || ab1;
        if (ab2) {
            ab3 = ad2 > ad3;
if(ao2 != null){
              ao1 = ao2.m4(ab4, fb0, fb1, lb1);
}
}}
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
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld2 = 856.7850655799127;
    fb1 = lb0 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
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
    fb0 = !fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
        fb1 = fb0 && fb1;
    boolean lb0 = true;
    Thought lo1 = Thought352.getInstance(fd0, fd1, fd0, fd1);
    Output.points[8][1] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fd0 > fd1;
    fb0 = fb1 || lb0;
    fb0 = fd0 > fd1;
        fb1 = lb0 && fb0;
    Thought lo2 = Thought34.getInstance(fb1, lb0, fb0, fb1);
    boolean lb3 = false;

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
    Thought lo0 = Thought381.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought209.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
    Output.points[8][2] -= fd0;
        fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[8][3] -= fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb2 = fb0 && fb1;

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
