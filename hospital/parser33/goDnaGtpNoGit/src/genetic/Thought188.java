package genetic;
import java.util.ArrayList;
class Thought188 extends Thought{
private static ArrayList<Thought188> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 833.046941754988;
private double fd1 = 331.70889724512114;
private Thought fo0 = null;
private Thought fo1 = null;
Thought188 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought188 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought188 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought188 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought188 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought188 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought188 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought188 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought188 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought188 instance = new Thought188 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought188 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought188 instance = new Thought188 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought188 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought188 instance = new Thought188 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought188 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought188 instance = new Thought188 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought188 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought188 instance = new Thought188 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought188 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought188 instance = new Thought188 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought188 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought188 instance = new Thought188 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought188 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought188 instance = new Thought188 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[4][2] -= fd0;
    fd1 *= -1;
    Thought lo0 = Thought27.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Output.points[4][3] += fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
        fb1 = fd0 > fd1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Output.points[4][4] -= fd0;
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
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = ab1 || ab2;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
    fd0 = fd1 - fd0;
    double ld0 = 13.852907985468729;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    double ld1 = 229.18040961264674;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, lb2, ab1, ab2, ab3);
}
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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought83.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
    Output.points[4][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    if (fb1) {
        fb0 = ad4 < fd0;
        fd1 = ad1 + ad2;
        fb1 = fb0 && fb1;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fd1 *= -1;
        fb1 = ad1 < ad2;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    double ld1 = 735.7337003622965;
    ab1 = ab2 || ab3;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
    ad1 = ad2 + ad3;
    Thought lo3 = Thought398.getInstance();
    ad4 *= -1;
    Thought lo4 = Thought245.getInstance(ab3, ab4, fb0, fb1);
    double ld5 = 984.2854749262289;
    ad4 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ld5, ad1, lb0, lb2, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[4][6] -= fd1;
    Thought lo6 = Thought376.getInstance(fo0, fo1, fo0, fo1, lb0, lb2, ab1, ab2);
    ab3 = ab4 || fb0;
    fb1 = ld1 < ld5;
    lb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = ad3 < ad4;
    ab1 = fd0 < fd1;
    Thought lo7 = Thought133.getInstance(ld1, ld5, ad1, ad2);
    ab2 = ab3 && ab4;

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
    fb0 = !fb1;
    boolean lb0 = true;
    double ld1 = 283.4602291045427;
    lb0 = fd0 > fd1;
    double ld2 = 246.4314080381944;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld1, ld2, fd0, fd1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3();
}
    ld1 *= -1;
    lb3 = fb0 || fb1;
    double ld4 = 816.3540258051019;
    Thought lo5 = Thought389.getInstance(lb0, lb3, fb0, fb1);
    ld2 = ld4 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, ld2, ld4, lb0, lb3, fb0, fb1);
}
    fd0 = fd1 - ld1;
    double ld6 = 61.93272034030171;
    boolean lb7 = false;
if(ao1 != null){
      fo1 = ao1.m4(ld2, ld4, ld6, fd0, lb0, lb3, lb7, fb0);
}
    fb1 = lb0 && lb3;
if(ao2 != null){
      lb7 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb3);
}
if(ao1 != null){
      lb7 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fd1 < ld1;
    ld2 = ld4 - ld6;
    boolean lb8 = false;
    fb0 = fd0 < fd1;
    fb1 = !lb0;
if(fo1 != null){
      ld1 = fo1.m3(ld2, ld4, ld6, fd0);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1();
}
    Output.points[4][7] += fd1;
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    boolean lb2 = true;
    Output.points[4][8] -= ad4;
    double ld3 = 2.2092269040724433;
    Thought lo4 = Thought192.getInstance(lb1, lb2, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld3, lb0, lb1, lb2, fb0);
}
    fb1 = lb0 || lb1;
    lb2 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, lb0, lb1, lb2, fb0);
}
    double ld5 = 837.2579243628619;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, lb1, lb2);
}
    fd0 = fd1 - ld3;
    fb0 = fb1 || lb0;
    ld5 *= -1;
    boolean lb6 = false;
    double ld7 = 744.6707874729163;
    Output.points[5][0] -= ld7;
    Output.points[5][1] += ad1;
    lb1 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld3);
}
if(ao4 != null){
      ld5 = ao4.m3(fo0, fo1, ao1, ao2, ld7, ad1, ad2, ad3);
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
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fd0 = ao1.m3();
}
        boolean lb0 = true;
        boolean lb1 = false;
