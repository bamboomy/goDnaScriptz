package genetic;
import java.util.ArrayList;
class Thought382 extends Thought{
private static ArrayList<Thought382> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 191.44674724167922;
private double fd1 = 135.63518721687385;
private Thought fo0 = null;
private Thought fo1 = null;
Thought382 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought382 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought382 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought382 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought382 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought382 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought382 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought382 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought382 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought382 instance = new Thought382 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought382 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought382 instance = new Thought382 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought382 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought382 instance = new Thought382 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought382 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought382 instance = new Thought382 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought382 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought382 instance = new Thought382 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought382 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought382 instance = new Thought382 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought382 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought382 instance = new Thought382 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought382 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought382 instance = new Thought382 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    Output.points[8][5] += fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
    Thought lo0 = Thought204.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought126.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[8][6] += fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought348.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb4 = true;
    lb2 = fd1 > fd0;

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
if(fo1 != null){
      fo1.m2();
}
    ab2 = fd1 < fd0;
    if (ab3) {
        double ld0 = 23.907476884470242;
if(fo0 != null){
          ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        double ld1 = 503.9586620547296;
        ab3 = fd0 < fd1;
        Thought lo2 = Thought387.getInstance(fo0, fo1, fo0, fo1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    boolean lb1 = false;
    Thought lo2 = Thought368.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    lb1 = fb0 || fb1;
    Output.points[8][7] -= ad1;
    ad2 = ad3 - ad4;
    boolean lb3 = true;
    boolean lb4 = true;
    fd0 *= -1;
    lb0 = lb1 && lb3;
    lb4 = !fb0;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = false;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    lb1 = lb3 && lb4;
    lb5 = fb0 || fb1;
    Output.points[8][8] -= ad4;
    boolean lb6 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          lb0 = fo1.m2(lb1, lb3, lb4, lb5);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb6, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb1, lb3, lb4, lb5);
}
        boolean lb7 = false;
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
    Output.points[0][0] -= ad2;
    Output.points[0][1] -= ad3;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    ad4 = fd0 + fd1;
    ab1 = !ab2;
    ab3 = !ab4;
    Thought lo1 = Thought353.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || lb0;
    if (ab1) {
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo2 = Thought295.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        fd1 = ad1 + ad2;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
        boolean lb3 = true;
        Output.points[0][2] -= ad3;
        ab3 = ab4 || fb0;
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
    if (fb0) {
        Output.points[0][3] -= fd1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          ao1.m3();
}
        fb1 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
        fb1 = !fb0;
        boolean lb0 = false;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        fb0 = fd0 > fd1;
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
    fb0 = !fb1;
    Output.points[0][4] += ad1;
    fb0 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2);
}
    lb0 = ad3 > ad4;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    fd0 *= -1;
    boolean lb1 = true;

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
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fb1 = !ab1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought156.getInstance(fo0, fo1, ao1, ao2);
    fd0 = fd1 + fd0;

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
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
    double ld0 = 982.2786737948495;
    Output.points[0][5] -= ad3;
    ab2 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    if (ab1) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
        ad3 = ad4 + fd0;
        fb1 = fd1 > ld0;
        Thought lo1 = Thought380.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
        fb0 = fd0 > fd1;
        boolean lb2 = false;
        ld0 *= -1;
        Output.points[0][6] += ad1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb2, ab1);
}
        Thought lo3 = Thought44.getInstance(fo0, fo1, ao1, ao2);
        } else if (ab3) {
        ab4 = fb0 || fb1;
if(ao3 != null){
          fd1 = ao3.m3(ld0, ad1, ad2, ad3);
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
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    Thought lo2 = Thought52.getInstance(fo1, fo0, fo1, fo0);
    lb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Output.points[0][7] -= fd0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        Output.points[0][8] -= fd1;
        lb3 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb3, fb0, fb1);
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    double ld0 = 52.230884201082596;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[1][0] -= ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    boolean lb2 = true;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    ab4 = !fb0;
    fb1 = lb1 || lb2;
    boolean lb3 = false;
    Output.points[1][1] += fd1;
    ld0 *= -1;
    lb3 = ab1 && ab2;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    ld0 = fd0 + fd1;
    Thought lo4 = Thought72.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb1, lb2, lb3, ab1);

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
    if (fb1) {
        fb0 = ad2 > ad3;
        boolean lb0 = false;
        boolean lb1 = false;
if(fo1 != null){
          fo1.m1(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
        lb1 = ad2 > ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
        fd0 = fd1 - ad1;
        ad2 *= -1;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(ad1, ad2, ad3, ad4);
}
        fb0 = fd0 < fd1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fb1 = lb0 || lb1;
        fb0 = fb1 && lb0;
if(fo0 != null){
          lb1 = fo0.m2();
}
        fd1 = ad1 - ad2;
        Output.points[1][2] -= ad3;
        } else if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
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
    Thought lo0 = Thought393.getInstance(ad1, ad2, ad3, ad4);
    ab1 = ab2 || ab3;
    boolean lb1 = false;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    double ld2 = 138.57141158654906;
    fb1 = !lb1;
    boolean lb3 = false;
    boolean lb4 = true;
    boolean lb5 = false;
    ld2 = ad1 - ad2;
    lb3 = !lb4;
    ad3 = ad4 - fd0;
    Output.points[1][3] -= fd1;
    ld2 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
}
if(fo0 != null){
      fo0.m1();
}
    double ld6 = 855.801597601078;
    double ld7 = 236.28984327911414;
