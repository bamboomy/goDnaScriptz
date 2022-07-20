package genetic;
import java.util.ArrayList;
class Thought60 extends Thought{
private static ArrayList<Thought60> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 526.3871515440338;
private double fd1 = 121.42049918356722;
private Thought fo0 = null;
private Thought fo1 = null;
Thought60 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought60 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought60 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought60 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought60 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 297.9698100368824;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    double ld1 = 109.40222797042945;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    fb0 = fb1 || fb0;
    Thought lo2 = Thought204.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb3 = false;
    boolean lb4 = false;
    Thought lo5 = Thought69.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0, lb3, lb4, fb0, fb1);
    double ld6 = 982.8164568394527;
    lb3 = lb4 && fb0;
    fb1 = lb3 || lb4;
    fd0 *= -1;
    boolean lb7 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, ld6, lb7, fb0, fb1, lb3);
}
        fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb4, lb7, fb0, fb1);
}
    lb3 = lb4 && lb7;
    fb0 = ld1 > ld6;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[4][1] -= fd1;
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    double ld2 = 926.0538020009209;
    double ld3 = 672.9517691140269;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld2);
}
if(fo0 != null){
      ab2 = fo0.m2();
}
    ab3 = ld3 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    boolean lb4 = false;
    boolean lb5 = false;
    fd1 = ld2 + ld3;
    Output.points[4][2] += fd0;
    boolean lb6 = false;
    fd1 = ld2 + ld3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3, lb1, lb4, lb5, lb6);
}
    Output.points[4][3] -= fd0;
    ab1 = ab2 || ab3;

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
    Thought lo0 = Thought298.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    double ld1 = 608.8985066706122;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    double ld2 = 829.4168175574282;
    ld1 = ld2 - ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    double ld3 = 861.0171816912386;
if(fo0 != null){
      fo1 = fo0.m4(ld3, ad1, ad2, ad3);
}
    boolean lb4 = false;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    Output.points[4][4] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ad1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    lb1 = fd1 > ad1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[4][5] -= ad1;
    double ld2 = 789.218848947861;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ld2 = fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + ld2;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    double ld0 = 691.4249858280637;
        ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought369.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb2 = false;
    Output.points[4][6] -= fd0;

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
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought282.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
    fb1 = ad3 > ad4;
    Thought lo1 = Thought108.getInstance();
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - ad1;
    Thought lo2 = Thought45.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
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
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    Thought lo2 = Thought325.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
    ab2 = !ab3;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    lb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo3 = Thought316.getInstance(fd1, fd0, fd1, fd0);
    boolean lb4 = true;
    Output.points[4][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Output.points[4][8] -= fd1;
    fb1 = fd0 > fd1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1();
}
if(ao1 != null){
      fo1 = ao1.m4(lb1, lb4, ab1, ab2);
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
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
    ab3 = !ab4;
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    double ld0 = 399.0401378244933;
    ab3 = ld0 < ad1;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ld0;
    Output.points[5][0] += ad1;
    Output.points[5][1] -= ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m3();
}
    boolean lb1 = false;
    boolean lb2 = false;
if(ao4 != null){
      ao4.m1(lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    lb1 = lb2 && ab1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
    Thought lo3 = Thought14.getInstance(fo1, ao1, ao2, ao3, lb1, lb2, ab1, ab2);
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 - ld0;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought7.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought364.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);

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
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    Output.points[5][2] += fd0;
    ab2 = ab3 && ab4;
    if (fb0) {
        fb1 = fd1 < fd0;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
            ab1 = ab2 || ab3;
            ab4 = fb0 && fb1;
            fd0 = fd1 - fd0;
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo0 != null){
              fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
              fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
            ab1 = ab2 || ab3;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            Output.points[5][3] += fd1;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
}}
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
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 367.13984903438256;
    double ld1 = 275.3970069425165;
    fb0 = !fb1;
    Thought lo2 = Thought220.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[5][4] += ld0;
    Thought lo3 = Thought370.getInstance(ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    boolean lb4 = false;
    lb4 = !fb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb4, fb0, fb1);
}
    double ld5 = 807.526906931837;
    lb4 = fb0 && fb1;
    ad4 = fd0 + fd1;
    Thought lo6 = Thought203.getInstance(fo1, fo0, fo1, fo0);
    double ld7 = 669.4557833447003;
    boolean lb8 = false;
    Output.points[5][5] -= ld0;
    lb4 = lb8 && fb0;
    Output.points[5][6] += ld1;
    fb1 = lb4 && lb8;
    fb0 = fb1 || lb4;

