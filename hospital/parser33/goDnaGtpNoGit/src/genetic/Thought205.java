package genetic;
import java.util.ArrayList;
class Thought205 extends Thought{
private static ArrayList<Thought205> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 868.266540898188;
private double fd1 = 120.58613643534039;
private Thought fo0 = null;
private Thought fo1 = null;
Thought205 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought205 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought205 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought205 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought205 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought205 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought205 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought205 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought205 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought205 instance = new Thought205 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought205 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought205 instance = new Thought205 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought205 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought205 instance = new Thought205 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought205 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought205 instance = new Thought205 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought205 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought205 instance = new Thought205 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought205 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought205 instance = new Thought205 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought205 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought205 instance = new Thought205 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought205 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought205 instance = new Thought205 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    double ld1 = 102.5207686093914;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    ld1 *= -1;
    fd0 = fd1 + ld1;
    fb0 = fb1 || lb0;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;

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
      fo0.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][3] -= ad2;
    Output.points[2][4] -= ad3;
    Thought lo0 = Thought166.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 *= -1;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
    lb2 = ad3 > ad4;
    double ld3 = 883.2490744539928;
    ad4 = fd0 - fd1;
    fb0 = !fb1;
    Thought lo4 = Thought156.getInstance(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
    boolean lb5 = false;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld3, ad1, lb1, lb2, lb5, fb0);
}
    ad2 *= -1;

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
    Thought lo0 = Thought265.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought284.getInstance();
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ad2 = ad3 + ad4;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ad1 < ad2;

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
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought143.getInstance(fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    double ld0 = 63.91805739816512;
if(ao2 != null){
      ad1 = ao2.m3();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = fd1 < ld0;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought224.getInstance(fo1, ao1, ao2, ao3);
    ad4 *= -1;

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
    Thought lo0 = Thought55.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought91.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought227.getInstance();
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
    Output.points[2][5] += fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        ab1 = fd0 < fd1;
        Thought lo3 = Thought11.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
        boolean lb4 = true;
        fb0 = fb1 || lb4;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        double ld5 = 126.10710486111363;
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
    Thought lo0 = Thought286.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
    boolean lb1 = true;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ad2 *= -1;
    double ld2 = 355.8845845574219;
    Output.points[2][6] -= ad2;
    ad3 = ad4 + fd0;
    Output.points[2][7] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    ld2 = ad1 - ad2;
    boolean lb3 = true;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    lb1 = lb3 && ab1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;
    double ld4 = 994.9687310442562;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld2, ld4, ad1, lb1, lb3, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
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
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb0 = lb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb0 = lb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    Thought lo2 = Thought214.getInstance(lb0, lb1, fb0, fb1);

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
        double ld0 = 184.92660699515045;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ld0 *= -1;
    fd0 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought162.getInstance();
    double ld2 = 83.29789055317866;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    ld2 = fd0 - fd1;
    ld0 = ld2 + fd0;

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
    fb0 = ad2 < ad3;
    Thought lo0 = Thought280.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    Thought lo2 = Thought203.getInstance(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
    fb0 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld3 = 704.9388876078418;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2);
}
    ad3 = ad4 - fd0;

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
if(fo0 != null){
      ad1 = fo0.m3();
}
    double ld0 = 46.97928252569674;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    ab4 = ad1 > ad2;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
    ab1 = ab2 && ab3;
    ab4 = ld0 < ad1;

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
    Thought lo0 = Thought65.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        boolean lb1 = true;
        Thought lo2 = Thought162.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
        double ld3 = 275.8666381181049;
        fd0 *= -1;
        boolean lb4 = false;
if(ao4 != null){
          ao4.m2();
}
        fd1 = ld3 + fd0;
        lb1 = lb4 && fb0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, lb1, lb4, fb0);
}
        ld3 = fd0 - fd1;
        Output.points[2][8] += ld3;
        Thought lo5 = Thought300.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld3, fd0, fb1, lb1, lb4, fb0);
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
    ad1 *= -1;
    fb0 = !fb1;
        ad2 *= -1;
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ad4 = ao4.m3();
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(lb0, fb0, fb1, lb0);
}
        boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    boolean lb3 = true;
    Thought lo4 = Thought312.getInstance(ad4, fd0, fd1, ad1, lb2, lb3, fb0, fb1);
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, lb0, lb1, lb2, lb3);
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
    Thought lo0 = Thought335.getInstance(ao2, ao3, ao4, fo0);
    Output.points[3][0] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
    fd1 *= -1;
    ab4 = fd0 > fd1;
    boolean lb1 = true;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb1);
}
    ab1 = !ab2;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought110.getInstance(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
    Output.points[3][1] += fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    ab3 = !ab4;
    fd0 = fd1 - fd0;
    boolean lb3 = true;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
if(ao4 != null){
          ao4.m3(lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = lb0 || ab1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
    ad4 = fd0 + fd1;
    Thought lo1 = Thought55.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
    double ld2 = 752.1350214509044;

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
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 549.3717623537938;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
    double ld2 = 383.6538010092069;
    ld0 = ld2 + fd0;
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb1, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = fd0 < fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fb0 = fb1 || ab1;
    double ld0 = 526.3375308723774;
    fd0 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    Thought lo1 = Thought333.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
if(fo1 != null){
      fo1.m2();
}
    fd1 = ld0 + fd0;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    Output.points[3][2] -= ld0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb2, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 || fb0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, lb2, ab1, ab2);
}
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fb1 = !lb3;
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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Thought lo1 = Thought102.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    boolean lb2 = true;
    Thought lo3 = Thought125.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
    double ld4 = 728.3930068872857;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    double ld5 = 510.34363842611634;
    fb0 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && lb2;
    Output.points[3][3] -= ld4;
    ld5 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ab1 = ad1 < ad2;
    boolean lb0 = false;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    double ld1 = 483.7195835947606;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m2(lb0, ab1, ab2, ab3);
}
    boolean lb2 = false;
    ad4 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
        double ld3 = 547.095319194926;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, ab1);
}
    Thought lo4 = Thought32.getInstance(fo1, fo0, fo1, fo0);
    ab2 = !ab3;

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
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    lb0 = !fb0;
    fd1 = fd0 + fd1;
    double ld1 = 878.5361038978897;
    Output.points[3][4] -= ld1;
