package genetic;
import java.util.ArrayList;
class Thought214 extends Thought{
private static ArrayList<Thought214> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 930.5227301978565;
private double fd1 = 842.9493792576947;
private Thought fo0 = null;
private Thought fo1 = null;
Thought214 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought214 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought214 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought214 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought214 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought214 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought214 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought214 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought214 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought214 instance = new Thought214 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought214 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought214 instance = new Thought214 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought214 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought214 instance = new Thought214 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought214 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought214 instance = new Thought214 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought214 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought214 instance = new Thought214 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought214 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought214 instance = new Thought214 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought214 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought214 instance = new Thought214 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought214 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought214 instance = new Thought214 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 264.63414221196194;
    double ld1 = 789.3800986413437;
        fb0 = fb1 || fb0;
        ld1 = fd0 - fd1;
if(fo1 != null){
          fo1.m1(ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
    boolean lb2 = true;
if(fo1 != null){
      ld0 = fo1.m3();
}
    ld1 *= -1;
    Output.points[7][6] += fd0;
    fb0 = fb1 || lb2;
    fb0 = fb1 && lb2;
        boolean lb3 = false;
    lb3 = fb0 && fb1;
    lb2 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb2);
}
    lb3 = fb0 && fb1;

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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 < fd1;
    Thought lo0 = Thought393.getInstance();
    ab3 = !ab4;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    boolean lb1 = true;
    boolean lb2 = true;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, lb2, ab1);
}
    ab2 = !ab3;
    Thought lo3 = Thought354.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
    Output.points[7][7] -= fd1;
    boolean lb4 = true;
    lb2 = lb4 && ab1;
    ab2 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
    Output.points[7][8] -= ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    fb1 = ad1 < ad2;
    double ld0 = 570.8719966252308;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    ld0 = ad1 - ad2;
    lb1 = fb0 && fb1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
        if (fb0) {
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought329.getInstance();
        Thought lo1 = Thought307.getInstance(fb1, ab1, ab2, ab3);
        Thought lo2 = Thought57.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
        ab2 = ab3 && ab4;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
            }
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        double ld3 = 657.0224700585453;
        ad2 = ad3 - ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, ld3, ad1);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        ld3 = ad1 - ad2;
        double ld4 = 981.2495300123219;
        ab1 = !ab2;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought47.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    if (fb0) {
        boolean lb1 = false;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
        boolean lb2 = false;
        double ld3 = 281.1339938735157;
        fb0 = fb1 && lb1;
        Output.points[8][0] -= fd0;
        lb2 = !fb0;
        fb1 = lb1 && lb2;
        Output.points[8][1] -= fd1;
        Thought lo4 = Thought281.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb2);
        ld3 *= -1;
        fd0 = fd1 - ld3;
        Output.points[8][2] += fd0;
        Thought lo5 = Thought227.getInstance(fo1, ao1, ao2, ao3);
        fb0 = fb1 || lb1;
        double ld6 = 699.770841582555;
        lb2 = fd0 > fd1;
if(ao4 != null){
          fb0 = ao4.m2(ld3, ld6, fd0, fd1);
}
if(fo0 != null){
          ld3 = fo0.m3(fo1, ao1, ao2, ao3, ld6, fd0, fd1, ld3);
}
        Thought lo7 = Thought392.getInstance();
