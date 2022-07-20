package genetic;
import java.util.ArrayList;
class Thought246 extends Thought{
private static ArrayList<Thought246> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 663.5738218241669;
private double fd1 = 97.90061492282256;
private Thought fo0 = null;
private Thought fo1 = null;
Thought246 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought246 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought246 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought246 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought246 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought246 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought246 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought246 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought246 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought246 instance = new Thought246 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought246 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought246 instance = new Thought246 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought246 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought246 instance = new Thought246 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought246 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought246 instance = new Thought246 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought246 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought246 instance = new Thought246 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought246 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought246 instance = new Thought246 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought246 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought246 instance = new Thought246 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought246 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought246 instance = new Thought246 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    Output.points[8][4] -= fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    double ld0 = 574.5419671438581;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(ld0, fd0, fd1, ld0);
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
    double ld0 = 843.4419390563245;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    double ld1 = 877.8740858223706;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld4 = 308.31508498120394;
    fb0 = fb1 && lb2;
    Thought lo5 = Thought251.getInstance(fo1, fo0, fo1, fo0);
    boolean lb6 = true;
    ld1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ld4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld4, fd0, fd1);
}
        ld0 = ld1 - ld4;
    Thought lo7 = Thought335.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb3, lb6, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
    double ld8 = 173.25655603460774;
    lb2 = lb3 || lb6;
if(fo0 != null){
      ld4 = fo0.m3(ld8, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb3);
}
    Thought lo9 = Thought182.getInstance(fo1, fo0, fo1, fo0);

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
    fb0 = !fb1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    Output.points[8][5] -= ad2;
    boolean lb0 = true;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought370.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = ad4 > fd0;
    boolean lb4 = true;
    fd1 = ad1 - ad2;

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
    ab2 = !ab3;
    ad1 = ad2 - ad3;
    Output.points[8][6] -= ad4;
    ab4 = !fb0;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    double ld0 = 340.0006469887713;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    ab2 = !ab3;
    boolean lb1 = false;

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
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    Thought lo1 = Thought361.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
        double ld2 = 942.5999832371028;
    fb0 = ld2 < fd0;
    fb1 = !lb0;
    Thought lo3 = Thought40.getInstance(fd1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
    ld2 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo4 = Thought48.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1);
}
    lb0 = ld2 > fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, lb0, fb0);
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
    Output.points[8][7] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[8][8] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought79.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    fb1 = ad1 < ad2;
    double ld1 = 828.491316949229;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb2 = false;
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo0.m1(fd1, ld1, ad1, ad2, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb2);
}
    Output.points[0][0] -= ad3;
    Thought lo3 = Thought102.getInstance(fo0, fo1, ao1, ao2);
    Output.points[0][1] -= ad4;
    boolean lb4 = true;
    lb4 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(ld1, ad1, ad2, ad3);
}
    fb0 = fb1 || lb2;
    lb4 = !fb0;
    boolean lb5 = false;
    Output.points[0][2] += ad4;

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
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    boolean lb1 = false;
    ab1 = !ab2;
    Thought lo2 = Thought159.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    Thought lo3 = Thought243.getInstance();
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
    Output.points[0][3] += fd1;
    fb1 = lb0 || lb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
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
    ad1 = ad2 - ad3;
if(ao1 != null){
      lb0 = ao1.m2(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought283.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
    ab2 = !ab3;
    boolean lb2 = false;
if(fo1 != null){
          ab3 = fo1.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    lb2 = fd1 > ad1;
    Thought lo3 = Thought137.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    if (lb0) {
        Output.points[0][4] += ad2;
if(fo0 != null){
          lb2 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m2(ad3, ad4, fd0, fd1);
}
        ad1 = ad2 + ad3;
        Thought lo4 = Thought64.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
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
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought74.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 853.7759634629923;
    fd0 = fd1 - ld1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][5] += ld1;
    Thought lo2 = Thought380.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought391.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < ld1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[0][6] += fd1;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Output.points[0][7] -= ld1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 *= -1;
    double ld0 = 790.0237438426384;
    ab1 = !ab2;
    boolean lb1 = false;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    double ld2 = 743.2288697713282;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
    boolean lb3 = true;
    fd0 *= -1;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, lb3, lb4);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    lb1 = lb3 && lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ld0 = fo1.m3(ld2, fd0, fd1, ld0, fb0, fb1, lb1, lb3);
}
    double ld5 = 40.95195589132515;
    boolean lb6 = false;
    boolean lb7 = false;
    lb4 = ld2 > ld5;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb6, lb7, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
        ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
        double ld2 = 155.23745435027786;
    Output.points[0][8] -= ad4;
    fb0 = fd0 < fd1;
    ld2 *= -1;
    Thought lo3 = Thought140.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
    double ld4 = 652.8985901255015;
    double ld5 = 520.5855459829966;
    fb1 = ad3 < ad4;
    Thought lo6 = Thought104.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
    double ld7 = 571.2703142163998;

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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
    ad2 *= -1;
    Thought lo0 = Thought374.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    Thought lo1 = Thought92.getInstance();
    ad1 = ad2 - ad3;
    double ld2 = 233.43881665209602;
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
    boolean lb3 = false;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld2, lb3, ab1, ab2, ab3);
}
    Thought lo4 = Thought273.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb3);
    Thought lo5 = Thought357.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2);
}
    ad3 *= -1;
    ab2 = ad4 < fd0;
    ab3 = fd1 > ld2;
    boolean lb6 = false;
    Output.points[1][0] += ad1;
    ab3 = ad2 < ad3;
    ab4 = !fb0;

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
    Thought lo0 = Thought394.getInstance();
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[1][1] += fd1;
    fb1 = fd0 < fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = !fb0;
        fb1 = fb0 || fb1;
    fd1 *= -1;
    double ld1 = 50.539594754448736;
    fb0 = ld1 < fd0;
    fb1 = fb0 || fb1;
    Output.points[1][2] += fd1;
    Thought lo2 = Thought121.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
    double ld3 = 702.517003172066;
    fb0 = fb1 || fb0;
    ld1 *= -1;
    boolean lb4 = false;
    ld3 = fd0 - fd1;
        fb0 = ld1 < ld3;
    fb1 = fd0 > fd1;
    ld1 = ld3 + fd0;

