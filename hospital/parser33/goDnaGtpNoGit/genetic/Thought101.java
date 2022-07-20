package genetic;
import java.util.ArrayList;
class Thought101 extends Thought{
private static ArrayList<Thought101> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 420.45859596248664;
private double fd1 = 385.5769072278221;
private Thought fo0 = null;
private Thought fo1 = null;
Thought101 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought101 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought101 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought101 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought101 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought101 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought101 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought101 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought101 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought101 instance = new Thought101 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought101 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought101 instance = new Thought101 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought101 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought101 instance = new Thought101 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought101 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought101 instance = new Thought101 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought101 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought101 instance = new Thought101 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought101 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought101 instance = new Thought101 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought101 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought101 instance = new Thought101 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought101 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought101 instance = new Thought101 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    boolean lb1 = true;
    fb0 = fb1 || lb0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
    lb0 = fd0 < fd1;
    double ld3 = 764.8824515701868;
    double ld4 = 469.70756615390076;

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
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 660.6212393634637;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0);
}
    Output.points[5][0] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
    ab1 = ld0 > fd0;
if(fo0 != null){
      fo0.m2();
}
    ab2 = fd1 < ld0;
    fd0 *= -1;
    double ld1 = 764.8582902427481;
    boolean lb2 = false;
    boolean lb3 = true;
    Output.points[5][1] -= fd0;
    double ld4 = 254.43967934026185;
    ab1 = ab2 || ab3;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, lb2);
}
    Thought lo5 = Thought297.getInstance(fo0, fo1, fo0, fo1, ld1, ld4, fd0, fd1, lb3, ab1, ab2, ab3);

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
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = ad4 < fd0;
    fd1 *= -1;
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
    fb1 = ad1 > ad2;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
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
    ab1 = ab2 || ab3;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought42.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
        boolean lb2 = true;
        if (ab1) {
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1);
}
            ab2 = ab3 && ab4;
if(fo0 != null){
              fo0.m1(fd0, fd1, ad1, ad2);
}
            fb0 = ad3 < ad4;
            for(int i1=0; i1<10; i1++){
if(fo1 != null){
                  fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
}}}
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
    double ld0 = 651.062818127205;
    fb0 = fb1 && fb0;
    ld0 = fd0 + fd1;
if(ao1 != null){
      ld0 = ao1.m3();
}
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ld0 = fd0 + fd1;
if(ao4 != null){
      ld0 = ao4.m3(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao4.m3();
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(lb1, fb0, fb1, lb1);
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
    double ld0 = 864.9829486808666;
    boolean lb1 = false;
    Thought lo2 = Thought7.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    fb0 = ad4 > fd0;
    Output.points[5][2] -= fd1;
    Thought lo3 = Thought295.getInstance(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
    ld0 = ad1 - ad2;
    Thought lo4 = Thought194.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
          ad3 = ao4.m3(ad4, fd0, fd1, ld0);
}
    lb1 = ad1 > ad2;
    fb0 = !fb1;
    Output.points[5][3] += ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
}
if(ao4 != null){
      lb1 = ao4.m2();
}
    Thought lo5 = Thought67.getInstance(fb0, fb1, lb1, fb0);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = fd1 < ld0;
    ad1 *= -1;
    Thought lo6 = Thought171.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
    boolean lb7 = true;
    fb0 = fd1 < ld0;
    ad1 = ad2 + ad3;
    boolean lb8 = true;
    fb0 = fb1 && lb1;
    lb7 = lb8 || fb0;

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
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    if (lb0) {
        Thought lo1 = Thought250.getInstance();
        ab1 = fd1 < fd0;
if(ao1 != null){
          fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao2.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
        ab4 = fd0 < fd1;
        boolean lb2 = true;
        } else if (fb0) {
        fb1 = lb0 && ab1;
        Output.points[5][4] -= fd0;
        Thought lo3 = Thought367.getInstance(ao2, ao3, ao4, fo0);
        double ld4 = 944.767181020743;
        Output.points[5][5] += fd0;
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
    ab1 = ab2 || ab3;
    ad1 = ad2 + ad3;
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    ab3 = ab4 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo1 = Thought85.getInstance(fb1, lb0, ab1, ab2);
    ab3 = ab4 && fb0;
    fd1 = ad1 - ad2;
    Thought lo2 = Thought116.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
    ab3 = ad1 > ad2;
    boolean lb3 = true;
    boolean lb4 = false;
    boolean lb5 = false;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 && fb0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m2(fb0, fb1, lb1, lb0);
}
        fb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, lb0, fb0);
}
        fb1 = !lb1;
        lb0 = !fb0;
        double ld2 = 731.34014707598;
        fb1 = lb1 && lb0;