if(fo0 != null){
          ao4 = fo0.m4(fb1, lb1, lb2, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 324.12938852034534;
    boolean lb1 = true;
    double ld2 = 321.810706560487;
    ld2 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    fd1 *= -1;
    Thought lo3 = Thought382.getInstance(ld0, ld2, ad1, ad2, fb1, lb1, fb0, fb1);
    lb1 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = ld2 > ad1;
    Output.points[8][3] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 + fd0;
    lb1 = !fb0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
        Output.points[8][4] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    ab3 = !ab4;
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd0 = ao3.m3();
}
        boolean lb0 = true;
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
    ab1 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    ad1 *= -1;
    Thought lo1 = Thought252.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
    ab4 = fd1 < ad1;
    ad2 = ad3 - ad4;
    boolean lb2 = false;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        double ld3 = 824.6564987566054;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
        ab4 = !fb0;
        fb1 = fd1 < ld3;
        double ld4 = 607.689300201549;
        ld4 *= -1;
        boolean lb5 = true;
if(ao1 != null){
          lb5 = ao1.m2(ao2, ao3, ao4, fo0);
}
        boolean lb6 = false;
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
    Thought lo0 = Thought48.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    Thought lo3 = Thought255.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    Thought lo4 = Thought349.getInstance(fo1, fo0, fo1, fo0);
    boolean lb5 = true;
    if (lb1) {
        lb2 = fd1 > fd0;
if(fo1 != null){
          lb5 = fo1.m2(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 || lb1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][5] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab1 = fo1.m2();
}
    Thought lo0 = Thought199.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    fd1 = fd0 - fd1;
    if (ab3) {
        fd0 = fd1 - fd0;
        if (ab4) {
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
            ab3 = fd1 < fd0;
if(fo1 != null){
              fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
              ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
            ab1 = ab2 && ab3;
if(fo1 != null){
              ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
            fd0 = fd1 - fd0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
            Thought lo1 = Thought84.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
            fd1 = fd0 + fd1;
if(fo0 != null){
              fo0.m1();
}
            fb0 = fb1 && ab1;
if(fo0 != null){
              fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
            Output.points[8][6] += fd0;
}}
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
    Output.points[8][7] -= ad2;
    boolean lb0 = false;
    lb0 = ad3 > ad4;
    fb0 = fb1 && lb0;
    if (fb0) {
        fd0 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
        fb1 = ad2 < ad3;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb0, fb0, fb1);
}
        boolean lb2 = true;
        Output.points[8][8] -= ad4;
        fd0 *= -1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 *= -1;
    ab2 = !ab3;
    boolean lb0 = true;
    ab3 = ab4 || fb0;
    fb1 = lb0 || ab1;
    ab2 = ab3 && ab4;
    fb0 = ad4 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld1 = 799.6645039651775;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 351.82224495539975;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 > ld0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought46.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0);
}
    double ld3 = 968.6134345469283;
    lb1 = fd0 < fd1;
    if (fb0) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld3, fd0, fd1);
}
if(fo1 != null){
          fo1.m2();
}
        ld0 = ld3 - fd0;
        fb1 = fd1 < ld0;
        lb1 = fb0 || fb1;
if(ao1 != null){
          ld3 = ao1.m3(lb1, fb0, fb1, lb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld3, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
          fb1 = ao2.m2(fd0, fd1, ld0, ld3, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
        double ld4 = 469.4638271497594;
        boolean lb5 = true;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || fb0;
    ad1 *= -1;
    double ld0 = 166.1518196610174;
    fb1 = fb0 || fb1;
    Output.points[0][0] += ad1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    boolean lb2 = true;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    double ld3 = 241.69345316683112;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld3);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[0][1] -= ad1;
    ad2 = ad3 - ad4;
    lb2 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(lb1, lb2, fb0, fb1);
}
        boolean lb4 = false;
    lb1 = lb2 && lb4;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld3, fb0, fb1, lb1, lb2);
}
    boolean lb5 = true;
    boolean lb6 = true;
    boolean lb7 = true;
    boolean lb8 = false;
    Thought lo9 = Thought268.getInstance(ad1, ad2, ad3, ad4, lb4, lb5, lb6, lb7);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb8, fb0, fb1, lb1);
}
    fd1 = ld0 - ld3;
    lb2 = lb4 || lb5;

Thought.STACK_COUNTER++;
return lb6;
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
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought364.getInstance();
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
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
    ab1 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
        ab2 = ad3 > ad4;
        ab3 = !ab4;
        Thought lo0 = Thought381.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
        Thought lo1 = Thought220.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo0 != null){
          ad1 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
        }
    ab2 = ad2 < ad3;
    boolean lb2 = true;
    ab2 = ab3 || ab4;
    boolean lb3 = true;
    ad4 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      ab4 = ao4.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || lb2;
    Thought lo4 = Thought95.getInstance();