if(fo0 != null){
      fo1 = fo0.m4(lb5, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld6, ld7, ad1, ad2, ab4, fb0, fb1, lb1);
}
    lb3 = lb4 || lb5;
if(fo0 != null){
      ab1 = fo0.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb3, lb4);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[1][4] += fd1;
    double ld1 = 934.2922550892224;
if(ao2 != null){
      ao2.m1(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
    boolean lb2 = false;
    lb0 = fd1 < ld1;
    lb2 = fb0 || fb1;
    boolean lb3 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 < ad3;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought272.getInstance(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    ad4 = fd0 + fd1;
    Thought lo3 = Thought58.getInstance(ad1, ad2, ad3, ad4);

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
    double ld0 = 826.3967872188183;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m2(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    boolean lb1 = false;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][5] -= ad2;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(ad3, ad4, fd0, fd1);
}
        ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    lb0 = ad1 < ad2;
    Thought lo1 = Thought382.getInstance(ab1, ab2, ab3, ab4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    if (fb0) {
        fb1 = fb0 && fb1;
        double ld0 = 458.94480397737897;
        ld0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        boolean lb1 = false;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 *= -1;
        fd1 = ld0 + fd0;
if(fo0 != null){
          fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
        fd1 *= -1;
        ld0 *= -1;
        boolean lb3 = false;
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
if(fo0 != null){
      fo0.m3();
}
    double ld0 = 188.20081915843136;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = ld0 < fd0;
    fd1 = ld0 + fd0;
    fd1 *= -1;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    ad2 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 - ad1;
        double ld0 = 484.4012194099284;
    fb0 = ad1 > ad2;
    double ld1 = 774.5695652014699;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    double ld2 = 635.5758914918537;
    ad3 *= -1;
    double ld3 = 547.6345082614212;
    boolean lb4 = false;
        fb0 = ad3 > ad4;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
    if (fb1) {
        ad3 *= -1;
        Thought lo0 = Thought184.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
        fb0 = ad2 > ad3;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
        ab2 = ad4 < fd0;
        fd1 = ad1 - ad2;
        ad3 *= -1;
        Thought lo2 = Thought191.getInstance(fo1, fo0, fo1, fo0);
        ad4 *= -1;
        ab3 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        ab4 = !fb0;
        boolean lb3 = true;
        fd0 *= -1;
        } else {
        Output.points[1][6] += fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    if (lb0) {
        fb0 = !fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(ao2 != null){
          lb0 = ao2.m2();
}
if(ao3 != null){
          fd0 = ao3.m3(fb0, fb1, lb0, fb0);
}
        fb1 = fd1 > fd0;
        boolean lb1 = false;
        lb1 = lb0 && fb0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb1, lb0, fb0);
}
        double ld2 = 899.8615005555937;
        fb1 = ld2 < fd0;
        lb1 = !lb0;
        fb0 = !fb1;
        fd1 = ld2 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld2, fd0, fd1, lb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, lb1, lb0, fb0, fb1);
}
        ld2 = fd0 + fd1;
if(ao4 != null){
          ld2 = ao4.m3(fo0, fo1, ao1, ao2);
}
        lb1 = !lb0;
        Thought lo3 = Thought233.getInstance(fd0, fd1, ld2, fd0);
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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    lb0 = ad3 > ad4;
    Output.points[1][7] -= fd0;
    Output.points[1][8] -= fd1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m2();
}
    boolean lb1 = true;
    Thought lo2 = Thought357.getInstance(lb1, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, lb1, lb3, fb0, fb1);
}
    fd1 *= -1;
    lb0 = !lb1;
    ad1 = ad2 + ad3;

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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    Thought lo1 = Thought363.getInstance(ao1, ao2, ao3, ao4);
    ab1 = !ab2;
    if (ab3) {
        ab4 = fb0 || fb1;
        boolean lb2 = false;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        double ld3 = 864.2248522444571;
        boolean lb4 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld3);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        lb2 = !lb4;
        fd0 *= -1;
        Output.points[2][0] += fd1;
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
    Output.points[2][1] -= ad2;
    ab1 = !ab2;
    boolean lb0 = true;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ad3 = ao2.m3(fb0, fb1, lb0, ab1);
}
    ad4 = fd0 + fd1;
    ab2 = ab3 && ab4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    Thought lo1 = Thought18.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    boolean lb3 = false;
    Output.points[2][2] += ad3;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[2][3] += fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1();
}
    fb0 = fb1 && lb0;
    double ld1 = 561.1142246870405;
    boolean lb2 = false;
        lb2 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb2);
}
    boolean lb3 = true;
    if (lb3) {
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, fd0, lb3, fb0, fb1, lb0);
}
        Output.points[2][4] += fd1;
        double ld4 = 474.1457979737222;
        lb2 = ld4 < ld1;
        fd0 = fd1 - ld4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
        ld1 *= -1;
        lb2 = lb3 || fb0;
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
    fd0 = fd1 - fd0;
    Output.points[2][5] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought248.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fd0 > fd1;
    double ld1 = 897.0002218653214;
    boolean lb2 = true;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb2, ab1);
}
    Output.points[2][6] += ld1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fd1, ld1, fd0, fd1, fb1, lb2, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
        fb1 = ld1 < fd0;
        Output.points[2][7] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
        Thought lo3 = Thought207.getInstance(ld1, fd0, fd1, ld1);
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
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    boolean lb1 = false;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
        fb0 = ad2 < ad3;
        fb1 = lb0 || lb1;
        fb0 = fb1 && lb0;
        double ld2 = 157.66694889859323;
        }
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
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
    Output.points[2][8] += ad2;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    Thought lo1 = Thought305.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = ad1 > ad2;
    ad3 *= -1;
    lb0 = ad4 < fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    double ld2 = 735.3938583647497;
    ab1 = ab2 && ab3;
    boolean lb3 = true;
    Thought lo4 = Thought24.getInstance(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = false;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ld2 > ad1;
    lb0 = lb3 && lb5;

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
    boolean lb0 = false;
    Output.points[3][0] += fd0;
    Thought lo1 = Thought386.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
    Thought lo2 = Thought158.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought104.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fb0 = fd1 < fd0;
    Output.points[3][1] += fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = fd0 > fd1;
    fd0 *= -1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    fb0 = fb1 && lb0;
    boolean lb4 = false;
    lb4 = fb0 && fb1;
    lb0 = !lb4;
    Thought lo5 = Thought295.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb4);
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb4);
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
    double ld0 = 900.898096468332;
    Thought lo1 = Thought382.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    Output.points[3][2] -= fd0;
    boolean lb2 = false;
        fd1 = ld0 + ad1;
    lb2 = ad2 > ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
    fb0 = fd0 > fd1;