Thought.STACK_COUNTER++;
return lb4;
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
    Output.points[1][3] += ad2;
    ad3 = ad4 + fd0;
    fb1 = fb0 || fb1;
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    lb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    fb1 = lb0 || fb0;
if(ao1 != null){
      fd0 = ao1.m3();
}
    Output.points[1][4] += fd1;
    boolean lb1 = true;
if(ao2 != null){
      ad1 = ao2.m3(fb0, fb1, lb0, lb1);
}
    ad2 *= -1;
    fb0 = fb1 && lb0;
    lb1 = fb0 || fb1;
    lb0 = !lb1;
    boolean lb2 = false;
    ad3 = ad4 - fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    double ld0 = 717.4349134223936;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought115.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
    ld0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab3 = ao4.m2(fd0, fd1, ld0, fd0);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
if(ao4 != null){
      ld0 = ao4.m3();
}
    Thought lo2 = Thought164.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
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
    if (ab1) {
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        boolean lb0 = false;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        boolean lb1 = false;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
        ab4 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
        lb0 = lb1 && ab1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        boolean lb2 = false;
if(ao3 != null){
          ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
        Output.points[1][5] += ad4;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, lb0, lb1, lb2);
}
if(ao3 != null){
          ad3 = ao3.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
        lb2 = ab1 || ab2;
        double ld3 = 313.91461444378433;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ad1 = ao3.m3(ad2, ad3, ad4, fd0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld1 = 575.2374269675643;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Thought lo2 = Thought121.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    Output.points[1][6] -= fd0;
    Thought lo3 = Thought345.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !lb0;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
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
    ab2 = !ab3;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought124.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
    ab4 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld2 = 248.04520968371125;
    Thought lo3 = Thought264.getInstance(ld2, fd0, fd1, ld2);
    double ld4 = 700.0249024067358;
    ab2 = !ab3;

Thought.STACK_COUNTER++;
return ld4;
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 258.74687162881025;
    fb0 = ad4 > fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < ld0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb2 = false;
    fd0 = fd1 + ld0;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
}
    boolean lb3 = false;
    double ld4 = 716.4410827173939;
    Thought lo5 = Thought259.getInstance(ld4, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, lb3, fb0);
}
    Thought lo6 = Thought221.getInstance(fo0, fo1, fo0, fo1);
    boolean lb7 = true;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(ld4, ad1, ad2, ad3);
}

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 > fd1;
    Thought lo1 = Thought172.getInstance();
    Thought lo2 = Thought274.getInstance(ab2, ab3, ab4, fb0);
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    lb0 = !ab1;
    ab2 = ab3 || ab4;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought185.getInstance();
        double ld1 = 757.5038359918234;
        double ld2 = 880.6882259562782;
if(ao2 != null){
          ao2.m1(fb1, fb0, fb1, fb0);
}
        fb1 = ld1 > ld2;
        }
    fb0 = !fb1;
    fb0 = fd0 < fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 || fb0;
    boolean lb3 = false;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb3, fb0);
}
        Thought lo4 = Thought230.getInstance(ao3, ao4, fo0, fo1, fb1, lb3, fb0, fb1);
    lb3 = fd0 > fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb3;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;

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
    boolean lb0 = true;
    double ld1 = 993.5503954908008;
    lb0 = ad1 > ad2;
    fb0 = ad3 > ad4;
    fd0 = fd1 - ld1;
    ad1 = ad2 - ad3;
    fb1 = lb0 || fb0;
    fb1 = lb0 && fb0;
if(ao2 != null){
      ao2.m3();
}
    ad4 = fd0 - fd1;
    double ld2 = 657.6716546787031;
    double ld3 = 858.8623664437664;