Thought.STACK_COUNTER++;
return lb8;
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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      fo1.m1();
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought152.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && ab1;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought141.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
if(ao3 != null){
      ao3.m1(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, fb0);
}
    if (fb1) {
        lb1 = fd1 > fd0;
        fb0 = fd1 > fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fb1 = fd1 < fd0;
        Thought lo2 = Thought331.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
        boolean lb3 = true;
if(ao4 != null){
          fd1 = ao4.m3();
}
        double ld4 = 619.4606649849432;
if(fo1 != null){
          fo0 = fo1.m4(lb3, lb1, fb0, fb1);
}
if(ao1 != null){
          ld4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld4, fd0, lb3, lb1, fb0, fb1);
}
        lb3 = !lb1;
        if (fb0) {
            fd1 *= -1;
            Thought lo5 = Thought131.getInstance(ld4, fd0, fd1, ld4, fb1, lb3, lb1, fb0);
            fd0 *= -1;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb3, lb1, fb0);
}
            boolean lb6 = false;
}}
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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    double ld1 = 393.76977391501106;
    lb0 = fb0 && fb1;
    lb0 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[5][7] -= fd1;
    lb0 = ld1 > ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld1;
    Thought lo2 = Thought395.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought59.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
    double ld4 = 557.629567790714;
if(ao1 != null){
      lb0 = ao1.m2(ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    Output.points[5][8] -= ld4;

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
    ab1 = fd0 > fd1;
    double ld0 = 832.9537459754339;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld1 = 359.4465225747179;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb1 = ld1 > fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, ld1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
        double ld2 = 617.6298059459596;
    ld0 = ld1 - ld2;
    ab1 = ab2 && ab3;
    double ld3 = 569.0623045376368;
    ab4 = ld3 > fd0;
    if (fb0) {
        fb1 = fd1 > ld0;
        ab1 = ld1 > ld2;
        Thought lo4 = Thought320.getInstance(ab2, ab3, ab4, fb0);
        Output.points[6][0] -= ld3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb1, ab1, ab2, ab3);
}
        ab4 = ld2 > ld3;
        fb0 = !fb1;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        boolean lb5 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Output.points[6][1] += ad2;
    ad3 *= -1;
    ab2 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
    fb1 = ab1 && ab2;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    ab4 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    ad2 *= -1;
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = ad3 < ad4;
    boolean lb2 = false;
    fd0 *= -1;
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ad1 = ao2.m3(lb1, lb2, ab1, ab2);
}
    Output.points[6][2] -= ad2;
    boolean lb3 = true;
    ab2 = ad3 > ad4;
    fd0 = fd1 + ad1;

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
        double ld0 = 111.13908392043366;
    fb1 = !fb0;
    boolean lb1 = false;
    fb0 = !fb1;
    if (lb1) {
        fd0 = fd1 + ld0;
        Output.points[6][3] += fd0;
        Thought lo2 = Thought80.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
        double ld3 = 507.4236678205441;
        Output.points[6][4] += ld3;
        Thought lo4 = Thought76.getInstance(ld0, fd0, fd1, ld3, fb1, lb1, fb0, fb1);
        lb1 = ld0 < fd0;
        boolean lb5 = true;
        lb1 = fb0 || fb1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb5, lb1, fb0, fb1);
}
        ld3 *= -1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb6 = true;
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
    double ld0 = 541.6883629558571;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    ab1 = ab2 || ab3;
    Output.points[6][5] += fd1;
    double ld1 = 791.0602799779945;
    ld0 = ld1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
    double ld3 = 278.63591381145073;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(ld3, fd0, fd1, ld0, ab4, fb0, fb1, lb2);
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
    ad1 *= -1;
    ad2 *= -1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ad3 = ad4 + fd0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought88.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        ad1 = ad2 + ad3;
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
    Thought lo0 = Thought167.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    ad1 = ad2 + ad3;
    double ld1 = 875.864816456769;
    fb1 = ab1 && ab2;
    ab3 = ad3 < ad4;
    ab4 = fb0 && fb1;
    ab1 = fd0 < fd1;
    boolean lb2 = false;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought64.getInstance(ld1, ad1, ad2, ad3);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = false;
    lb5 = ab1 && ab2;
    boolean lb6 = false;
    ad1 *= -1;
    Thought lo7 = Thought398.getInstance(ab2, ab3, ab4, fb0);
    ad2 = ad3 + ad4;
    boolean lb8 = true;
    Thought lo9 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, lb2, lb4);
    lb5 = ad2 > ad3;
    lb6 = lb8 || ab1;
    Thought lo10 = Thought91.getInstance(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
    Output.points[6][6] += ad1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    Output.points[6][7] -= fd1;
    boolean lb0 = false;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought393.getInstance(ao1, ao2, ao3, ao4);
        lb1 = fb0 || fb1;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        double ld3 = 11.473013805528106;
        ld3 *= -1;
        lb0 = !lb1;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ld3, fd0);
}
        Output.points[6][8] -= fd1;
