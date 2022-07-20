package genetic;
import java.util.ArrayList;
class Thought333 extends Thought{
private static ArrayList<Thought333> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 602.3854784008614;
private double fd1 = 528.6380694712525;
private Thought fo0 = null;
private Thought fo1 = null;
Thought333 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought333 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought333 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought333 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought333 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought333 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought333 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought333 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought333 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought333 instance = new Thought333 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought333 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought333 instance = new Thought333 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought333 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought333 instance = new Thought333 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought333 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought333 instance = new Thought333 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought333 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought333 instance = new Thought333 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought333 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought333 instance = new Thought333 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought333 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought333 instance = new Thought333 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought333 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought333 instance = new Thought333 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 750.9556096527291;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    double ld1 = 985.6117182447792;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ld1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 *= -1;
    fb0 = ld0 > ld1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[2][0] += fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(fd1, ld0, ld1, fd0);
}
    fd1 *= -1;
    ld0 = ld1 - fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 > ld0;
    ld1 *= -1;
    double ld2 = 6.015874961621649;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
    fb1 = !fb0;
    fb1 = ld1 < ld2;
    fb0 = fd0 > fd1;

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
    Thought lo0 = Thought105.getInstance();
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    boolean lb1 = true;
    ab2 = fd0 > fd1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, lb2, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb2, ab1);
}
    fd1 = fd0 - fd1;
    double ld3 = 856.8683102641112;
    Thought lo4 = Thought374.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld3, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
    ld3 = fd0 + fd1;

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
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ad1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[2][1] -= fd0;
    fd1 = ad1 + ad2;
    Thought lo0 = Thought38.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    ad3 = ad4 + fd0;
    fb1 = !fb0;
    Output.points[2][2] += fd1;
    double ld1 = 307.5059092545595;
    double ld2 = 60.46452009588693;
    ld1 = ld2 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 6.9796169802792996;
    Thought lo4 = Thought112.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[2][3] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ld2 = ld3 - ad1;
    Output.points[2][4] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
    Thought lo0 = Thought363.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought213.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(ab4, fb0, fb1, ab1);
}
    boolean lb2 = true;
    Thought lo3 = Thought251.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    ad3 = ad4 + fd0;
    double ld4 = 470.4963100557146;
    Thought lo5 = Thought210.getInstance(fd0, fd1, ld4, ad1, fb0, fb1, lb2, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld6 = 660.2099757916988;
    Thought lo7 = Thought332.getInstance(fo0, fo1, fo0, fo1);
    Output.points[2][5] -= ad1;
    boolean lb8 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ld4;
    fb1 = !lb2;
    lb8 = ab1 && ab2;
if(fo0 != null){
      ld6 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        ab3 = ab4 && fb0;
        boolean lb9 = true;
        }
if(fo0 != null){
      fo1 = fo0.m4();
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
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
        lb0 = !fb0;
    fb1 = fd1 < fd0;
        lb0 = fb0 && fb1;
    boolean lb1 = false;
    boolean lb2 = true;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = !lb1;
if(ao2 != null){
      lb2 = ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb3 = false;
    double ld4 = 837.6427714891968;
    lb2 = lb3 && fb0;
    Thought lo5 = Thought60.getInstance(ao3, ao4, fo0, fo1, fb1, lb0, lb1, lb2);
    ld4 *= -1;
    fd0 = fd1 + ld4;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
    fd1 = ad1 + ad2;
    Output.points[2][6] -= ad3;
    fb0 = ad4 < fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < ad1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = fd0 < fd1;
    Thought lo0 = Thought94.getInstance(ab3, ab4, fb0, fb1);
    boolean lb1 = false;
    boolean lb2 = true;
    lb1 = lb2 || ab1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        fd0 *= -1;
        fd1 *= -1;
        lb1 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
        Thought lo3 = Thought326.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
        Output.points[2][7] -= fd0;
        fd1 *= -1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
        double ld4 = 628.1914482522637;
if(ao1 != null){
          ao1.m1(ld4, fd0, fd1, ld4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld4, fd0);
}
        fd1 = ld4 + fd0;
        lb2 = ab1 || ab2;
        boolean lb5 = false;
        ab2 = fd1 > ld4;
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb6 = true;
        fd0 = fd1 + ld4;
        double ld7 = 461.47270700636193;
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
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought307.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m2(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        boolean lb1 = false;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(ao2 != null){
      ao2.m1(fd1, ad1, ad2, ad3);
}
    ab1 = ab2 && ab3;
    ad4 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
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
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    double ld0 = 283.8629129085255;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1);
}
    double ld1 = 781.8649305046036;
    fb1 = ld0 < ld1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
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
    boolean lb0 = true;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought36.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
    fd1 = fd0 + fd1;
    boolean lb3 = true;
    Thought lo4 = Thought35.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    if (lb0) {
        lb1 = !lb3;
        } else {
        ab1 = ab2 || ab3;
if(fo1 != null){
          fd0 = fo1.m3();
}
        ab4 = fd1 < fd0;
        for(int i0=0; i0<10; i0++){
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought309.getInstance(ad1, ad2, ad3, ad4);
        Thought lo1 = Thought218.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
        boolean lb2 = true;
        fb0 = ad3 > ad4;
        fb1 = lb2 && fb0;
        Output.points[2][8] -= fd0;
        fb1 = fd1 > ad1;
        lb2 = fb0 || fb1;
        boolean lb3 = true;
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    Thought lo5 = Thought323.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);

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
    ab1 = !ab2;
    Output.points[3][0] += ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(lb0, lb1, lb2, ab1);
}
    ad3 = ad4 + fd0;
    double ld3 = 300.9353124030557;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1, ab3, ab4, fb0, fb1);
}
    boolean lb4 = false;
    lb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld3, lb1, lb2, lb4, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 671.6850331746949;
    Output.points[3][1] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[3][2] -= ld0;
    fd0 = fd1 + ld0;
        fd0 = fd1 + ld0;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
    fd0 = fd1 + ld0;
    boolean lb2 = true;
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
if(ao2 != null){
      ld0 = ao2.m3();
}
    double ld3 = 587.9947061107102;
    lb2 = !fb0;