if(ao1 != null){
      fb1 = ao1.m2(lb2, fb0, fb1, lb2);
}
    ld0 = ad1 + ad2;
    Thought lo3 = Thought19.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
if(fo1 != null){
      fo1.m2(ld0, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
}
    Thought lo4 = Thought98.getInstance(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb2);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = ad4 > fd0;
    fb1 = fd1 > ld0;
    lb2 = ad1 < ad2;
if(ao4 != null){
      fb0 = ao4.m2(ad3, ad4, fd0, fd1);
}
    fb1 = lb2 && fb0;

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
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    Thought lo0 = Thought261.getInstance();
    Output.points[3][3] += fd0;
    Output.points[3][4] -= fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought260.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fb1 = ab1 && ab2;
    Thought lo2 = Thought255.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd1 < fd0;
    boolean lb3 = false;
    Thought lo4 = Thought203.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 = ad1 - ad2;
    ab2 = !ab3;
    double ld0 = 661.1458123663958;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
    ab1 = fd1 > ld0;
    boolean lb2 = true;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(ao4 != null){
      ao4.m2(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb2);
}
    ab1 = ab2 || ab3;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab4 = ao4.m2(fd0, fd1, ld0, ad1);
}
    boolean lb3 = false;
    ad2 = ad3 + ad4;

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
        fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fd1 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = fd0 < fd1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
    Thought lo3 = Thought236.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo5 = Thought261.getInstance();

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Output.points[3][5] -= fd1;
    lb0 = fd0 > fd1;
    double ld1 = 33.23170668620419;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        boolean lb2 = true;
    lb2 = ld1 > fd0;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought149.getInstance();
    double ld3 = 664.5754489509249;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    fd1 = ld3 + fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    ld3 *= -1;
    Thought lo4 = Thought162.getInstance(fo1, fo0, fo1, fo0);

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