Thought.STACK_COUNTER++;
return lb3;
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
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought95.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought257.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    boolean lb3 = false;
    lb3 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    fb1 = !lb0;
    fd1 *= -1;
    lb3 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb0 = lb3 && fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb3);
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
    boolean lb0 = true;
    lb0 = ab1 || ab2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    double ld1 = 785.3304344500448;
    ab4 = fb0 && fb1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    Output.points[0][2] += fd1;
    if (fb0) {
        boolean lb2 = true;
        ld1 = fd0 + fd1;
        Thought lo3 = Thought336.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb2, lb0);
        fd0 = fd1 + ld1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        Output.points[0][3] -= ld1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb0);
}
        Thought lo4 = Thought295.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
        ld1 = fd0 - fd1;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought121.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    Output.points[0][4] -= fd1;
    fb0 = fb1 && fb0;
    Output.points[0][5] -= ad1;
    ad2 *= -1;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ad1;
    fb0 = fb1 || fb0;
    Output.points[0][6] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    fb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Thought lo2 = Thought77.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    lb1 = ad3 > ad4;

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
    ab2 = ad2 > ad3;
    double ld0 = 791.3137768399021;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
    ab2 = ld0 < ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb1);
}
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab4, fb0, fb1, lb1);
}
    ad2 *= -1;
    ad3 *= -1;
    Output.points[0][7] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    Output.points[0][8] -= ad3;
    ab2 = ad4 > fd0;
    fd1 = ld0 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 || fb0;

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
    Output.points[1][0] += fd0;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4();
}
        lb0 = fb0 || fb1;
if(ao3 != null){
          ao3.m2(lb0, fb0, fb1, lb0);
}
        for(int i1=0; i1<10; i1++){
            Output.points[1][1] -= fd1;
            fb0 = fb1 && lb0;
            fb0 = fd0 > fd1;
            fb1 = !lb0;
            fb0 = fb1 || lb0;
if(ao4 != null){
              ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
            fb1 = fd0 > fd1;
            Output.points[1][2] += fd0;
if(ao4 != null){
              ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
            boolean lb1 = false;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb1);
}
            double ld2 = 530.9243813616588;
            fd0 = fd1 - ld2;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 487.4058498378808;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ld0 = ad1 - ad2;
    Thought lo1 = Thought64.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    ld0 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3();
}
    Thought lo2 = Thought198.getInstance(fb1, fb0, fb1, fb0);
    ad4 = fd0 + fd1;
    ld0 = ad1 + ad2;
    ad3 *= -1;
    double ld3 = 75.64380355449251;
    double ld4 = 677.2410271125353;
    boolean lb5 = false;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb5, fb0, fb1);
}
    Thought lo6 = Thought26.getInstance(fd1, ld0, ld3, ld4, lb5, fb0, fb1, lb5);
    fb0 = !fb1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      lb5 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb5, fb0);
}
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 + fd1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = !ab1;
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought342.getInstance(fd0, fd1, fd0, fd1);
    Thought lo2 = Thought391.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
    Output.points[1][3] += fd0;
    fb1 = lb0 || ab1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = fd0 - fd1;
    Output.points[1][4] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    double ld3 = 31.885142075668867;
    fb1 = fd0 < fd1;
    Thought lo4 = Thought192.getInstance(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld3, lb0, ab1, ab2, ab3);
if(ao2 != null){
      ab4 = ao2.m2(fd0, fd1, ld3, fd0, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld3, fd0, fd1);
}
    fb0 = fb1 && lb0;
    ld3 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb6 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb5, lb6, ab1, ab2);
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
    if (ab2) {
        ab3 = ad1 > ad2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        double ld0 = 763.6139629270451;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
        ab4 = ad4 < fd0;
        double ld1 = 527.4185722383658;
        boolean lb2 = false;
if(ao3 != null){
          ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
        fd0 = fd1 - ld0;
        Thought lo3 = Thought309.getInstance(ld1, ad1, ad2, ad3);
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        Output.points[1][5] += ld1;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb2, ab1);
}
        ab2 = ad1 > ad2;
        } else if (ab4) {
        double ld4 = 251.80796302416718;
        boolean lb5 = true;
        Thought lo6 = Thought270.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld4, ab4, fb0, fb1, lb5);