if(ao2 != null){
      ao2.m3();
}
    fb1 = lb0 && fb0;
    Thought lo2 = Thought274.getInstance(fb1, lb0, fb0, fb1);
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        }
    fd1 = ld1 - fd0;
    Thought lo3 = Thought99.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = ld1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
    ld1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - ld1;
    fb0 = fb1 && lb0;
    Thought lo4 = Thought383.getInstance(ao3, ao4, fo0, fo1);
    Thought lo5 = Thought269.getInstance(fd0, fd1, ld1, fd0);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    double ld0 = 310.9392351754347;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
        boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
    double ld2 = 237.09421324747166;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;

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
    double ld0 = 442.98711932306963;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd1 = ao4.m3(ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    ab4 = fb0 && fb1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        lb1 = ld0 > fd0;
        lb2 = ab1 && ab2;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ld0 = ao4.m3(fd0, fd1, ld0, fd0, lb1, lb2, ab1, ab2);
}
        Output.points[3][5] -= fd1;
        ab3 = ab4 && fb0;
        Output.points[3][6] += ld0;
        fb1 = fd0 > fd1;
        double ld3 = 235.88748231226307;
        lb1 = lb2 || ab1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
        boolean lb4 = true;
        boolean lb5 = false;
        ld3 = ld0 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        double ld6 = 596.7871995830419;