if(ao3 != null){
          ao2 = ao3.m4(lb0, lb1, ab1, ab2);
}
        fd1 *= -1;
        Output.points[5][2] -= fd0;
        boolean lb2 = true;
        ab2 = ab3 && ab4;
        fb0 = fd1 > fd0;
        fb1 = !lb0;
if(ao4 != null){
          lb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
        boolean lb3 = true;
        ab3 = fd1 < fd0;
        boolean lb4 = true;
        Output.points[5][3] += fd1;
if(ao3 != null){
          ab3 = ao3.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        Output.points[5][4] += fd0;
        boolean lb5 = false;
        lb1 = lb2 && lb3;
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
    if (ab1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        ad2 = ad3 - ad4;
        fb1 = ab1 && ab2;
        for(int i0=0; i0<10; i0++){
            double ld0 = 138.40447936427577;
            Output.points[5][5] -= ad4;
if(ao1 != null){
              ab3 = ao1.m2(fd0, fd1, ld0, ad1);
}
if(ao2 != null){
              ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
            boolean lb1 = false;
            boolean lb2 = false;
            ab2 = ld0 < ad1;
            double ld3 = 864.600712222986;
if(ao1 != null){
              ao1.m1();
}
if(ao2 != null){
              ab3 = ao2.m2(ab4, fb0, fb1, lb1);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
if(ao3 != null){
              ab4 = ao3.m2(fd0, fd1, ld0, ld3, fb0, fb1, lb1, lb2);
}
            ad1 *= -1;
            boolean lb4 = true;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought256.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld1 = 557.1764922266024;
    Thought lo2 = Thought24.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
    fb0 = ld1 > fd0;

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
    Thought lo0 = Thought223.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = fd1 < fd0;
    ab3 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    double ld2 = 57.753143344454784;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
    ab3 = ab4 || fb0;
    boolean lb3 = false;
    Thought lo4 = Thought295.getInstance();
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, lb3, lb5, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb3, lb5, ab1);
}
    Thought lo6 = Thought286.getInstance(fo0, fo1, fo0, fo1);

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
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = false;
    Output.points[5][6] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, lb1, lb2, lb3);
}
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
    Thought lo4 = Thought45.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    lb0 = !lb1;
    Thought lo5 = Thought57.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo1 != null){
      ad2 = fo1.m3(lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought30.getInstance(fd0, fd1, ad1, ad2);
    lb0 = lb1 && lb2;
    lb3 = fb0 || fb1;

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
    Output.points[5][7] -= ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ad3 < ad4;
        ab2 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought107.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought389.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      ad1 = fo0.m3();
}
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
    double ld2 = 651.7176322580045;
    ab2 = ab3 && ab4;
        ld2 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb3, ab1);
}
    ld2 *= -1;

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
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[5][8] -= fd1;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought246.getInstance(fd0, fd1, fd0, fd1);
    double ld2 = 375.38446772809596;
    if (lb0) {
        fb0 = !fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought395.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[6][0] -= fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ad3 = ao1.m3();
}
        boolean lb1 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    Output.points[6][1] += fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    Output.points[6][2] -= fd0;
    ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought182.getInstance(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
    boolean lb4 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    double ld5 = 779.6728697073154;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld5, fd0);
}
    fd1 = ld5 + fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    lb0 = lb1 && lb2;
    lb4 = ld5 < fd0;
    Thought lo6 = Thought234.getInstance(ab1, ab2, ab3, ab4);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought90.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    double ld1 = 744.5023435283911;
    fb1 = ad4 > fd0;
    fd1 *= -1;
    double ld2 = 486.87710076714876;
    ld1 = ld2 - ad1;
    ab1 = ab2 || ab3;
    double ld3 = 616.7888920771011;
    Output.points[6][3] -= ad1;
    boolean lb4 = true;
    ab3 = ad2 < ad3;
    ad4 = fd0 - fd1;
    boolean lb5 = true;
    double ld6 = 370.01776509866954;
    Thought lo7 = Thought232.getInstance(ld1, ld2, ld3, ld6, ab3, ab4, fb0, fb1);
    lb4 = lb5 || ab1;
    boolean lb8 = true;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought198.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought378.getInstance();
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(lb2, fb0, fb1, lb2);
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
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld1 = 283.6567899706175;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, fd0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd1 = ld1 + fd0;
    Thought lo2 = Thought19.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1);
}
    double ld3 = 234.09553973521213;
    Output.points[6][4] += ld3;
    lb0 = ab1 && ab2;

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
    if (fb1) {
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          fo1.m3(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ad1;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought198.getInstance();
        fb0 = !fb1;
        Output.points[6][5] += fd1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought326.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2();
}
    ab1 = ab2 || ab3;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
    boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
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
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld0 = 890.5916033009931;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld0, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = ld0 + fd0;
        }
    fd1 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 > fd1;