if(ao3 != null){
      ld3 = ao3.m3(fb1, lb1, lb2, fb0);
}
    fb1 = lb1 && lb2;
    Output.points[3][3] -= fd0;
    boolean lb4 = true;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fd1 = ad1 + ad2;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Output.points[3][4] -= ad3;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;

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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought181.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
    ab2 = fd1 > fd0;
    fd1 *= -1;
    double ld1 = 388.7565783649815;
    ab3 = ld1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, fd0, fd1);
}
    if (ab4) {
        ld1 = fd0 - fd1;
        fb0 = fb1 || ab1;
        ab2 = ab3 || ab4;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
        fd0 = fd1 - ld1;
        fd0 *= -1;
        Thought lo2 = Thought180.getInstance();
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, ab1, ab2);
}
        ab3 = ld1 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        boolean lb3 = false;
if(ao2 != null){
          ao1 = ao2.m4(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
        Thought lo4 = Thought104.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb3, ab1);
        double ld5 = 699.3038517996149;
        ab2 = ld1 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ab3 = fd1 < ld5;
if(ao2 != null){
          ao1 = ao2.m4(ld1, fd0, fd1, ld5);
}
        ab4 = ld1 > fd0;
        Output.points[3][5] -= fd1;
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
    Thought lo0 = Thought30.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo0 != null){
      ab1 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    double ld1 = 16.736524370407608;
if(ao1 != null){
      ao1.m3(ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought160.getInstance(ad4, fd0, fd1, ld1);
    boolean lb3 = false;
    boolean lb4 = true;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;
    fb1 = lb3 || lb4;
    Thought lo5 = Thought398.getInstance();
    boolean lb6 = true;
    boolean lb7 = true;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought187.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    Output.points[3][6] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb1 = lb0 || fb0;
    boolean lb2 = false;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb2 = !fb0;
    fd1 = fd0 + fd1;

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
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
    fd1 *= -1;
    boolean lb0 = false;
    Thought lo1 = Thought255.getInstance(fb0, fb1, lb0, ab1);
    double ld2 = 34.74031421325142;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought320.getInstance(fd0, fd1, ld2, fd0, lb0, ab1, ab2, ab3);
    fd1 = ld2 - fd0;
    ab4 = fd1 < ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld2 = fd0 - fd1;
    ab1 = ld2 < fd0;
    ab2 = fd1 > ld2;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = false;
    ab2 = ld2 > fd0;
    double ld5 = 293.0464531377974;
    Output.points[3][7] -= fd0;
    double ld6 = 693.1571367398145;

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
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    ad4 *= -1;
    fb0 = fd0 < fd1;
    if (fb1) {
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
        fd1 = ad1 + ad2;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
            fb0 = fb1 && fb0;
if(fo1 != null){
              ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
            double ld0 = 628.4410202305672;
}}
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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        ab1 = ab2 && ab3;
        ad1 = ad2 + ad3;
        double ld1 = 574.9660256033676;
        double ld2 = 17.85011710945569;
        boolean lb3 = false;
        double ld4 = 1.7966465158581022;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        fd0 = fd1 + ld1;
        lb3 = ld2 < ld4;
        ad1 = ad2 - ad3;
        Thought lo5 = Thought244.getInstance(ad4, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
        ab4 = fb0 && fb1;
        ld2 *= -1;
        ld4 *= -1;
        ad1 = ad2 + ad3;
        if (lb3) {
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
            boolean lb6 = true;
            ab3 = ad4 < fd0;
if(fo1 != null){
              ab4 = fo1.m2(fo0, fo1, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    double ld0 = 234.79563837951088;
    Output.points[3][8] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    double ld1 = 790.2778557492541;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld1 = fd0 - fd1;
    Output.points[4][0] -= ld0;
    double ld2 = 383.26494903198136;
    ld1 = ld2 + fd0;
    fb0 = fb1 || fb0;
    boolean lb3 = false;
    double ld4 = 964.1402608632038;
    fd0 *= -1;
    fb0 = fb1 || lb3;
    Output.points[4][1] -= fd1;
    boolean lb5 = true;
    lb5 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(lb3, lb5, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Thought lo0 = Thought399.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
        lb1 = fb0 && fb1;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    lb1 = !fb0;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fb0 = fd0 < fd1;
    double ld3 = 585.0386958829555;
    ld3 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    fb1 = !lb1;
    Output.points[4][2] -= ld3;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld3, ad1);
}
    lb2 = ad2 < ad3;
    ad4 = fd0 + fd1;

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
    boolean lb0 = false;
    if (lb0) {
        for(int i0=0; i0<10; i0++){
            Thought lo1 = Thought43.getInstance();
            fd1 = fd0 - fd1;
            Thought lo2 = Thought377.getInstance(ab1, ab2, ab3, ab4);
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
              fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
if(ao3 != null){
              ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
            fd1 = fd0 + fd1;
}}
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
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought171.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    ab1 = ab2 && ab3;
if(ao1 != null){
      ao1.m3();
}
    ab4 = ad4 < fd0;
    Thought lo1 = Thought107.getInstance(fb0, fb1, ab1, ab2);
    boolean lb2 = true;
    boolean lb3 = false;
    ab1 = fd1 > ad1;
    Output.points[4][3] -= ad2;
    ab2 = !ab3;
    ad3 = ad4 + fd0;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    fb0 = fb1 || lb0;
    lb1 = fb0 || fb1;
    boolean lb2 = true;
    Thought lo3 = Thought21.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
    boolean lb4 = false;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld5 = 843.7163403303231;
    boolean lb6 = false;
if(fo1 != null){
      fo1.m2(ld5, fd0, fd1, ld5);
}
    fd0 = fd1 - ld5;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0);
}
    fd1 *= -1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, lb4, lb6);
}
    fb0 = fb1 && lb0;
    lb1 = !lb2;
    double ld7 = 74.59808560425921;
    lb4 = !lb6;
    ld5 = ld7 - fd0;

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
    boolean lb0 = true;
    boolean lb1 = true;
    double ld2 = 861.9603641442566;
    fd0 = fd1 + ld2;
    fd0 *= -1;
    boolean lb3 = true;
    lb1 = lb3 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld4 = 501.13504268420525;
if(fo1 != null){
      fo1.m3(ld2, ld4, fd0, fd1, fb1, lb0, lb1, lb3);
}
    ld2 = ld4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought366.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 && lb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld4, fd0, fd1);
}
    Thought lo6 = Thought189.getInstance();
    double ld7 = 657.8671106443966;
if(fo0 != null){
      lb1 = fo0.m2(lb3, ab1, ab2, ab3);
}
    ld2 = ld4 - ld7;
    fd0 = fd1 - ld2;
    ld4 = ld7 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, ld4, ld7, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fd1, ld2, ld4, ld7, lb1, lb3, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
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
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought175.getInstance(ad4, fd0, fd1, ad1);
    Output.points[4][4] += ad2;
    Thought lo1 = Thought294.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    ad1 *= -1;
    Thought lo2 = Thought220.getInstance();
    double ld3 = 640.146826012823;
    double ld4 = 461.0900091245471;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    ld4 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld3 > ld4;
    fb1 = !fb0;
    Thought lo5 = Thought392.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    double ld6 = 15.940067386791288;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    Output.points[4][5] += ld3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld4, ld6, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Thought lo7 = Thought368.getInstance(fo1, fo0, fo1, fo0, fd1, ld3, ld4, ld6);
    fb0 = fb1 || fb0;

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
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = !fb0;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    double ld1 = 561.2261220697902;
    ab4 = ad4 < fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = !fb0;
    boolean lb3 = false;
    fd1 *= -1;
if(fo1 != null){
      ld1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld1;
    double ld4 = 938.5575210050905;
    double ld5 = 356.43851470580586;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, ld5, ad1, ad2, ad3);
}
    fb0 = ad4 < fd0;
    fb1 = !lb0;

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
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
    Output.points[4][6] += fd0;
    boolean lb0 = false;
    double ld1 = 844.2546138568123;