if(ao3 != null){
          ao3.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb5, ab1);
}
        Output.points[1][6] -= fd1;
        ab2 = ab3 || ab4;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1);
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
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
    fb0 = fb1 && lb0;
    Thought lo1 = Thought31.getInstance(fb0, fb1, lb0, fb0);
    fb1 = fd1 < fd0;
    lb0 = fb0 || fb1;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Thought lo2 = Thought312.getInstance(fo1, fo0, fo1, fo0);
    lb0 = fd0 > fd1;
    double ld3 = 872.3454199320287;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb4, fb0, fb1, lb0);
}
    Thought lo5 = Thought200.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb4, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0, lb4, fb0, fb1, lb0);
}
    lb4 = fb0 && fb1;
    Thought lo6 = Thought7.getInstance(fo1, fo0, fo1, fo0, lb0, lb4, fb0, fb1);

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
    ab1 = fd0 < fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    double ld1 = 108.49991620901788;
    ab1 = ld1 < fd0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[1][7] += fd1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
        ld1 *= -1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
        Thought lo3 = Thought142.getInstance();
        fd1 = ld1 - fd0;
        fd1 = ld1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, lb2, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ld1 = fo1.m3(fd0, fd1, ld1, fd0, lb0, lb2, ab1, ab2);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        double ld4 = 152.7954429649996;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        lb0 = fd1 < ld4;
        ld1 = fd0 + fd1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought81.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fb0 = fo1.m2();
}
        ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    double ld1 = 878.7161488513245;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld0 = 762.4909168301471;
    Thought lo1 = Thought43.getInstance();
    ab1 = fd0 < fd1;
    ld0 = ad1 - ad2;
    ab2 = ad3 > ad4;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m2(fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    double ld2 = 741.5692050730844;
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
    if (fb0) {
        Thought lo0 = Thought329.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
        fb0 = fd1 > fd0;
        fd1 = fd0 + fd1;
        boolean lb2 = true;
        Thought lo3 = Thought291.getInstance(fo1, ao1, ao2, ao3);
        boolean lb4 = false;
        fd0 = fd1 - fd0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought264.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought24.getInstance(fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    double ld2 = 668.7279196593284;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1);
}
        boolean lb3 = true;
if(ao1 != null){
          ao1.m3();
}
        ad2 = ad3 - ad4;
        Thought lo4 = Thought135.getInstance(lb3, fb0, fb1, lb3);
        fb0 = !fb1;
        double ld5 = 865.8364060382216;
        lb3 = ad4 < fd0;
        boolean lb6 = false;
        boolean lb7 = true;
        lb6 = lb7 || fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld5, ld2, ad1, fb1, lb3, lb6, lb7);
}
        boolean lb8 = true;
if(ao2 != null){
          ad2 = ao2.m3(ad3, ad4, fd0, fd1, lb8, fb0, fb1, lb3);
}
        ld5 = ld2 - ad1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, lb6, lb7, lb8, fb0);
}
        Thought lo9 = Thought56.getInstance(ao2, ao3, ao4, fo0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ab1 = ao1.m2();
}
    ab2 = fd1 < fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 < fd0;
    ab1 = !ab2;
if(ao2 != null){
      ao2.m3(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][8] -= ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    ab2 = !ab3;
    ab4 = ad2 > ad3;
    fb0 = ad4 > fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m3();
}
    ad2 *= -1;
    Thought lo1 = Thought366.getInstance(ab4, fb0, fb1, lb0);
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 *= -1;
    Thought lo2 = Thought169.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
if(ao2 != null){
      lb0 = ao2.m2();
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao3.m2(ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    ab4 = fb0 || fb1;

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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought51.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought194.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;

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
    Output.points[2][0] -= fd0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    Output.points[2][1] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fd0 = fo0.m3();
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought253.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    Thought lo2 = Thought264.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = fb0 || fb1;
    lb1 = fd0 < fd1;
    double ld3 = 210.76480399589028;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3);
}
    lb4 = fd0 > fd1;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
}
    boolean lb5 = true;

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
    lb0 = !fb0;
    fb1 = fd0 > fd1;
    Output.points[2][2] += fd0;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
          lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
    boolean lb2 = true;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[2][3] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = false;
if(fo1 != null){
      fd0 = fo1.m3(lb4, lb5, fb0, fb1);
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
}
