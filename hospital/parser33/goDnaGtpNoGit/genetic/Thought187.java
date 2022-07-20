package genetic;
import java.util.ArrayList;
class Thought187 extends Thought{
private static ArrayList<Thought187> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 881.5604264520164;
private double fd1 = 330.47907348937275;
private Thought fo0 = null;
private Thought fo1 = null;
Thought187 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought187 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought187 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought187 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought187 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought187 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought187 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought187 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought187 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought187 instance = new Thought187 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought187 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought187 instance = new Thought187 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought187 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought187 instance = new Thought187 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought187 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought187 instance = new Thought187 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought187 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought187 instance = new Thought187 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought187 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought187 instance = new Thought187 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought187 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought187 instance = new Thought187 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought187 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought187 instance = new Thought187 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 314.8970974138426;
    double ld1 = 849.0659879780916;
    ld1 = fd0 - fd1;
    fb1 = ld0 > ld1;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1, fb1, lb2, fb0, fb1);
}
    Output.points[0][5] += ld0;
    boolean lb3 = false;
    lb2 = lb3 || fb0;
    double ld4 = 788.0541652584792;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
    ld1 *= -1;
    Output.points[0][6] -= ld4;
    fd0 = fd1 + ld0;
    Thought lo5 = Thought190.getInstance(fo1, fo0, fo1, fo0);

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
    ab1 = !ab2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = !ab1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo0 = Thought172.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        }
    boolean lb3 = true;

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
    ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    fd0 = fd1 + ad1;
    Output.points[0][7] -= ad2;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[0][8] -= ad3;
    lb0 = !fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
    if (fb1) {
        ad4 = fd0 - fd1;
        lb0 = !lb1;
        fb0 = ad1 > ad2;
        Thought lo2 = Thought346.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
        Thought lo3 = Thought261.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
        double ld4 = 982.9193189834301;
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
    ad1 = ad2 - ad3;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ab1 = ad4 < fd0;
        Thought lo0 = Thought78.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
    if (ab2) {
        Output.points[1][0] += ad1;
        } else {
        ab3 = ad2 > ad3;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
        ad2 = ad3 - ad4;
        Output.points[1][1] += fd0;
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
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[1][2] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fd1 *= -1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
        lb0 = fd0 > fd1;
        Output.points[1][3] += fd0;
if(ao3 != null){
          fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought108.getInstance();
    fb1 = fd1 > ad1;
    if (fb0) {
        ad2 *= -1;
        ad3 *= -1;
        ad4 *= -1;
        boolean lb1 = true;
        boolean lb2 = true;
if(ao2 != null){
          ao2.m3(lb2, fb0, fb1, lb1);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb1);
}
        lb2 = !fb0;
        Output.points[1][4] += ad1;
        ad2 = ad3 + ad4;
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
    ab2 = ab3 || ab4;
    boolean lb0 = true;
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[1][5] -= fd0;
    double ld1 = 266.52130932038176;
    Thought lo2 = Thought83.getInstance(fd0, fd1, ld1, fd0);
    ab4 = fd1 > ld1;
    fd0 = fd1 + ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
    fd1 = ld1 + fd0;
    Thought lo4 = Thought268.getInstance(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1, lb3, ab1, ab2, ab3);
    ld1 = fd0 + fd1;
    ab4 = !fb0;
    double ld5 = 539.5812388812487;
    if (fb1) {
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
    ab1 = !ab2;
    double ld0 = 797.6104107899316;
    Thought lo1 = Thought249.getInstance(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        boolean lb2 = true;
    Thought lo3 = Thought87.getInstance(ao1, ao2, ao3, ao4);
    ad4 *= -1;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      ld0 = ao2.m3(ab4, fb0, fb1, lb2);
}
    lb4 = ad1 > ad2;
    ad3 = ad4 + fd0;
    ab1 = !ab2;

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
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;

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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = ab1 && ab2;
    Output.points[1][6] += fd0;
    boolean lb0 = false;
    ab2 = !ab3;
    Thought lo1 = Thought273.getInstance(fd1, fd0, fd1, fd0);
    if (ab4) {
        double ld2 = 714.2341672481081;
        fb0 = fb1 && lb0;
        ab1 = ab2 || ab3;
        double ld3 = 52.651417301466964;
        boolean lb4 = false;
        ab3 = ab4 && fb0;
        ld3 = fd0 - fd1;
        Thought lo5 = Thought197.getInstance(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1);
if(fo0 != null){
          fb1 = fo0.m2();
}
        boolean lb6 = true;
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
    fb1 = ad1 > ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    double ld0 = 141.60416238482895;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    ld0 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad3 < ad4;
    double ld2 = 406.981899992963;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
        fd0 = fd1 + ld0;
        Output.points[1][7] += ld2;
        double ld3 = 392.46577259658085;
        boolean lb4 = true;
if(fo0 != null){
          fo0.m1(ld2, ad1, ad2, ad3);
}
if(fo1 != null){
          lb4 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3);
}
        lb1 = fb0 && fb1;
        Thought lo5 = Thought188.getInstance();
        lb4 = ld0 > ld2;
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
    Output.points[1][8] += ad2;
    ab1 = ad3 > ad4;
    ab2 = ab3 || ab4;
    boolean lb0 = true;
    double ld1 = 68.92321719448567;
    ab4 = fb0 && fb1;
    ad4 = fd0 - fd1;
    ld1 = ad1 + ad2;
    lb0 = ab1 && ab2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    double ld2 = 58.4263818217556;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ld1, ld2, ad1, ad2);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3();
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
if(ao1 != null){
      fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 278.43145339523073;
    boolean lb1 = false;
    boolean lb2 = false;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
}
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;

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
    boolean lb0 = false;
    Output.points[2][0] -= ad1;
    boolean lb1 = false;
        Thought lo2 = Thought229.getInstance(ad2, ad3, ad4, fd0);
    lb1 = fb0 || fb1;
    lb0 = lb1 || fb0;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo3 = Thought23.getInstance(fb1, lb0, lb1, fb0);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
        lb0 = lb1 && fb0;
    ad3 = ad4 - fd0;

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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    double ld0 = 414.9627792543945;
    boolean lb1 = false;
    lb1 = !ab1;
    ab2 = fd0 > fd1;
    boolean lb2 = false;
    double ld3 = 852.5235482362698;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo4 = Thought115.getInstance(ld0, ld3, fd0, fd1);
    ab3 = ld0 > ld3;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld3);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(lb1, lb2, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = !lb2;
    if (ab1) {
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = fd1 < ad1;
    fb0 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab3 = fd0 > fd1;
if(ao1 != null){
      ab4 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought23.getInstance(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    Thought lo2 = Thought11.getInstance(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo1 = Thought300.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    Output.points[2][1] -= fd0;
    fb1 = fd1 > fd0;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought101.getInstance();
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought182.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = fd1 < fd0;
    Output.points[2][2] -= fd1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
        fd1 = fd0 + fd1;
    boolean lb3 = true;
    Thought lo4 = Thought145.getInstance(fd0, fd1, fd0, fd1);
    double ld5 = 554.7738760188417;
    double ld6 = 574.6702213781599;
    ab2 = ld5 < ld6;
    boolean lb7 = true;
    double ld8 = 271.2209991654487;
    ab2 = !ab3;
    Thought lo9 = Thought311.getInstance(fo1, fo0, fo1, fo0, ld8, fd0, fd1, ld5);

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
    fb0 = ad1 > ad2;
    boolean lb0 = true;
    fb0 = !fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = ad3 > ad4;
        boolean lb2 = true;
    Thought lo3 = Thought362.getInstance(lb1, lb2, fb0, fb1);
    boolean lb4 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, lb1, lb2, lb4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb4, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb0 = lb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        lb4 = fb0 && fb1;
    lb0 = ad1 < ad2;

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
    double ld0 = 461.6070474160806;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad1 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought305.getInstance(ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 && ab2;
    ad4 = fd0 - fd1;
    ab3 = ld0 > ad1;
    ab4 = ad2 < ad3;
    fb0 = fb1 && ab1;
    ab2 = ad4 > fd0;
    ab3 = ab4 || fb0;
    fb1 = fd1 > ld0;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
    ab1 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    Thought lo2 = Thought79.getInstance();
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        boolean lb4 = false;
if(fo1 != null){
          ab3 = fo1.m2(ab4, fb0, fb1, lb4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb4);
}
        lb3 = ad4 < fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 12.898840067777552;
    ld0 = fd0 + fd1;
if(ao1 != null){
      fb0 = ao1.m2(ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb1 = !fb0;
    fb1 = fd1 > ld0;
if(ao1 != null){
      fb0 = ao1.m2();
}
    Thought lo1 = Thought221.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought72.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought280.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
    fb1 = ad2 < ad3;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad4 = fo0.m3();
}
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[2][3] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
    fb0 = fb1 || fb0;
    double ld2 = 317.7123406367755;
    ad3 = ad4 - fd0;
    fb1 = !fb0;
    Thought lo3 = Thought306.getInstance(fd1, ld2, ad1, ad2, fb1, fb0, fb1, fb0);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
    double ld0 = 799.3196873262183;
    fb0 = !fb1;
    Thought lo1 = Thought122.getInstance(ld0, fd0, fd1, ld0);
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = fd1 > ld0;
    Output.points[2][4] -= fd0;
    boolean lb2 = false;
    fd1 = ld0 + fd0;

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
if(ao1 != null){
      lb0 = ao1.m2(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 + ad1;
    if (ab2) {
        ad2 *= -1;
        Thought lo1 = Thought308.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
        Thought lo2 = Thought349.getInstance(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
        ab4 = !fb0;
        fb1 = ad1 < ad2;
if(fo1 != null){
          ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
        boolean lb3 = true;
        lb3 = ad4 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
        ad2 *= -1;
        ad3 *= -1;
        ab1 = ab2 || ab3;
        Thought lo4 = Thought361.getInstance();
        ab4 = !fb0;
        fb1 = lb3 || lb0;
if(fo1 != null){
          ad4 = fo1.m3(ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb3;
        Thought lo5 = Thought146.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
        ab4 = fb0 && fb1;
if(fo0 != null){
          lb3 = fo0.m2(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb3);
}
        lb0 = !ab1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
        if (lb0) {
        fb0 = fb1 && lb0;
        fd0 = fd1 - fd0;
        boolean lb1 = true;
        lb0 = !fb0;
        } else {
        boolean lb2 = false;
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
    Output.points[2][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    Output.points[2][6] += fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = fd0 > fd1;
    double ld0 = 287.7805619382528;
    boolean lb1 = true;
    double ld2 = 604.0180908029239;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld2, fd0, fd1);
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
    fb1 = ad1 < ad2;
    fb0 = !fb1;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
    lb0 = !fb0;
    ad2 *= -1;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    Output.points[2][7] -= ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
        boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    fd0 *= -1;
    lb1 = fd1 > ad1;

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
    ab1 = ad2 > ad3;
    Output.points[2][8] += ad4;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo1 != null){
      ab3 = fo1.m2();
}
    ad2 = ad3 - ad4;
    Thought lo0 = Thought226.getInstance(ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
    fd0 = fd1 - ad1;
    double ld1 = 911.3585550431235;
    Output.points[3][0] -= ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = true;
    Thought lo3 = Thought186.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb2);
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld1 > ad1;
    Thought lo4 = Thought151.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, ab1, ab2);
    ad2 = ad3 - ad4;
    double ld5 = 131.7442855419976;
    ad4 = fd0 + fd1;
    ld1 = ld5 + ad1;
    Output.points[3][1] -= ad2;

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
    fb1 = !fb0;
    fb1 = !fb0;
    double ld0 = 87.59006936181079;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought358.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = fb0 && fb1;
    fd1 = ld0 + fd0;
    Output.points[3][2] += fd1;
    Thought lo2 = Thought96.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    Thought lo0 = Thought183.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
    fb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought203.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          fb1 = ao4.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        boolean lb2 = true;
        Output.points[3][3] += ad1;
        boolean lb3 = false;
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
    ab1 = ab2 && ab3;
    ab4 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 || fb0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
if(ao3 != null){
      fd0 = ao3.m3(fb1, ab1, ab2, ab3);
}
    double ld0 = 604.1461653261473;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fd1 < ld0;

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
    Output.points[3][4] += ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
    Output.points[3][5] -= fd0;
    boolean lb1 = false;
    ab4 = fb0 && fb1;
    lb0 = lb1 || ab1;
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
    Output.points[3][6] += ad4;
    fd0 *= -1;
    ab2 = !ab3;
    fd1 *= -1;
    ab4 = ad1 < ad2;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, lb1);
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
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        double ld1 = 543.5653700966125;
    fb1 = lb0 && fb0;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    lb0 = ld1 < fd0;
    fb0 = fd1 > ld1;
    fb1 = fd0 < fd1;
    ld1 = fd0 - fd1;
    lb0 = !fb0;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    ld1 *= -1;
    lb0 = fb0 && fb1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = ld1 < fd0;
    Thought lo2 = Thought382.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);

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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Output.points[3][7] += fd0;
    double ld0 = 10.317457583096166;
    fb0 = !fb1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    double ld1 = 227.58972588296874;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 374.23051071646785;
    ld1 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo3 = Thought16.getInstance(ld1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    Output.points[3][8] -= ld0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld1 *= -1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[4][0] += ld2;
    fb0 = fd0 < fd1;
    boolean lb4 = false;

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
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 99.55085253309467;
    double ld1 = 220.27581903607998;
    ld0 *= -1;
    ld1 = fd0 + fd1;
    ld0 *= -1;
    Thought lo2 = Thought395.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    ld1 = fd0 - fd1;
    double ld3 = 306.5716800421086;
    ld0 = ld1 + ld3;
    fb1 = fd0 > fd1;
    Output.points[4][1] -= ld0;
    fb0 = ld1 < ld3;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Thought lo4 = Thought339.getInstance(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
    ld3 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ld1 < ld3;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld0, ld1);
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