if(fo1 != null){
          fb0 = fo1.m2(ld2, fd0, fd1, ld2, fb1, lb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, lb0, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb1 = lb1 || lb0;
        fd1 = ld2 + fd0;
        fb0 = fd1 < ld2;
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
    boolean lb0 = true;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    lb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
    double ld2 = 938.4460995282338;
    Thought lo3 = Thought160.getInstance(ld2, fd0, fd1, ld2);
    ab4 = fd0 > fd1;
    double ld4 = 187.45746730970276;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ld4, fd0, fd1);
}
        Output.points[5][6] -= ld2;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 264.03008601961153;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
        fb1 = fb0 && fb1;
    Thought lo1 = Thought311.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought176.getInstance(fd0, fd1, ld0, ad1);
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld0;
    fb0 = fb1 && fb0;
    fb1 = ad1 < ad2;
    boolean lb3 = true;
    Thought lo4 = Thought64.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ld0 *= -1;
    lb3 = fb0 || fb1;
if(fo0 != null){
      lb3 = fo0.m2();
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
    Thought lo0 = Thought93.getInstance(ab1, ab2, ab3, ab4);
    if (fb0) {
        ad2 *= -1;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
        fd0 = fd1 - ad1;
        ad2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
        double ld1 = 85.33442363731959;
        ab2 = ld1 > ad1;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb2 = false;
if(fo0 != null){
          fo0.m1(ad3, ad4, fd0, fd1);
}
        ld1 *= -1;
        } else if (ab2) {
        ad2 = ad3 + ad4;
        boolean lb3 = false;
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        Output.points[5][7] += ad3;
        ab3 = ab4 && fb0;
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
      fd1 = ao1.m3();
}
    double ld0 = 731.9966197262993;
    boolean lb1 = false;
    Thought lo2 = Thought283.getInstance(fb0, fb1, lb1, fb0);
        fb1 = ld0 < fd0;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    double ld3 = 493.08401196801356;
    boolean lb4 = true;
    double ld5 = 591.4106746289552;

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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    boolean lb0 = false;
    ad1 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
    fb0 = fb1 || lb0;
    lb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, ad1, ad2);
}
    double ld2 = 555.243063639254;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb1 = ld2 < ad1;
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    lb0 = fd1 < ld2;
    ad1 *= -1;
    boolean lb3 = false;
    lb1 = lb3 && fb0;
    fb1 = lb0 || lb1;
    double ld4 = 701.8874216630818;
    lb3 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb1, lb3);
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
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        for(int i0=0; i0<10; i0++){
        double ld1 = 683.294959789623;
        fd0 = fd1 + ld1;
        fd0 = fd1 + ld1;
if(ao2 != null){
          ao2.m3(fd0, fd1, ld1, fd0);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
        double ld2 = 433.9270795414216;
        ld2 = fd0 + fd1;
        ld1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb3 = false;
        ld2 *= -1;
        Thought lo4 = Thought81.getInstance(ab3, ab4, fb0, fb1);
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld1, ld2, fd0, lb3, lb0, ab1, ab2);
}
        fd1 = ld1 - ld2;
        }
    ab4 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
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
    ab2 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;
    boolean lb0 = false;
    double ld1 = 441.9295225452009;
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
}
    ab1 = ad3 > ad4;