if(ao1 != null){
      lb0 = ao1.m2();
}
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        double ld2 = 631.8721838002223;
        fb0 = fb1 || lb0;
        Output.points[4][7] += ld1;
        fd0 = fd1 - ld2;
        Thought lo3 = Thought335.getInstance(fb0, fb1, lb0, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought271.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = ad4 < fd0;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    if (fb1) {
        lb1 = fd1 < ad1;
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
        boolean lb2 = true;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
        boolean lb3 = true;
        ad4 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          ao3.m2(lb3, lb1, fb0, fb1);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb2, lb3, lb1, fb0);
}
if(ao3 != null){
          fb1 = ao3.m2(fd0, fd1, ad1, ad2, lb2, lb3, lb1, fb0);
}
        if (fb1) {
            ad3 *= -1;
            for(int i0=0; i0<10; i0++){
                lb2 = lb3 || lb1;
if(ao4 != null){
                  fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb2, lb3, lb1);
}
if(ao4 != null){
                  ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
                  ad4 = ao3.m3(fd0, fd1, ad1, ad2);
}
                Thought lo4 = Thought146.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}}}
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
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        lb0 = ab1 && ab2;
if(ao1 != null){
          ao1.m1();
}
        ab3 = fd0 > fd1;
        ab4 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(ao2 != null){
          ao2.m3(fb0, fb1, lb0, ab1);
}
        Output.points[4][8] -= fd1;
        ab2 = ab3 || ab4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
        fd0 = fd1 + fd0;
        boolean lb1 = false;
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
        lb1 = fd1 < fd0;
        Thought lo2 = Thought311.getInstance(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
        double ld3 = 552.077931240627;
        Thought lo4 = Thought289.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
        lb0 = fd0 > fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][0] -= ad1;
    ab1 = ad2 > ad3;
    ad4 *= -1;
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = ab4 || fb0;
    fb1 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ab1 = ab2 || ab3;
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ab3 = !ab4;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought253.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = !lb0;
    ab1 = fd0 < fd1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m2();
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
    double ld0 = 806.1521688142794;
    fb0 = fd0 > fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    fd0 = fd1 + ld0;
    Thought lo2 = Thought173.getInstance(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    double ld4 = 176.96035729337345;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld4 *= -1;
    fb0 = !fb1;
        double ld6 = 132.9088530174116;
    lb1 = ld6 > fd0;

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
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    double ld0 = 187.31544488424927;
    fd0 = fd1 - ld0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought233.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    double ld3 = 698.5064884330031;
    ld0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld0, ld3);
}
    fd0 = fd1 - ld0;
    boolean lb4 = false;
    boolean lb5 = true;
    ld3 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0);
}
if(fo0 != null){
      lb5 = fo0.m2();
}
    boolean lb6 = false;
    ld3 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb6, fb0, fb1, lb1);
}
    Output.points[5][1] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld0, lb4, lb5, lb6, fb0);
}
    Thought lo7 = Thought118.getInstance(ld3, fd0, fd1, ld0, fb1, lb1, lb4, lb5);

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
    Thought lo0 = Thought397.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[5][2] -= fd1;
    fb1 = fd0 > fd1;
    boolean lb2 = false;
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
}