if(fo0 != null){
          fo0.m3(fd0, fd1, ld3, ld6);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 471.0426455601532;
    Output.points[3][7] += ld0;
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        ld0 = ad1 + ad2;
        boolean lb1 = false;
        if (ab4) {
if(fo0 != null){
              ao4 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
            ld0 *= -1;
            Thought lo2 = Thought145.getInstance(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
if(ao4 != null){
              ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
            if (fb1) {
if(ao3 != null){
                  ad2 = ao3.m3(ad3, ad4, fd0, fd1);
}
}}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 617.9432568618548;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        if (fb1) {
            fb0 = fb1 || fb0;
            fb1 = !fb0;
            } else if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
            fd1 = ld0 - fd0;
            boolean lb1 = false;
            fd1 *= -1;
            boolean lb2 = true;
if(fo0 != null){
              lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
            lb2 = fb0 || fb1;
            } else if (fb0) {
if(fo1 != null){
              ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
            double ld3 = 470.9641102316779;
            fb1 = !fb0;
            Output.points[3][8] -= ld0;
            fd0 *= -1;
            double ld4 = 214.05887904805078;
            } else if (fb1) {
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
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fd0 *= -1;
    ab1 = fd1 > fd0;
    Thought lo0 = Thought221.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab2 = ab3 || ab4;
    fb0 = fd1 > fd0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fd1 = fd0 + fd1;
    fd0 *= -1;

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
    fb1 = fb0 && fb1;
        Thought lo0 = Thought24.getInstance();
    double ld1 = 17.32397672957032;
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fb1 = !fb0;
    Thought lo2 = Thought98.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd1 > ld1;
    ad1 = ad2 - ad3;
    double ld3 = 119.48208318396388;
    double ld4 = 702.6817932539825;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld5 = 787.6951225942181;
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ld3, ld4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld5 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld3, ld4, ld5);
}
if(fo1 != null){
      fo1.m1();
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
    ad1 = ad2 - ad3;
    ab1 = ad4 < fd0;
    fd1 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 || ab4;
        double ld0 = 286.1628832749399;
        fb0 = ad2 < ad3;
        boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
        }
    ad2 *= -1;
        ab1 = !ab2;
    ad3 = ad4 + fd0;
    Thought lo2 = Thought384.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    Output.points[4][0] -= ad4;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    double ld4 = 319.53830790646344;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld4);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4);
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
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    lb0 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    if (fb0) {
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought66.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
    Output.points[4][1] -= ad4;
    fb0 = !fb1;
    fb0 = !fb1;
    double ld1 = 497.43286504386634;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2();
}
    boolean lb2 = true;
    ld1 = ad1 + ad2;
if(ao1 != null){
      ao1.m3(lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    boolean lb3 = false;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 769.4007657168828;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    ld0 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    double ld1 = 451.68904743893523;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0);
}
if(ao2 != null){
      ab2 = ao2.m2();
}
    ld1 = fd0 - fd1;
    boolean lb2 = false;
    double ld3 = 499.9176057116637;
    ab2 = ld0 > ld1;
    ld3 = fd0 - fd1;
if(ao3 != null){
      ld0 = ao3.m3(ab3, ab4, fb0, fb1);
}
    lb2 = !ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ld0, ld1, ld3, fd0, fb1, lb2, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    lb2 = fd1 > ld0;

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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought234.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    if (fb0) {
        Thought lo1 = Thought367.getInstance();
        ad4 = fd0 - fd1;
        fb1 = ad1 > ad2;
        double ld2 = 957.1306653241769;
        ab1 = !ab2;
        Output.points[4][2] -= ad2;
        ab3 = ad3 < ad4;
        fd0 = fd1 + ld2;
        ad1 = ad2 + ad3;
        double ld3 = 218.67854006253523;
        ad3 = ad4 + fd0;
        fd1 = ld2 + ld3;
        ab4 = ad1 < ad2;
        ad3 = ad4 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
        ab3 = fd1 < ld2;
if(ao3 != null){
          ab4 = ao3.m2(ao4, fo0, fo1, ao1, ld3, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Output.points[4][3] -= fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld0 = 706.0964816832065;
    Thought lo1 = Thought259.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld0;
    boolean lb2 = false;
    fd0 = fd1 + ld0;
    Thought lo3 = Thought129.getInstance(lb2, fb0, fb1, lb2);
    double ld4 = 100.95353517810713;
    boolean lb5 = true;
    lb5 = fb0 || fb1;
    ld4 = fd0 + fd1;
    lb2 = ld0 < ld4;
    lb5 = fd0 > fd1;
    boolean lb6 = false;

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
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    double ld1 = 593.9489313462294;
        boolean lb2 = false;
        Thought lo3 = Thought113.getInstance(fd0, fd1, ld1, fd0, lb0, lb2, fb0, fb1);
    lb0 = fd1 > ld1;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld1;
    lb2 = fb0 && fb1;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    lb0 = !lb2;

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
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m1();
}
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Output.points[4][4] -= fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    lb0 = fd1 > fd0;
    Thought lo2 = Thought174.getInstance(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fd1 = fd0 + fd1;
    double ld3 = 82.94781512388414;

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