if(ao1 != null){
      ab2 = ao1.m2();
}
if(ao2 != null){
      fd0 = ao2.m3(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    Thought lo2 = Thought124.getInstance(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
    ab4 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
        ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fd1 = ld1 + ad1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld3 = 469.4838197803569;

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
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb0 = true;
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3();
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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought56.getInstance(ab1, ab2, ab3, ab4);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    boolean lb2 = true;
    lb2 = fd0 > fd1;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Output.points[5][8] -= fd0;
    boolean lb3 = false;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb2, lb3);
}
    ab1 = fd1 < fd0;

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
    fb0 = ad1 < ad2;
    Thought lo0 = Thought107.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ad3 < ad4;
    double ld1 = 38.59917694537833;
    ad4 *= -1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - ld1;
    fb1 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb3 = false;
    lb2 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought6.getInstance(fo0, fo1, fo0, fo1);
    Output.points[6][0] -= ad3;
    ab4 = fb0 || fb1;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ab1 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
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
    fd1 *= -1;
    boolean lb1 = true;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      lb1 = ao2.m2(fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    double ld2 = 406.062510719655;
    Thought lo3 = Thought254.getInstance(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    fd1 = ld2 - fd0;
    boolean lb4 = true;
    Thought lo5 = Thought241.getInstance(ao1, ao2, ao3, ao4);
    lb0 = lb1 && lb4;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2);
}
    boolean lb6 = true;
    lb6 = fd0 > fd1;
    Output.points[6][1] -= ld2;
    fb0 = fb1 && lb0;
    lb1 = lb4 || lb6;
    fd0 = fd1 - ld2;
    if (fb0) {
        double ld7 = 598.3229055021599;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
          ao2 = ao3.m4(fb1, lb0, lb1, lb4);
}
if(ao4 != null){
          lb6 = ao4.m2(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld7, fb0, fb1, lb0, lb1);
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
    double ld0 = 376.7302263818176;
    fb0 = !fb1;
        Output.points[6][2] += ld0;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = ld0 > ad1;
    fb0 = fb1 && fb0;
    boolean lb1 = true;
    boolean lb2 = true;
    double ld3 = 641.4816503678976;
    ad1 = ad2 - ad3;
    boolean lb4 = false;
    boolean lb5 = true;
    double ld6 = 89.52668823048155;
    ad3 *= -1;
    lb2 = lb4 || lb5;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Thought lo7 = Thought216.getInstance(fd0, fd1, ld0, ld3);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought213.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    lb1 = fd1 < fd0;
    Output.points[6][3] += fd1;
    ab1 = ab2 && ab3;
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;

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
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld0 = 971.8468663649116;
    ad1 = ad2 - ad3;
    Output.points[6][4] += ad4;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
        Thought lo1 = Thought49.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2();
}
    ab3 = !ab4;
    Output.points[6][5] -= fd0;
    fb0 = fb1 && ab1;
    Output.points[6][6] += fd1;
    Thought lo2 = Thought111.getInstance(ab2, ab3, ab4, fb0);
        fb1 = ab1 && ab2;
    ab3 = ld0 > ad1;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
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
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 223.8719184715375;

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
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < fd0;
    double ld0 = 517.5860148118696;
    fd0 *= -1;
    double ld1 = 450.04136919230297;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;

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
    fb0 = fb1 || fb0;
    double ld0 = 443.6428746455659;
    fb1 = fb0 && fb1;
    double ld1 = 473.8196104955312;
    Thought lo2 = Thought147.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought192.getInstance(fo0, fo1, fo0, fo1);
    ld1 *= -1;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    lb4 = fb0 || fb1;
    fd0 = fd1 + ld0;
    lb4 = ld1 < ad1;
    ad2 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb5 = true;
    lb5 = fb0 || fb1;
if(fo0 != null){
      ld0 = fo0.m3();
}
    ld1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(lb4, lb5, fb0, fb1);
}
    lb4 = !lb5;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb4, lb5);
}
    fb0 = ld0 > ld1;
    fb1 = ad1 > ad2;
    boolean lb6 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1, lb4, lb5, lb6, fb0);
}
        double ld7 = 142.0760298938812;
        fb1 = ld7 > ld0;
        lb4 = ld1 < ad1;
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
    Output.points[6][7] -= ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    double ld1 = 222.5556133823523;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
    boolean lb2 = false;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb1, lb0, lb2, ab1);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
    fd1 *= -1;

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
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought336.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fb0 = fb1 && fb0;
    double ld1 = 665.6896596807528;
    Thought lo2 = Thought219.getInstance();
    boolean lb3 = false;
    Thought lo4 = Thought335.getInstance(fb0, fb1, lb3, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, lb3, fb0, fb1, lb3);
}
    fb0 = !fb1;
    boolean lb5 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb3, lb5, fb0, fb1);
}
    fd1 = ld1 + fd0;
    for(int i0=0; i0<10; i0++){
        lb3 = fd1 < ld1;
        lb5 = !fb0;
        boolean lb6 = true;
        for(int i1=0; i1<10; i1++){
            double ld7 = 908.8177927463702;
            ld1 = fd0 - fd1;
            fb0 = ld7 > ld1;
}}
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
    Output.points[6][8] += ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld0 = 372.6251139484347;
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ld0);
}
    Output.points[7][0] -= ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    double ld2 = 256.59457845579016;
    fb0 = ad4 < fd0;
    fb1 = !lb1;
    boolean lb3 = false;
    lb3 = !fb0;
    if (fb1) {
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
    ab1 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo1 = Thought108.getInstance(fd0, fd1, fd0, fd1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        boolean lb3 = true;
if(ao4 != null){
          ao3 = ao4.m4();
}
        Thought lo4 = Thought275.getInstance(ab1, ab2, ab3, ab4);
        Output.points[7][1] -= fd0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb2, lb3, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb2, lb3);
}
        fd0 *= -1;
        }
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fd1 = fd0 - fd1;
    if (ab4) {
        Output.points[7][2] += fd0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
        Thought lo5 = Thought330.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
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
    if (ab2) {
        ad2 *= -1;
        ad3 *= -1;
        Thought lo0 = Thought135.getInstance();
        ab3 = ad4 > fd0;
        ab4 = fd1 > ad1;
        double ld1 = 808.6256187162037;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        ad1 = ad2 - ad3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
        double ld2 = 574.8500627385732;
if(ao4 != null){
          ao3 = ao4.m4(ld2, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
        ad4 = fd0 + fd1;
        ab2 = ld1 < ld2;
        ab3 = !ab4;
        double ld3 = 325.5882625898131;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
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
    fd0 *= -1;
    double ld0 = 419.0393420530554;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    boolean lb1 = true;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    Output.points[7][3] += fd0;
    fb0 = !fb1;
    boolean lb2 = false;
    lb1 = fd1 > ld0;
    lb2 = fd0 < fd1;
    fb0 = ld0 > fd0;
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
    boolean lb3 = true;
    lb2 = lb3 && fb0;
    ld0 *= -1;

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
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought255.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld1 = 984.6502996891744;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
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
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
    double ld1 = 821.1804662532738;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ld1;
    Thought lo2 = Thought114.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
        fd0 = fd1 + ld1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1);
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