if(ao2 != null){
      ld0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought137.getInstance(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
}
    double ld3 = 337.98367792968287;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = ld0 > ld3;
    Output.points[6][6] -= fd0;
    fb1 = !lb1;
    Thought lo4 = Thought296.getInstance(fd1, ld0, ld3, fd0);
    if (fb0) {
        for(int i1=0; i1<10; i1++){
            Output.points[6][7] -= fd1;
            boolean lb5 = false;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][8] -= ad2;
    ad3 *= -1;
    fb0 = !fb1;
    fb0 = !fb1;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fb0 = fo1.m2();
}
    Output.points[7][0] -= fd1;
    boolean lb0 = true;
if(ao1 != null){
      ad1 = ao1.m3(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought202.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
    fd1 = ad1 - ad2;
    lb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    fb0 = fb1 || lb0;
    fb0 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought60.getInstance(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
    double ld3 = 669.7174676783102;
    ad2 = ad3 + ad4;
    double ld4 = 442.49687505593437;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld3);
}
    ld4 = ad1 + ad2;
    boolean lb5 = false;
    Thought lo6 = Thought155.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
    ld3 = ld4 - ad1;

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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2();
}
    Thought lo1 = Thought184.getInstance(ab1, ab2, ab3, ab4);
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    ab4 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    fd0 = fd1 + fd0;
    if (ab1) {
if(ao3 != null){
          ao3.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 && lb2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        fb0 = fd1 < fd0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
        fd1 = fd0 + fd1;
        fb1 = fd0 > fd1;
        for(int i0=0; i0<10; i0++){
            fd0 = fd1 + fd0;
if(ao4 != null){
              ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
}}
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
    if (ab1) {
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        if (ab3) {
            boolean lb0 = true;
            ab3 = ab4 && fb0;
            fd0 *= -1;
if(fo1 != null){
              fd1 = fo1.m3();
}
            boolean lb1 = true;
            ad1 = ad2 + ad3;
            Thought lo2 = Thought211.getInstance(fb0, fb1, lb0, lb1);
            double ld3 = 781.5753341896982;
if(ao1 != null){
              ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
            fb0 = !fb1;
            Thought lo4 = Thought59.getInstance(ld3, ad1, ad2, ad3, lb0, lb1, ab1, ab2);
            ab3 = ab4 || fb0;
if(fo1 != null){
              fo1.m1(ao1, ao2, ao3, ao4, fb1, lb0, lb1, ab1);
}
            ab2 = !ab3;
            } else {
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            fd0 = fd1 - ad1;
            Thought lo5 = Thought90.getInstance(ad2, ad3, ad4, fd0);
            fb1 = fd1 > ad1;
            ad2 *= -1;
            ab1 = ab2 || ab3;
            ab4 = ad3 > ad4;
if(fo0 != null){
              fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
              ao4 = fo0.m4();
}
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
    boolean lb0 = true;
    fd1 *= -1;
    boolean lb1 = true;
    Thought lo2 = Thought300.getInstance(lb0, lb1, fb0, fb1);
    lb0 = fd0 > fd1;
    Thought lo3 = Thought362.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    lb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld4 = 993.4416556630888;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld4, fd0);
}
    double ld5 = 293.7327314552984;
    Thought lo6 = Thought133.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld5);
    double ld7 = 604.9319022357936;
    Output.points[7][1] += ld7;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    double ld8 = 321.03543037599337;
    lb0 = lb1 && fb0;
    fb1 = !lb0;
    boolean lb9 = false;
if(fo0 != null){
      ld4 = fo0.m3(lb1, lb9, fb0, fb1);
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
    ab1 = !ab2;
    fd1 *= -1;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Thought lo0 = Thought82.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    fd0 *= -1;
    boolean lb1 = false;
    Output.points[7][2] += fd1;
    ab3 = !ab4;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb1;
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    Thought lo3 = Thought321.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    ab3 = fd0 > fd1;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb1, lb2);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    lb2 = ab1 && ab2;
    ab3 = !ab4;

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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    if (lb0) {
        Thought lo1 = Thought15.getInstance(fd0, fd1, ad1, ad2);
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        boolean lb2 = false;
        lb0 = fb0 || fb1;
if(fo0 != null){
          fo0.m3();
}
        lb2 = ad1 < ad2;
        lb0 = fb0 || fb1;
        Output.points[7][3] -= ad3;
if(fo1 != null){
          fo1.m1(lb2, lb0, fb0, fb1);
}
        ad4 *= -1;
        fd0 = fd1 + ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb2, lb0, fb0, fb1);
}
        fd1 = ad1 + ad2;
        ad3 *= -1;
        lb2 = lb0 || fb0;
        Thought lo3 = Thought242.getInstance(ad4, fd0, fd1, ad1, fb1, lb2, lb0, fb0);
        Thought lo4 = Thought308.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, lb0, fb0);
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    double ld0 = 440.9531215136435;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
    boolean lb1 = true;
    fb0 = ad2 > ad3;
    ad4 *= -1;
    Output.points[7][4] += fd0;
    fb1 = !lb1;
        fd1 = ld0 - ad1;
    Thought lo2 = Thought302.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought224.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
if(fo0 != null){
      fo0.m3(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
    ad3 *= -1;
    Output.points[7][5] -= ad4;
    Thought lo4 = Thought346.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    ab3 = !ab4;
    fd0 = fd1 + ld0;
    fb0 = ad1 < ad2;
    Thought lo5 = Thought0.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo6 = Thought43.getInstance(fb1, lb1, ab1, ab2);

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
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought59.getInstance(ao3, ao4, fo0, fo1);
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    lb1 = fd0 < fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb0 = !fb1;
    if (fb0) {
if(ao4 != null){
          fb1 = ao4.m2();
}
        boolean lb0 = false;
        double ld1 = 88.79612894691851;
        lb0 = ld1 > ad1;
        Output.points[7][6] -= ad2;
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 159.67219219393425;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld1 = 681.4752125873832;
if(ao2 != null){
          ao1 = ao2.m4(ld0, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    double ld2 = 298.1574388602955;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld1 = ao2.m3(ld2, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ld2, fd0, fd1);
}
    double ld3 = 455.85351775151827;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    Output.points[7][7] += ld0;
    double ld4 = 769.4578105731922;
    ld1 *= -1;
if(ao3 != null){
      fb1 = ao3.m2();
}
    ab1 = !ab2;
    ab3 = ld2 > ld3;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ld4 > fd0;
    ab3 = fd1 > ld0;
    Thought lo5 = Thought334.getInstance(fo1, ao1, ao2, ao3, ld1, ld2, ld3, ld4, ab4, fb0, fb1, ab1);
if(ao4 != null){
      ao4.m2(fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Output.points[7][8] -= fd1;
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Output.points[8][0] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && fb0;
    Output.points[8][1] += fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3();
}
    fd0 = fd1 - fd0;
    double ld2 = 491.1295309602312;
    fd0 = fd1 - ld2;
    fb0 = fd0 < fd1;
if(fo0 != null){
      ld2 = fo0.m3(fb1, lb0, lb1, fb0);
}
    fb1 = lb0 || lb1;

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
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fb0 = fd1 > fd0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[8][2] += fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    Output.points[8][3] += fd1;
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2();
}
    boolean lb2 = false;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(lb2, fb0, fb1, lb0);
}
    Output.points[8][4] += fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
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