if(ao3 != null){
          ao3.m2(fb1, lb0, fb0, fb1);
}
    lb0 = ld1 < ld2;
if(ao4 != null){
      ld3 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    Thought lo4 = Thought269.getInstance(fd0, fd1, ld1, ld2, fb1, lb0, fb0, fb1);
    lb0 = !fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = false;
    ab4 = !fb0;
    fb1 = !lb0;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > fd0;
    ab3 = !ab4;
    Thought lo1 = Thought201.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    Thought lo2 = Thought64.getInstance(ao4, fo0, fo1, ao1);
        double ld3 = 268.93805164114093;
if(ao3 != null){
      ao2 = ao3.m4(ld3, fd0, fd1, ld3);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld3, fd0, fd1);
}
    ab2 = ld3 < fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab3 = ld3 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    double ld0 = 908.8667868848793;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    Thought lo1 = Thought166.getInstance(ao3, ao4, fo0, fo1);
    Thought lo2 = Thought77.getInstance(ad1, ad2, ad3, ad4);

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    double ld1 = 530.0798746434797;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      ld1 = fo0.m3(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - ld1;
    double ld2 = 339.25845304334644;
    double ld3 = 588.856170047545;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    double ld4 = 444.1543913266185;
if(fo0 != null){
      ld2 = fo0.m3(ld3, ld4, fd0, fd1, fb0, fb1, lb0, fb0);
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
    boolean lb0 = false;
    Thought lo1 = Thought388.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
    fd0 = fd1 - fd0;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld2 = 139.81227027040583;
    fd0 = fd1 - ld2;
    boolean lb3 = true;
    ab4 = fb0 && fb1;
    lb0 = fd0 < fd1;
    Thought lo4 = Thought258.getInstance(ld2, fd0, fd1, ld2);

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
    fb1 = fb0 && fb1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    Thought lo0 = Thought178.getInstance(fb1, fb0, fb1, fb0);
    double ld1 = 864.3401160880708;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    Output.points[1][7] -= ld1;
    fb0 = ad1 > ad2;
    ad3 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
    lb3 = fb0 || fb1;
    lb2 = lb3 || fb0;
    fb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb3 = ad2 > ad3;
    Thought lo4 = Thought54.getInstance(ad4, fd0, fd1, ld1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
    fd0 *= -1;
    Thought lo5 = Thought383.getInstance(fb0, fb1, lb2, lb3);

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
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought186.getInstance(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
    Thought lo1 = Thought288.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    ad3 = ad4 + fd0;
    double ld2 = 156.07013942284772;
    ab2 = ab3 || ab4;
    Thought lo3 = Thought294.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Output.points[1][8] += fd0;
    fb0 = fd1 > ld2;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb4, ab1);
}
    Output.points[2][0] += fd0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2, ab3, ab4, fb0, fb1);
}
    double ld5 = 329.791200556312;

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
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought379.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    Output.points[2][1] -= fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought159.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 && lb2;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
        boolean lb4 = true;
if(ao3 != null){
      lb2 = ao3.m2(fd1, fd0, fd1, fd0, lb3, lb4, fb0, fb1);
}
    boolean lb5 = false;
    fd1 = fd0 - fd1;
    lb2 = lb3 || lb4;
    fd0 = fd1 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb5, fb0, fb1, lb2);
}
    Output.points[2][2] += fd0;
    boolean lb6 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    Output.points[2][3] -= ad4;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ad1, ad2);
}
    Output.points[2][4] -= ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      ao1.m2();
}
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    if (fb0) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        fd0 = fd1 + ad1;
        fb1 = fb0 || fb1;
        double ld0 = 988.9793334681241;
        ad1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        } else if (fb0) {
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
        ad1 *= -1;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    fd0 *= -1;
    Thought lo0 = Thought256.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld1 = 457.45911293016496;
    ld1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[2][5] += ld1;
    Thought lo2 = Thought380.getInstance(fb1, ab1, ab2, ab3);
    Thought lo3 = Thought178.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, ab4, fb0, fb1, ab1);
if(fo1 != null){
          fo1.m3(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    ld1 = fd0 + fd1;
    ab3 = ab4 && fb0;

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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 *= -1;
    fd1 *= -1;
if(ao1 != null){
      ad1 = ao1.m3();
}
    ab2 = ab3 || ab4;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought227.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    Output.points[2][6] += fd0;
    fd1 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
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
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
        Output.points[2][7] += fd1;
    fd0 *= -1;
    fb0 = !fb1;
    Thought lo0 = Thought322.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    Thought lo0 = Thought200.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd1 < fd0;
    double ld1 = 276.6632799012537;
    Output.points[2][8] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    fb0 = fb1 && lb2;
    double ld3 = 831.1457357489342;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld3, fd0, fd1);
}
    fb1 = lb2 || fb0;

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
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought280.getInstance();
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Output.points[3][0] -= fd0;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    double ld2 = 120.35498370770149;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;

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