if(fo1 != null){
          ld3 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld3, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo4 = Thought205.getInstance(fb1, lb0, lb1, fb0);
        }
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb5 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb0, lb1, lb5, fb0);
}
    fb1 = !lb0;

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
    Thought lo0 = Thought359.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = true;
    lb2 = ad2 > ad3;
    double ld4 = 78.8224124056252;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb3 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld4, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ld4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = ad1 > ad2;
    ad3 *= -1;
    lb1 = ad4 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld4, ad1, ad2, lb1, lb2, lb3, fb0);
}
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, fb1, lb1, lb2, lb3);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb2);
}
        lb3 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        ld4 *= -1;
        Thought lo5 = Thought318.getInstance(ad1, ad2, ad3, ad4);
        lb1 = lb2 || lb3;
        fb0 = fd0 > fd1;
        Output.points[7][0] += ld4;
        Output.points[7][1] += ad1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][2] -= fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao1 != null){
      ao1.m2(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought96.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
        boolean lb1 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        Thought lo3 = Thought197.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        fb0 = fb1 || lb2;
        lb1 = fd1 < fd0;
        double ld4 = 412.87915963174214;
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
    ab1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 *= -1;
    ab2 = ab3 || ab4;
    boolean lb0 = true;
    ad4 = fd0 - fd1;
    double ld1 = 999.2725896970226;
    ab4 = ld1 > ad1;
    boolean lb2 = true;
    boolean lb3 = false;
            if (ab3) {
        double ld4 = 183.4157775673979;
if(ao3 != null){
          ao3.m2(ab4, fb0, fb1, lb0);
}
        lb2 = lb3 && ab1;
        double ld5 = 668.438024742014;
        boolean lb6 = true;
        ab1 = !ab2;
        } else {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
        lb2 = fd1 > ld1;
        Thought lo7 = Thought257.getInstance(ad1, ad2, ad3, ad4, lb3, ab1, ab2, ab3);
        boolean lb8 = true;
        fd0 = fd1 - ld1;
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
    fd0 *= -1;
    Thought lo0 = Thought365.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Thought lo1 = Thought150.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
    Thought lo0 = Thought265.getInstance();
    double ld1 = 759.4277842855689;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ab4 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
    boolean lb3 = true;
    lb3 = fd0 > fd1;
    ld1 = fd0 - fd1;
    ab1 = ld1 > fd0;
    boolean lb4 = true;

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
    ad1 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    double ld0 = 975.5864535297427;
    Thought lo1 = Thought191.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
    Thought lo3 = Thought254.getInstance(fb0, fb1, lb2, fb0);

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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 419.7229951737771;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, ad1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    ab3 = fd1 < ld0;
    Output.points[7][3] -= ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ad1);
}
        ad2 = ad3 - ad4;
    boolean lb1 = true;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, ab1);
}
    ad2 = ad3 + ad4;
    Thought lo2 = Thought171.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
    fb1 = lb1 && ab1;
    Output.points[7][4] += ad2;
    Output.points[7][5] -= ad3;
    ad4 *= -1;
    fd0 = fd1 + ld0;
    boolean lb3 = false;

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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    double ld0 = 69.5181517996426;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    fb0 = !fb1;
    ld0 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought200.getInstance();
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    fd1 *= -1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb0 = fb0 || fb1;
    Output.points[7][6] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    fb0 = ad1 < ad2;
    ad3 *= -1;
    fb1 = ad4 < fd0;
    Thought lo1 = Thought344.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
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
    Output.points[7][7] += fd0;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought310.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = true;
    boolean lb3 = true;
    Thought lo4 = Thought299.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1();
}
        lb3 = !ab1;
        fd0 = fd1 - fd0;
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
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ad2 = ad3 - ad4;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    double ld0 = 525.9802278110893;
        ab1 = ab2 && ab3;
    Output.points[7][8] += ld0;
    ab4 = ad1 > ad2;
    fb0 = ad3 > ad4;
    fb1 = fd0 > fd1;
    ab1 = ab2 && ab3;
    ab4 = ld0 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      fd1 = ao2.m3(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = ab2 && ab3;
    ld0 = ad1 + ad2;
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1);
}
    ab4 = ld0 > ad1;

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
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought354.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
        fd1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought30.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = !fb0;
    fd1 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 142.17981440595693;
    Thought lo3 = Thought287.getInstance(lb0, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb0, lb1, fb0, fb1);
}
    Thought lo4 = Thought328.getInstance(fd1, ld2, fd0, fd1, lb0, lb1, fb0, fb1);
    Thought lo5 = Thought86.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
    ld2 = fd0 - fd1;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[8][0] += ld2;
    fd0 *= -1;
    fd1 = ld2 - fd0;
    lb0 = lb1 || lb6;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, fd0, fd1);
}
    fb0 = !fb1;
    lb0 = ld2 < fd0;
    fd1 = ld2 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
    lb1 = lb6 && fb0;
if(fo1 != null){
      fo1.m3();
}
    double ld7 = 190.55957879081117;
    fb1 = ld2 > ld7;
    lb0 = fd0 < fd1;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb6, fb0, fb1);
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
    fb0 = fd1 < fd0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    double ld1 = 140.47509857771232;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    Output.points[8][1] -= ld1;
    Thought lo3 = Thought55.getInstance(fo1, fo0, fo1, fo0);

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
